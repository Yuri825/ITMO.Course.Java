// Дан массив чисел. Найдите первое уникальное в этом массиве число.
//Например, для массива [1, 2, 3, 1, 2, 4] это число 3.

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // объявляем массив:
	    int[] array = new int[] {1, 2, 3, 1, 2, 4, 3, 2, 4, 5};


	    // объявляем переменную для подсчета количества одинаковых элементов
	    int count = 0;

	    // Запускаем первый цикл по длине массива
	    for (int i = 0; i < array.length; i++)
        {
            // Запускаем второй цикл по длине этого же массива
            for (int j = 0; j < array.length; j++)
            {
                // Сравниваем числа в массиве (уникальное число будет равно само себе, то есть одно совпадение будет)

                if (array[i] == array[j])
                {
                    count++;
                }
            }
            // Если совпадений больше, count будет больше 1
            if (count == 1)
            {
                // Выводим на консоль и выходим из цикла
                System.out.println("Первое уникальное число массива: " + array[i]);
                break;
            }
            // Возвращаем переменной count значение 0
            count = 0;
        }
    }
}
