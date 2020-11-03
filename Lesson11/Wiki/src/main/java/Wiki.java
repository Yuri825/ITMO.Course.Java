// Написать программу, которая с консоли считывает поисковый запрос, и выводит
//результат поиска по Википедии.

import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Scanner;

public class Wiki
{
    public static void main(String[] args) throws IOException
    {

        // в переменную baseURL записываем протокол и доменное имя
        String baseURL = "https://en.wikipedia.org/w/api.php?action=query&list=search&format=json&srsearch=\"";

        // считываем запрос
        Scanner in = new Scanner(System.in);
        System.out.println("Введите запрос: ");
        // в переменную query записываем строку запроса, которую нужно добавить к домену
        String query = in.nextLine();

        // генерация запроса
        String encodeStr = null;
        try
        {
            encodeStr = URLEncoder.encode(query, "UTF-8");

        } catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }

        // формируем URL строку
        String resultURL = baseURL + encodeStr + "\"";
        // вывод сгенерированного запроса на экран
        System.out.println(resultURL);


        // запрос к серверу

        // создаем
        URL url = new URL(resultURL);

        // открываем соединение
        URLConnection urlConnection = url.openConnection();
        String line;

        // получаем InputStream
        InputStream inputStream = urlConnection.getInputStream();
        InputStreamReader reader = new InputStreamReader(inputStream);
        // записываем полученные данные в BufferedReader
        BufferedReader bufferedReader = new BufferedReader(reader);

        // выводим на экран полученные от сервера данные
        String sumline = "";
        while ((line = bufferedReader.readLine()) != null)
        {
            sumline += line;
        }
        System.out.println("первоначальная полученная строка в формате JSON: \n" + sumline + "\n");

        // создаем JSON объект и параметром задаем полученную от сервиса строку в JSON формате
        JSONObject object = new JSONObject(sumline);

        // получаем объект, который вложен в объект object
         JSONObject queryObj = object.getJSONObject("query");

         // получаем массив, который вложен в объект queryObj
        JSONArray jsonArray = queryObj.getJSONArray("search");

        // проходим по массиву и выбираем нужный нам параметр по ключу "title"
        System.out.println("данные строки title, полученные от сервера: ");
        for (int i = 0; i < jsonArray.length(); i++)
        {
            JSONObject jsonObject1 = jsonArray.getJSONObject(i);

            System.out.println(jsonObject1.get("title"));
        }
    }
}
