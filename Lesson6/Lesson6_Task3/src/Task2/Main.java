//  Используя Stringbuilder, читайте слова с консоли и затем склейте их в одну строку через
//  запятую.

package Task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        stringJoin();
    }

    public static void stringJoin()
    {
        StringBuilder stringBuilder = new StringBuilder();
        // Блок ввода строки
        readFromScreen(stringBuilder);
        readFromScreen(stringBuilder);
        readFromScreen(stringBuilder);

        System.out.println(stringBuilder);
    }

    // Метод для считывания слова с экрана и добавления его в StringBuilder
    public static StringBuilder readFromScreen (StringBuilder stringBuilder)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово: ");
        stringBuilder.append(in.nextLine() + ",");
        return stringBuilder;
    }
}
