import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

// создаем класс погода
public class Weather
{
    // 81f42b4467e9c121fc9ac4fc8040e756
    // http://api.openweathermap.org/data/2.5/weather?q=London&appid=81f42b4467e9c121fc9ac4fc8040e756
    // http://api.openweathermap.org/data/2.5/weather?q=London&units=metric&appid=81f42b4467e9c121fc9ac4fc8040e756

    // метод, в него мы передаем наше сообщение и модель
    public static String getWeather (String message, Model model) throws IOException {
        // класс URL для получения данных от погодного интернет сервиса. Парметром задаем URL адрес
        // с токеном, полученным при регистрации на сервисе
        URL url = new URL("http://api.openweathermap.org/data/2.5/weather?q=" + message + "&units=metric&appid=81f42b4467e9c121fc9ac4fc8040e756");

        // читаем пришедшее от сервиса сообщение
        Scanner in = new Scanner((InputStream) url.getContent());
        // создаем переменную, в которую будем помещать результат
        String result = "";
        // циклом пробегаем по потоку, считываем данные и добавляем в переменную result
        while (in.hasNext())
        {
            result += in.nextLine();
        }

        // создаем JSON объект и параметром задаем полученную от сервиса строку в JSON формате
        JSONObject object = new JSONObject(result);
        // в нашу модель вытаскиваем из объекта название города
        model.setName(object.getString("name"));
        // из общего объекта достаем встроенный в него объект "main"
        JSONObject main = object.getJSONObject("main");
        // достаем из него температуру и в ставляем в нашу модель
        model.setTemp(main.getDouble("temp"));
        // достаем влажность и вставляем в модель
        model.setHumidity(main.getDouble("humidity"));

        // т.к. состояние погоды находится в JSON файле в массиве, создаем массив
        JSONArray getArray = object.getJSONArray("weather");
        // запускаем цикл по этому массиву
        for (int i = 0; i < getArray.length(); i++)
        {
            // создаем объект, в который кладем объекты, которые содержит итерируемый массив
            JSONObject obj = getArray.getJSONObject(i);
          //  model.setIcon((String) obj.get("icon"));
            // затем из объекта obj берем нужные нам значения (в нашем случае main, то есть облачность) и кладем в модель
            model.setMain((String)obj.get("main"));
        }

        // формируем строку ответа
        return "Город: " + model.getName() + "\n" +
                "Температура: " + model.getTemp() + " C" + "\n" +
                "Main: " + model.getMain() + "\n" +  
                "Влажность: " + model.getHumidity() + "%";
    }
}
