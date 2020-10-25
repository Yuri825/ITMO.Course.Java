//Написать метод filter, который принимает на вход массив (любого типа) и
//реализацию абстрактного класса filter c методом apply(Object o), чтобы убрать
//из массива лишнее.
//Проверьте как он работает на строках или других объектах.
//абстрактного класса для получения нового значения по индексу

package Task4;

import java.util.Arrays;
//interface Filter {
//    boolean apply(Object o);
//}

public class Main
{

    public static void main(String[] args)
    {
        // объявляем первичный массив
        int [] arr = new int[] {1, 2, 3, 4, 5};

        // выводим на экран элементы нового массива
        for (int i = 0; i < filter(arr, 1).length; i++)
        {
            System.out.println(filter(arr, 5)[i]);
        }
    }

    // функция для заполнения нового массива
    public static int [] filter (int [] arr, int search)
    {
        int [] newArr = new int[getLenghtOfNewArr(arr, search)];

        for (int i = 0, j = 0; i < arr.length; i++)
        {
            if (arr[i] != search)
            {
                newArr[j] = arr[i];
                j++;
            }
        }
        return newArr;
    }


    // функция для получения длины нового массива из заданного
    public static int getLenghtOfNewArr (int [] arr, int search)
    {
        // задаем счетчик
        int count = 0;

        // запускаем цикл по массиву
        for (int i = 0; i < arr.length; i++)
        {
            // если элемент массива равен искомому числу, увеличиваем счетчик
            if(arr[i] == search)
            {
                count++;
            }
        }
        // возвращаем длину нового массива (длина первичного массива за вычетом количества
        // совпавших элементов)
        return arr.length - count;
    }
}
