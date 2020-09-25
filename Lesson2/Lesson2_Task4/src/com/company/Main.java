// Вычисление угла между векторами

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

    // Так как косинус угла между
    //векторами равен скалярному произведению векторов, деленному на произведение
    //модулей (длин) векторов

    // Объявляем метод для вычисления скалярного произведения
    public  static double scalar (double x1, double x2, double y1, double y2, double z1, double z2)
    {
        return x1*x2 + y1*y2 + z1*z2;
    }

    // Объявляем метод для вычисления длины вектора
    public  static  double vectorLength (double x, double y, double z)
    {
        return (double) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
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


        // Выводим на экран ответ
        System.out.print("косинус угла между векторами равен: " + ((scalar(vector1.x, vector1.y, vector1.z, vector2.x,
                vector2.y, vector2.z))/(vectorLength(vector1.x, vector1.y, vector1.z) * vectorLength(vector2.x, vector2.y, vector2.z))));
    }
}
