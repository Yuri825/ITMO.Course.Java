// Перепишите метод, проверяющий слово на палиндромность с помощью
// Stringbuilder. В таком методе должно быть 1-3 строки.

package Task2;

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

    public static Boolean isPalindrome(String string)
    {
        String stringReverse = new StringBuilder(string).reverse().toString();
        return string.equals(stringReverse);
    }
}

