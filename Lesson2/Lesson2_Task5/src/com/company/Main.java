//методы для суммы и разности

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

    // Метод для суммы
    public  static  double sum (double num1, double num2)
    {
        return num1 + num2;
    }

    // Метод разности
    public static double difference (double num1, double num2)
    {
        return  num1 - num2;
    }

    public static void main(String[] args) {

        // Объявляем экземпляр класса vector1
        Vector vector1 = new Vector();

        // Объявляем экземпляр класса vector2
        Vector vector2 = new Vector();

        // Блок ввода координат
        Scanner in = new Scanner(System.in);
        System.out.print("Введите координату \"x\" первого вектора: ");
        vector1.x = in.nextInt();

        System.out.print("Введите координату \"y\" первого вектора: ");
        vector1.y = in.nextInt();

        System.out.print("Введите координату \"z\" первого вектора: ");
        vector1.z = in.nextInt();

        System.out.print("Введите координату \"x\" второго вектора: ");
        vector2.x = in.nextInt();

        System.out.print("Введите координату \"y\" второго вектора: ");
        vector2.y = in.nextInt();

        System.out.print("Введите координату \"z\" второго вектора: ");
        vector2.z = in.nextInt();


        // Выводим на экран результат
        System.out.print("Сумма: " + "\n" + "X: " + sum(vector1.x, vector2.x) + "\n" + "Y: " + sum(vector1.y,
                vector2.y) + "\n" + "Z: " + sum(vector1.z, vector2.z) + "\n");

        System.out.print("Разность: " + "\n" + "X: " + difference(vector1.x, vector2.x) + "\n" + "Y: " + sum(vector1.y,
                vector2.y) + "\n" + "Z: " + sum(vector1.z, vector2.z));
    }
}
