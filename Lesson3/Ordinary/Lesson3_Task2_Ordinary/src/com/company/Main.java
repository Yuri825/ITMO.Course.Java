// Реализовать сортировку выбором.
//Шаги алгоритма:
//1. находим номер минимального значения в текущем списке
//2. производим обмен этого значения со значением первой неотсортированной
//позиции (обмен не нужен, если минимальный элемент уже находится на данной
//позиции)
//3. теперь сортируем хвост списка, исключив из рассмотрения уже
//отсортированные элементы.

package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // Метод для создания массива
    public static int [] getArr ()
    {
        // Блок ввода размера массива
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int num = in.nextInt();

        // Инициализируем массив
        int [] arr = new int[num];

        // Заполняем массив
        for (int i = 0; i < num; i++)
        {
            int elem = (int) Math.round(Math.random()*100);
            arr[i] = elem;
        }

        return arr;
    }

    public static void sortingChoice (int [] arr)
    {
        // Выводим на экран массив до сортировки
        System.out.println(Arrays.toString(arr));

        // Запускаем цикл по массиву
        for(int i = 0; i < arr.length; i++)
        {
            // Объявляем переменную list и инициализируем её текущим значением i
            int least = i;
            // Запускаем второй цикл по массиву на шаг вперед (j=i+1)
            for (int j = i + 1; j < arr.length; j++)
            {
                // Если элемент справа меньше элемента слева, в переменную least записываем его индекс
                if (arr[j] < arr[least])
                {
                    least = j;
                }
            }
            // Меняем местами элементы, если левый меньше правого
            int tmp = arr[i];
            arr[i] = arr[least];
            arr[least] = tmp;
        }

        // Выводим на экран массив после сортировки
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
       int [] arr = getArr();
        sortingChoice(arr);
    }
}
