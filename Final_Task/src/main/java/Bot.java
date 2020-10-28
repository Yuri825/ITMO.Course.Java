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
import java.util.ArrayList;
import java.util.List;

public class Bot extends TelegramLongPollingBot
{
    public static void main(String[] args)
    {
        // Инициализируем API
        ApiContextInitializer.init();

        // Создаем объект для телеграмбота
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();

        // регистрируем бота
        try
        {
            telegramBotsApi.registerBot(new Bot());
        } catch (TelegramApiRequestException e)
        {
            e.printStackTrace();
        }
    }

    // создаем метод, в котором описывается, что бот будет возвращать на наши сообщения
    public void sendMsg(Message message, String text)
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
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    // переопределяем метод для према сообщений через LongPool
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
                        sendMsg(message, "Такой город не найден");
                    }
            }
        }
    }

    // метод, определяющий клавиатуру под панелью
    public void setButtons (SendMessage sendMessage)
    {
        // создаем клавиатуру
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        // устанавливаем разметку для клавиатуры и связываем сообщение с клавиатурой
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        // параметр, который устанавливает, выводить сообщение мы будем определенному пользователю или всем пользователям
        replyKeyboardMarkup.setSelective(true);
        // подгонка клавиатуры под определенное количество кнопок
        replyKeyboardMarkup.setResizeKeyboard(true);
        // параметр, указывающий, скрывать клавиатуру после нажатия кнопки, или нет(false - не скрывать)
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        // список кнопок
        List<KeyboardRow> keyboardRowList = new ArrayList<>();
        // инициализируем первую строчку клавиатуры
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        // помещаем в инициализированную строку две кнопки
        keyboardFirstRow.add(new KeyboardButton("Здравствуйте"));
        keyboardFirstRow.add(new KeyboardButton("До свидания"));

        // добавляем все строчки клавиатуры в список (в нашем случае она одна)
        keyboardRowList.add(keyboardFirstRow);
        replyKeyboardMarkup.setKeyboard(keyboardRowList);
    }

    // переопределяем метод и задаем имя бота
    public String getBotUsername()
    {
        return "MyTestWeather333_Bot";
    }

    // переопределяем метод и задаем токен бота
    public String getBotToken()
    {
        return "1275797009:AAFT2LBAKTWpV9EKdr_O0h-V0V_IIjrP61U";
    }
}
