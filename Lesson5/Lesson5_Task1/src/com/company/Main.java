// Написать метод для поиска самой длинной строки.

package com.company;

public class Main {

    public static void main(String[] args)
    {
        String string1 = "abcd";
        String string2 = "abcdefgh";
        getLength (string1, string2);

    }

   static void getLength(String str1, String str2)
    {
        String[] words1 = str1.split("");
        int count1 = 0;
        for (String word : words1)
        {
            count1++;
        }

        String[] words2 = str2.split("");
        int count2 = 0;
        for (String word : words2)
        {
            count2++;
        }

        if (count1 > count2)
        {
            System.out.println("Самая длинная строка: " + str1);
        }
        else if (count1 < count2)
        {
            System.out.println("Самая длинная строка: " + str2);
        }
        else
        {
            System.out.println("Строки равны");
        }
    }
}
