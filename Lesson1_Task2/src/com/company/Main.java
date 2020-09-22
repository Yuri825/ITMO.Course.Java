package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	double a = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = in.nextInt();
        System.out.print("Введите K: ");
        double k = in.nextDouble();

        // Создаем массив с количеством элементов "N"
        double array[] = new double[n];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = a;
            a++;
        }
        for (int i = 0; i < array.length; i++)
        {
            System.out.print("Элементы массива: " + array[i] + "\n");
        }


        double result = 0;

        for (int i = 1; i <= array.length; i++)
        {
            //System.out.print(Math.pow(start, k) + "\n");
            result = result + Math.pow(i, k);
        }
        System.out.print("Result = " + result);
    }
}
