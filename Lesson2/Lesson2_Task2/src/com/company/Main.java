// Вычисление скалярного произведения

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

    // Объявляем метод для вычисления скалярного произведения
    public  static double scalar (double x1, double x2, double y1, double y2, double z1, double z2)
    {
        return x1*x2 + y1*y2 + z1*z2;
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
        vector1.y = in.nextInt();

        System.out.print("Введите координату \"z\" второго вектора: ");
        vector1.z = in.nextInt();


        // Выводим на экран ответ
        System.out.print("Скалярное произведение равно: " + scalar(vector1.x, vector1.y, vector1.z, vector2.x, vector2.y, vector2.z));

    }
}
