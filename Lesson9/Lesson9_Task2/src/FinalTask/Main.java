// Написать метод, который записывает в файл строку, переданную параметром

package FinalTask;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException
    {
        writeToFile("Приходит осень, золотит Венцы дубов.", "filename.txt");
    }

    // Метод для записи. Первый параметр - записываемая строка, второй - файл, в который записываем
    public static void writeToFile (String str, String file) throws IOException {
        // Объявляем экземпляр класса File, передаем в параметр файл, в который будем записывать
        File text = new File(file);

        // Объявляем экземпляр класса FileOutputStream для записи байтов в класс. Пераметром передаем текст
        FileOutputStream fileOutputStream = new FileOutputStream(text);

        // Записываем строку
        fileOutputStream.write(str.getBytes());
        System.out.println("Выролнено");
    }
}
