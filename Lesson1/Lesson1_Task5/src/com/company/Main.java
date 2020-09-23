// Вычислить N-е число Фибоначчи .

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число N для вывода числа Фибоначчи: ");
        int num = in.nextInt();

        int[] array = new int[num];

        int one = 0;
        int two = 1;

        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i < num; i++)
        {
            int current = one + two;
            array[i] = current;
            one = two;
            two = current;
        }

           System.out.println("N-е число Фибоначчи: " + array[num-1]);
    }
}
