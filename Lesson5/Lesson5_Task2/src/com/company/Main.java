// Написать метод, который проверяет является ли слово палиндромом.

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String str = in.nextLine();

        if(isPalindrome(str))
        {
            System.out.println("Палиндром");
        }
        else
        {
            System.out.println("Не палиндром");
        }
    }

    public static Boolean isPalindrome(String string) {
        String stringReverse = new StringBuilder(string).reverse().toString();
        if (string.equals(stringReverse))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
