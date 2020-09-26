// Написать метод, переставляющий элементы массива в обратном порядке

package com.company;

public class Main {

    static int[] reverse (int[] arr)
    {
        // Объявляем массив для перевернутых элементов
        int [] rev = new int[arr.length];

        // Запускаем цикл while в две стороны и вставляем в массив rev из массива arr зеркально элементы
        int i = arr.length-1;
        int j = 0;

       while (i >= 0)
       {
           rev[j] = arr[i];
           i--;
           j++;
       }
       return  rev;
    }

    public static void main(String[] args) {
        // Объявляем массив, который надо перевернуть
        int [] arr = new int[] {1, 2, 3, 17, 4, 5};

        // Выводим на экран элементы перевернутого массива
        for(int k = 0; k < arr.length; k++)
        {
            System.out.println(reverse(arr)[k]);
        }
    }
}
