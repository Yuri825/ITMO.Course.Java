// Написать метод, который читает текстовый файл и возвращает его в виде списка
//строк

package FinalTask;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        try (FileReader reader = new FileReader("filename.txt"))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1)
            {
                System.out.print((char)c);
            }
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }

    }
}
