// Написать метод возвращающий массив из четных элементов массива, переданного в качестве параметра.

package com.company;

import java.util.ArrayList;

public class Main {

    // Объявляем метод для выбора четных чисел из массива
    static int[] evenNumbers (int[]arr)
    {
        // Объявляем коллекцию для сбора четных чисел
        ArrayList<Integer> even = new ArrayList<Integer>();

        // Запускаем цикл по проверяемому массиву
        for (int i = 0; i < arr.length; i++)
        {
            // Если число четное, то вносим его в коллекцию
            if (arr[i] % 2 == 0)
            {
                even.add(arr[i]);
            }
        }

        // Объявляем массив для четных чисел с длиной коллекции с четными числами
        int[]evenArray = new int[even.size()];

        // Запускаем цикл по длине коллекции с четными числами и добавляем в массив элементы коллекции
        for (int i = 0; i < even.size(); i++)
        {
            evenArray[i] = even.get(i);
        }

        return evenArray;
    }

    public static void main(String[] args) {
        // Задаем массив для проверки
        int [] arr = new int[] {1, 2, 3, 4, 5};

        System.out.println("Четные элементы переданного массива: ");
        // Запускаем цикл по массиву четных чисел проверяемого массива(результату метода evenNumbers())
        // И выводим на экран его элементы - четные числа
	    for (int i = 0; i < evenNumbers(arr).length; i++)
        {
            System.out.println(evenNumbers(arr)[i]);
        }
    }
}
