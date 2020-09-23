// Напишите программу, которая вычислит простые числа в пределах от 2 до 100.
//Для решения этой задачи понадобится вычислить остаток от деления. В Java для
//этого есть оператор % (например, 103 % 10 это 3).

package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        // Создаем пустой список
        ArrayList<Integer> simpleNumbers = new ArrayList<Integer>();
        int n = 100;
        int k = 0; // здесь будем хранить количество делителей

	    for (int i = 2; i < n; i++)
        {
            for (int j = 2; j < i; j++)
            {
                if (i % j == 0)
                {
                    k++;
                }
            }
            if (k == 0)
            {
                simpleNumbers.add(i); // если делителей нет, то добавляем в список
            }
            k = 0; // возвращаем для "k" значение "0"
        }
        System.out.println("простые числа от 2 до " + n + ": " + simpleNumbers);

    }
}
