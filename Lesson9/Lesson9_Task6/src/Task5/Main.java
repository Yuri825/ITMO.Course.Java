// Написать метод, который в каталоге ищет текстовые файлы, в которых содержится
//определенная строка, и который возвращает список имен таких файлов

package Task5;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException
    {
        // Объявляем коллекцию для хранения имен файлов

        // коллекция для имен всех файлов
        ArrayList<String> listFiles = new ArrayList<>();
        // Коллекция для временного хранения текста файла
        ArrayList<String> listText = new ArrayList<>();
        // Коллекция для хранения файлов, в которых есть искомая строка
        ArrayList<String> listFilesCont = new ArrayList<>();

        // Получаем список файлов в заданной папке
        File folder = new File("D:\\ИТМО\\Java\\Labs\\Lesson9\\Lesson9_Task5\\folderForSearching");

        // Запускаем цикл по массиву названий файлов
        for (File file : folder.listFiles())
        {
            // Добавляем названия в коллекцию
//            listFiles.add(file.getName());

            // Читаем содержимое файлов
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

                // Объявляем переменную
                String line;

                // считываем побайтово
                while ((line = reader.readLine()) != null)
                {
                    // добавляем во временную коллекцию listFilesCont
                   listText.add(line);

                   // если в коллекции есть искомая строка, добавляем название файла в коллекцию
                    if(line.contains("первый"))
                    {
//                        System.out.println(file.getName());
                        listFilesCont.add(file.getName());
                    }
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

        // Выводим список файлов, в которых содержится строка "второй"
        for(int i = 0; i < listFilesCont.size(); i++)
        {System.out.println("Список файлов, в которых содержится искомая строка: " + "\n" + listFilesCont.get(i));}

    }
}
