// Написать метод, который проверяет, входит ли в сортированный массив
//заданный элемент или нет.
//Используйте перебор и двоичный поиск для решения этой задачи.
//Сравните время выполнения обоих решений для больших массивов (например, 100000 элементов).

package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    // Метод для создания массива
    static int [] getArr ()
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

        // Сортируем массив
        Arrays.sort(arr);

        return arr;
    }

    // Метод для поиска совпадений перебором. Параметрами задаем массив и число, которое будем искать
    static void checkEnumeration (int [] arr, int num)
    {
        // Объявляем булевую переменную
        boolean flag = false;

        // Запускаем цикл по массиву
        for (int j : arr) {
            // Если в массиве есть искомое число, присваиваем переменной flag "true" и выходим из цикла
            if (j == num) {
                flag = true;
                break;
            }
        }

        // Выводим сообщение в соответствии с значением переменной flag
        if (!flag)
        {
            System.out.println("Совпадений нет (перебором)");
        }
        else
        {
            System.out.println("Сопадения есть (перебором)");
        }
    }


    // Метод для поиска совпадений двоичным поиском. Параметрами задаем массив и число, которое будем искать
    static void checkBinary(int[]arr, int num)
    {
        // В переменные first и last записываем индекс первого и последнего элемента в массиве
        int first = 0;
        int last = arr.length-1;

        // Объявляем булевую переменную
        boolean flag = false;

        // В переменную half записываем середину между первым и последним индексами
        int half;
        half = (first + last) / 2;

        // Запускаем цикл, пока элемент массива с индексом, равным середине выборки не равен искомому числу и
        // индекс первого элемента массива меньше или равен индексу последнего элемента
        while (arr[half] != num && first <= last)
        {
            // Если элемент массива с индексом "середина" , больше искомого числа, в переменную last записываем
            // значение half-1
            if(arr[half] > num)
            {
                last = half - 1;
            }
            else
            {
                // Если средний элемент меньше искомого числа, в переменную first записываем half+1
                first = half + 1;
            }

            // Определяем новую середину
            half = (first + last)/2;
        }

        // Вывод ответа на экран.
        if (first <= last)
        {
            System.out.println("совпадения есть (двоичный поиск)");
        }
        else
        {
            System.out.println("совпадений нет (двоичный поиск)");
        }
    }


    public static void main(String[] args)
    {
        // Объявляем и инициализируем массив
        int[] arr = getArr();

        // Запускаем цикл для вывода массива на экран
        for (int j : arr) {
            System.out.print(j + ", ");
        }

        // Запрос на ввод искомого числа
        System.out.println("\n" + "Введите число, которое хотите проверить на наличие в массиве: ");
        Scanner in = new Scanner(System.in);
        int checkNum = in.nextInt();

        // Объявляем переменную runningTime и инициализируем ее текущим временем
        long runningTime = System.nanoTime();
        // Запускаем метод поиска перебором
        checkEnumeration(arr, checkNum);
        // Отслеживаем, сколько времени прошло на выполнение операции и выводим на экран результат
        runningTime = System.nanoTime() - runningTime;
        System.out.println("Время выполнения перебором: " + runningTime + "\n");

        // переменную runningTime снова записываем текущее время
        runningTime = System.nanoTime();
        // Запускаем метод двоичного поиска
        checkBinary(arr, checkNum);
        // Отслеживаем, сколько времени прошло на выполнение операции и выводим на экран результат
        runningTime = System.nanoTime() - runningTime;
        System.out.println("Время выполнения " + runningTime);
    }
}
