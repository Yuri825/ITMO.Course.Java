package Task3;

import java.util.Arrays;
import java.util.Scanner;

public class FirstThread extends Thread
{
    public void run()
    {
        // объявляем искомый массив

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число - количество элементов в массиве: ");
        int numArr = in.nextInt();
        int [] arr = new int[numArr];

        // заполняем массив
        for (int i = 0; i < numArr; i++)
        {
            arr[i] = (int) Math.round(Math.random()*100);
        }

        // Массив до сортировки
        System.out.println("массив до сортировки: ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        // просим ввести число,которое вы хотите проверить на наличие в массиве
        in = new Scanner(System.in);
        System.out.println("\nВведите число, которое вы хотите найти в массиве: ");
        int num = in.nextInt();


        // если функция не выдает -1, значит, искомое число есть в массиве
        if (binarrySearch(num,arr) != -1)
        {
            System.out.println("\nискомое число \"" + num + "\" есть в массиве");
        }
        else
        {
            // если функция выдает -1, значит, такого числа в массиве нет
            System.out.println("\nчисла \"" + num + "\" нет в массиве");
        }
    }

    // key - элемент, который ищем
    // array - массив, в котором ищем элемент
    // min - первое число отрезка, в котором на данный момент производим поиск
    // max - последнее число отрезка, в котором на данный момент ищем
    // middle - середина отрезка, в котором производим поиск

    public static int binarrySearch (int key, int [] array)
    {
        // сортируем массив, так как бинарный поиск работает только в сортированном массиве
        Arrays.sort(array);

        // массив после сортировки
        System.out.println("массив после сортировки: ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }

        int min = 0;
        int max = array.length-1;
        int middle;
        // запускаем цикл
        while (min <= max)
        {
            middle = (max + min)/2;
            // если искомое число равно элементу, расположенному в середине массива, то число есть
            if(key == array[middle])
            {
                return array[middle];
            }
            // если искомое число меньше элемента, расположенного в середине массива, сдвигаем отрезок влево
            else if (key < array[middle])
            {
                max = middle - 1;
            }
            // если искомое число больше элемента, расположенного в середине массива, сдвигаем отрезок вправо
            else if (key > array[middle])
            {
                min = middle + 1;
            }
        }
        // если так и не найдем совпадений, выдаем -1
        return -1;
    }
}
