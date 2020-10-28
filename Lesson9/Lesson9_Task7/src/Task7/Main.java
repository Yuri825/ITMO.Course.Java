// Написать метод, который в каталоге ищет файлы удовлетворяющие любому
//критерию, который задается с помощью java.util.function.Function

package Task7;

import java.io.File;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Main
{

    public static void main(String[] args)
    {
    Predicate<String> predicate = searchingFile -> searchingFile == "file1.txt";

        // Объявляем коллекцию для хранения файлов, в названии которых есть искомая строка
        ArrayList<String> listFilesCont = new ArrayList<>();

        // Получаем список файлов в заданной папке
        File folder = new File("D:\\ИТМО\\Java\\Labs\\Lesson9\\Lesson9_Task7\\SearcingFolder");

        // Запускаем цикл по массиву названий файлов
        for (File file : folder.listFiles())
        {
            // Если в названии файла содержится искомая строка ("first"), добавляем ее в коллекцию
//            System.out.println(file.getName());
            System.out.println(predicate.test(file.getName()));
            if(predicate.test(file.getName()))
            {
                System.out.println(file.getName());
            }
        }
    }
}
