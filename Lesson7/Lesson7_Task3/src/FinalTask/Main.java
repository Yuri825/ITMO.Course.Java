package FinalTask;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args)
    {
        // объявляем массив
	    String [] arr = new String[] {"од4и234н", "двx5xxxа", "тр66и", "ч1е3ты3ре", "пь44я76544ть"};

	    // выводим на экран элементы первоначального массива
        System.out.print("Первоначальный: ");
        printArr(arr);

        // Сортируем по алфавиту и выводим на экран
        System.out.print("По алфавиту: ");
        Arrays.sort(arr);
        printArr(arr);

        // Сортируем по длине строки и выводим на экран
        Comparator<String> ofLength = new byLength();
        Arrays.sort(arr, ofLength);
        System.out.print("По длине строки: ");
        printArr(arr);

        // Сортируем по количеству цифр
        Comparator<String> byNum = new byName();
        Arrays.sort(arr, byNum);
        System.out.print("По количеству цифр: ");
        printArr(arr);
    }


    // метод для вывода массива на экран
    public  static void printArr (String [] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if(i < arr.length-1)
            {
                System.out.print(arr[i] + ", ");
            }
            else
            {
                System.out.print(arr[i] + "\n");
            }

        }
    }
}
