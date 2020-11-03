import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import org.telegram.telegrambots.exceptions.TelegramApiRequestException;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import static org.telegram.telegrambots.logging.BotLogger.log;

public class Bot extends TelegramLongPollingBot
{

    public static void main(String[] args) throws SQLException {
        // Инициализируем API
        ApiContextInitializer.init();

        // Создаем объект для телеграмбота
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();

        // регистрируем бота
        try
        {
            telegramBotsApi.registerBot(new Bot());
//            telegramBotsApi.registerBot(Bot.getBot());
        } catch (TelegramApiRequestException e)
        {
            e.printStackTrace();
        }


        // РАБОТА С БАЗОЙ ДАННЫХ
        Statement statement = null;
        ResultSet resultSet = null;

        String value = "";
        String SQL = "";

        Connection connection = null;
        String URL_BD = "jdbc:sqlserver://localhost:1433;instanceName=DESKTOP-F6G36U8\\SQLEXPRESS;databaseName=BASA";
        String USERNAME = "NT Service\\MSSQLSERVER";
        String PASSWORD = "";

//        try
//        {
//            System.out.println("Устанавливаем соединение с базой данных");
//            connection = DriverManager.getConnection(URL_BD);
//
//            SQL = "SELECT*\n" +
//                    "FROM [dbo].[Table_1]";
//
//            statement = connection.createStatement();
//            resultSet = statement.executeQuery(SQL);
//
//            while (resultSet.next())
//            {
//                value = resultSet.getString("Name");
//                System.out.println(value);
//            }
//
//
//        } catch (SQLException throwables)
//        {
//            throwables.printStackTrace();
//        }
//        finally
//        {
//            connection.close();
//            System.out.println("закрыто соединение с базой");
//        }
    }


    // создаем метод, в котором описывается, что бот будет возвращать на наши сообщения
    public synchronized void sendMsg(Message message, String text)
    {

        // инициализируем отправляемые сообщения, создаем объект sendMessage
        SendMessage sendMessage = new SendMessage();

        // включаем возможность разметки
        sendMessage.enableMarkdown(true);

        // Чтобы бот понимал, в какой чат отвечать, устанавливаем ID чата
        sendMessage.setChatId(message.getChatId().toString());

        // чтобы бот понимал, на какое конкретно сообщение нам надо отвечать, определяем ID сообщения
        sendMessage.setReplyToMessageId(message.getMessageId());

        // устанавливаем этому сообщению текст, который отправляли в этот метод (из параметра)
        sendMessage.setText(text);

        // непосредственно отправка сообщения
        try
        {
            // чтобы клавиатура заработала, добавляем кнопку в отправку сообщений и связываем ее с сообщением
            setButtons(sendMessage);

            // сообщение с ответом
            execute(sendMessage);
        }
        catch (TelegramApiException e)
        {
//            e.printStackTrace();
            log(Level.SEVERE, "Exception: ", e.toString());
        }
    }


    // Метод для приема сообщений
    // параметр update содержит сообщение от пользователя
    public void onUpdateReceived(Update update)
    {
        // Создаем модель
        Model model = new Model();

        // Создаем объект message и помещаем туда текст, полученный из объекта update
        Message message = update.getMessage();

        // если сообщение не содержит null и оно сдержит текст
        if(message != null && message.hasText())
        {
            switch (message.getText())
            {
                // устанавливаем ответы на введенные слова
                case "Здравствуйте":
                    sendMsg(message, "Здравствуйте. В каком городе Вы бы хотели узнать погоду?");
                    break;
                case "До свидания":
                    sendMsg(message, "Всего хорошего");
                    break;
                default:
                    // Если введенный текст не "Здравствуйте" и не "До свидания", то бот отправит сообщение
                    // в которое вставит полученные от погодного сервиса данные (если введенный город существует)
                    try {
                        sendMsg(message, Weather.getWeather(message.getText(), model));
                    } catch (IOException e) {
                        // если такого города нет, отправит, что город не найден
                        sendMsg(message, "Такой город не найден");
                    }
            }
        }
    }


    // метод, определяющий клавиатуру под панелью
    public synchronized void setButtons(SendMessage sendMessage) {

        // Создаем клавиуатуру
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        // устанавливаем разметку для клавиатуры и связываем сообщение с клавиатурой
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        // параметр, который устанавливает, выводить сообщение мы будем определенному пользователю или всем пользователям
        replyKeyboardMarkup.setSelective(true);
        // подгонка клавиатуры под определенное количество кнопок
        replyKeyboardMarkup.setResizeKeyboard(true);
        // параметр, указывающий, скрывать клавиатуру после нажатия кнопки, или нет(false - не скрывать)
        replyKeyboardMarkup.setOneTimeKeyboard(false);


        // Создаем список строк клавиатуры
        List<KeyboardRow> keyboard = new ArrayList<>();

        // Первая строчка клавиатуры
        KeyboardRow keyboardFirstRow = new KeyboardRow();

        // Добавляем кнопки в первую строчку клавиатуры
        keyboardFirstRow.add(new KeyboardButton("Здравствуйте"));
        keyboardFirstRow.add(new KeyboardButton("До свидания"));

        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardFirstRow);
//        keyboard.add(keyboardSecondRow);

        // и устанваливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
    }

    public String getBotUsername()
    {
        return "MyTestWeather333_Bot";
    }

    public String getBotToken()
    {
        return "1275797009:AAFT2LBAKTWpV9EKdr_O0h-V0V_IIjrP61U";
    }


}
