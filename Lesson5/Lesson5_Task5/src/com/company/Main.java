// Напишите метод, который инвертирует слова в строке. Предполагается, что в
//строке нет знаков препинания, и слова разделены пробелами

package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        // Тестовая строка
        String testString = "This is a test string";

        // разбиваем строку testString в массив по разделителю "пробел"
        String[] testStringToArr = testString.split(" ");

        // и запускаем цикл по этому полученному массиву
        for (int i = 0; i < testStringToArr.length; i++)
        {
            StringBuffer buffer = new StringBuffer(testStringToArr[i]);
            buffer.reverse();
            testStringToArr[i] = buffer.toString();
        }

        // Преобразуем обратно массив строк в строку
      String inverttestString = String.join(" ", testStringToArr);

        // Вывод ответа на экран
        System.out.println(inverttestString);

    }
}
