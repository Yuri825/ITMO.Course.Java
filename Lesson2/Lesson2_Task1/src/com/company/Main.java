// Вычисление длины вектора

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


    // Объявляем метод для вычисления длины вектора
    public  static  double vectorLength (double x, double y, double z)
    {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }


    public static void main(String[] args) {

        // Объявляем экземпляр класса "Vector" с именем "vector"
        Vector vector = new Vector();

        // Прописываем блок команд для ввода координат с экрана
        Scanner in = new Scanner(System.in);
        System.out.println("Введите координату \"x\" первого вектора: ");
        vector.x = in.nextDouble();

        System.out.println("Введите координату \"y\" первого вектора: ");
        vector.y = in.nextDouble();

        System.out.println("Введите координату \"z\" первого вектора: ");
        vector.z = in.nextDouble();


        // Выводим на экран длину вектора
        System.out.println("Длина вектора равна: " + Math.round(vectorLength(vector.x, vector.y, vector.z)));

    }

}
