// 1. Реализуйте метод indexOf():
//Метод должен принимать массив и элемент в качестве параметров, возвращать индекс найденного элемента (-1, если такой не найден).

package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    // Объявляем метод, возвращающий ArrayList с индексами совпавших элементов
    public static ArrayList<Integer> indexOf (int [] arr, int a)
    {
        // Объявляем булевую переменную для отслеживания наличия совпадений
        boolean flag = false;

        // Объявляем коллекцию для хранения индексов
        ArrayList<Integer> indexes = new ArrayList<>();

        // Запускаем цикл по заданному массиву
        for (int i = 0; i < arr.length; i++)
        {
            // Если совпадение есть, переменной flag ставим true, и добавляем индекс совпавшего элемента в коллекцию
            if (arr[i] == a)
            {
                flag = true;
                indexes.add(i);
            }
        }
        // Если совпадений нет, то flag остается false и в коллекцию добавляем только -1
        if (!flag) {indexes.add(-1);}

        return indexes;
    }


    public static void main(String[] args)
    {
        // Массив, в котором ищем совпадения
        int [] array = new int[] {1, 5, 8, 4, 3, 5 , 456, 25, 69, 36, 47};

        // Блок ввода данных с экрана
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();

        // Переводим коллекцию, полученную в результате работы метода indexOf, в массив
        Object[] arrayIndex = indexOf(array, num).toArray();

        // Запускаем цикл по массиву и выводим результат на экран
        for (Object b : arrayIndex)
        {
            System.out.println("Индекс совпавшего числа: " + b);
        }
    }
}
