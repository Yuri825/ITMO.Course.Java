// Напишите метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано
//цензурой]».

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Блок ввода
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = in.nextLine();

        // Вывод результата
        System.out.println(getCensor(str));

    }

    public static String getCensor (String str)
    {
        String str1 = str.replaceAll("бяка", "[вырезано цензурой]");
        return str1;
    }

}
