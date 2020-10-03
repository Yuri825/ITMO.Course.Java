// Имеются две строки. Найти количество вхождений одной (являющейся
//подстрокой) в другую.

package com.company;

public class Main {

    public static void main(String[] args) {
        // счетчик
        int count = 0;

        // основная строка
        String string1 = "xxxabcdabcdhgxkjahsx";
        // подстрока
        String string2 = "abcd";
        // переменная для начала поиска методом indexOf()
        int a = 0;

        // Цикл по первой
        for (int i = 0; i < string1.length(); i++)
        {
            // если находит подстроку, увеличиваем count и передвигаем начало поиска (a)
            if (string1.indexOf(string2, a) != -1)
            {
                count++;
                a = string1.indexOf(string2, a) + 1;

            }
        }
        System.out.println(count);

    }
}
