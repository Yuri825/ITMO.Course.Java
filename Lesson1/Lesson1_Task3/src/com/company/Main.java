//Заполните массив случайным числами и отсортируйте его.
//Используйте сортировку пузырьком , сортировку выбором или сортировку
//вставками .

package com.company;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int number;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число - количество элементов в массиве: ");
        number = in.nextInt();
	    double array [] = new double[number];

	    // Заполняем массив целыми числами от 1 до 10
	    for (int i = 0; i < number; i++)
        {
            array[i] = Math.round(Math.random() * 10);
        }

	    //
	    for (int i = 0; i < array.length; i++)
        {
            System.out.print("до сортировки: " + array[i] + "\n");
        }

	    // Запускаем первый цикл, прокрутится столько
        //, сколько элементов в массиве
	    for (int j = 0; j < array.length; j++)
        {
            // Запускаем второй цикл, проверяем попарно
            for (int i = 0; i < array.length-1; i++)
            {
                double a = array[i];
                double b = array[i+1];
                if(array[i] > array[i+1])
                {
                    array[i] = b;
                    array[i+1] = a;
                }
            }
        }

    // Выводим элементы отсортированного цикла
        for (int i = 0; i < array.length; i++)
        {
            System.out.print("после сортировки: " + array[i] + "\n");
        }

    }
}
