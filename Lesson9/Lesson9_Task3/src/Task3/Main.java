// Используя решение 1 и 2, напишите метод, который склеивает два текстовых
//файла один.

package Task3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main
{

    public static void main(String[] args) throws IOException {
        concatFiles("file1.txt", "file2.txt", "file3.txt");
    }


        public static void concatFiles (String file1, String file2, String file3) throws IOException {
        // объявляем переменную для побайтового считывания из файла
        String line1 = null;
        String line2 = null;

        // Объявляем коллекции для хранения строк
            ArrayList<String> list1 = new ArrayList<>();
            ArrayList<String> list2 = new ArrayList<>();
            ArrayList<String> list3 = new ArrayList<>();

        // инициализируем два объекта для побайтового считывания информации с файла
            FileInputStream fis1 = new FileInputStream(file1);
            FileInputStream fis2 = new FileInputStream(file2);

            // инициализируем объекты для считывания символьного потока из байтового
            // и добавляем кодировку для возможности чтения кириллицы
            InputStreamReader isr1 = new InputStreamReader(fis1, "UTF-8");
            InputStreamReader isr2 = new InputStreamReader(fis2, "UTF-8");

            // инициализируем объект для считывания строки из символьного потока
            BufferedReader buf1 = new BufferedReader(isr1);
            BufferedReader buf2 = new BufferedReader(isr2);

            // добавляем в список list1 текст из первого файла
            while((line1=buf1.readLine()) != null)
            {
               list1.add(line1);
            }

            // добавляем в список list2 текст из второго файла
            while ((line2= buf2.readLine()) != null)
            {
                list2.add(line2);
            }

            // Объединяем списки
            list1.addAll(list2);

            // Записываем в третий файл строки из первого и второго файлов
            FileOutputStream fos = new FileOutputStream(file3);
            for (int i = 0; i < list1.size(); i++)
            {
                fos.write(list1.get(i).toString().getBytes());

            }
            System.out.println("Выполнено");

        }


}
