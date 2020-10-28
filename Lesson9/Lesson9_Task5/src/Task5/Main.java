// Написать метод, который в каталоге ищет файлы, в имени которых содержится
//определенная строка, и который возвращает список имен таких файлов.

package Task5;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException
    {
        // Объявляем коллекцию для хранения файлов, в названии которых есть искомая строка
        ArrayList<String> listFilesCont = new ArrayList<>();

        // Получаем список файлов в заданной папке
        File folder = new File("D:\\ИТМО\\Java\\Labs\\Lesson9\\Lesson9_Task5\\folderForSearching");

        // Запускаем цикл по массиву названий файлов
        for (File file : folder.listFiles())
        {
            // Если в названии файла содержится искомая строка ("3"), добавляем ее в коллекцию
            if(file.getName().contains("il"))
            {
                listFilesCont.add(file.getName());
            }
            
        }

        // Выводим список файлов, в которых содержится строка "второй"
        for(int i = 0; i < listFilesCont.size(); i++)
        {System.out.println("Список файлов, в названии которых содержится искомая строка: " + "\n" + listFilesCont.get(i));}

    }
}
