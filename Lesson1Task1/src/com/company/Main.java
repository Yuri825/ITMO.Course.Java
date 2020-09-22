package com.company;

public class Main {

    public static void main(String[] args) {
        //Задание 1. Заполните массив случайным числами и выведете максимальное, минимальное и
        //среднее значение.
        //Для генерации случайного числа используйте метод Math.random(), который
        //возвращает значение в промежутке [0, 1].

        int n = 10;
	    double array[] = new double[n];

	    // Заполнение массива случайными числами:
	    for (int i = 0; i < array.length; i++)
        {
            array[i] = Math.random();
        }

	    // Вывод элементов массива на экран:
	    for (int i = 0; i < array.length; i++)
        {
            System.out.print("Элементы массива: " + array[i] + "\n");
        }

	    // Находим максимальное число в массиве:
    double max = 0;
	    for (int i = 0; i < array.length; i++)
        {
            if(max < array[i])
            {
                max = array[i];
            }
        }
        System.out.print("Максимальное число массива: " + max + "\n");

	    // Находим минимальное число в массиве:
	    double min = 1;
        for (int i = 0; i < array.length; i++)
        {
            if(min > array[i])
            {
                min = array[i];
            }
        }
        System.out.print("Минимальное число массива: " + min + "\n");

        double avg = 0;
        double sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum = sum + array[i];
        }
        avg = sum/ array.length;
        System.out.print("Среднее число массива: " + avg);

    }
}
