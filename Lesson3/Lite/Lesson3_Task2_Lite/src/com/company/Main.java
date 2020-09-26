// Написать метод, который проверяет, является ли массив возрастающей последовательностью

package com.company;

public class Main {

    public static void check (int [] arr)
    {
        // Объявляем булевую переменную
        boolean flag = false;

        // Запускаем цикл по массиву и проверяем по 2 элемента
        for (int i = 0; i < arr.length-1; i++)
        {
            int a = arr[i];
            int b = arr[i + 1];
            // Если предыдущий элемент больше следующего, переменной flag присваиваем true и выходим из цикла
            if (a > b)
            {
                flag = true;
                break;
            }
        }
        // Если переменная flag равна false, массив является возрастающей последовательностью и наоборот
        if (flag == false)
        {
            System.out.println("Массив является возрастающей последовательностью");
        }
        else
        {
            System.out.println("Массив не является возрастающей последовательностью");
        }

    }
    public static void main(String[] args) {
        int [] array = new int[] {1,2,3,4,5,6};
        check(array);
    }
}
