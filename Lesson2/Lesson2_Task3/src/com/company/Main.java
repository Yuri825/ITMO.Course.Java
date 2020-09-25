// Вычисление векторного произведения с другим вектором

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

    // Так как результатом векторного произведения векторов является вектор с тремя координатами, объявляем три метода

    // Объявляем метод для вычисления первой координаты
    public  static double firstCoordinate (double x1, double y2, double z1, double z2)
    {
        return (x1*z2 - z1*y2);
    }

    // Объявляем метод для вычисления второй координаты
    public  static double secondCoordinate (double x1, double x2, double z1, double z2)
    {
        return (z1*x2 - x1*z2);
    }

    // Объявляем метод для вычисления третьей координаты
    public  static double thirtyCoordinate(double x1, double x2, double y1, double y2)
    {
        return (x1*y2 - y1*x2);
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


        // Выводим на экран первую координату векторного произведения
        System.out.print("Скалярное произведение равно: " + firstCoordinate(vector1.x,
                vector2.y,
                vector1.z,
                vector2.z) + "\n");

        // Выводим на экран вторую координату векторного произведения
        System.out.print("Скалярное произведение равно: " + secondCoordinate(vector1.x,
                vector2.x,
                vector1.z,
                vector2.z) + "\n");

        // Выводим на экран третью координату векторного произведения
        System.out.print("Скалярное произведение равно: " + thirtyCoordinate(vector1.x,
                vector2.x,
                vector1.y,
                vector2.y));
    }
}
