// статический метод, который принимает целое число N, и возвращает массив случайных
//векторов размером N.

package com.company;

import java.util.Scanner;

public class Main {

    // Объявляем класс "Vector"
    public static class  Vector
    {
        double x;
        double y;
        double z;
    }

    // экземпляр класса Vector
    public static Vector[] randomVector (int N)
    {

        //Объявляем массив для хранения в нем векторов
        Vector [] vects = new Vector[N];

        // заполняем массив случайными значениями векторов
        for (int i = 0; i < N; i++)
        {
            Vector vector = new Vector();
            vector.x = Math.round(Math.random()*100);
            vector.y = Math.round(Math.random()*100);
            vector.z = Math.round(Math.random()*100);

            vects[i] = vector;
        }
        return vects;
    }

    public static void main(String[] args)
    {
        // Ввод числа N с экрана
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число \"N\":");
        int N = in.nextInt();

        // Вывод ответа на экран (массив случайных векторов)
        for(int i = 0; i < randomVector(N).length; i++)
        {
            System.out.println("Вектор № " + (i+1) + ": " + randomVector(N)[i].x + ", " +
                    randomVector(N)[i].y + ", " + randomVector(N)[i].z + "\n");
        }
    }
}
