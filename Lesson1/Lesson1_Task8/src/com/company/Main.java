// Дан массив и число K. Найдите первые K самых часто встречающихся
//элементов.

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // объявляем массив:
        int[] array = new int[] {1, 2, 3, 1, 2, 4, 3, 2};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите K: ");
        int num = scanner.nextInt();


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
            // Останавливаем, если count == K
            if (count == num)
            {
                // Выводим на консоль и выходим из цикла
                System.out.println("первые K самых часто встречающихся элементов : " + array[i]);
                break;
            }
            // Возвращаем переменной count значение 0
            count = 0;
        }
    }
}