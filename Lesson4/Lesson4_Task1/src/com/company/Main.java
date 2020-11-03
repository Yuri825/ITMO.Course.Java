package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Установим объем коробки = 500");
        // Экземпляр класса BOX
        Box newBox = new Box();

        // Экземпляр класса Shape
        Shape newShape = new Shape();


        // рассчитываем объем шара:
        // Блок ввода
        Scanner in = new Scanner(System.in);
        System.out.println("Введите радиус шара: ");
        double num = in.nextDouble();

        // Конструктор шара с введенным параметром радиуса
        Ball newBall = new Ball(num);


        System.out.println("Объем шара: " + Math.round(newBall.volume));
        newBox.volume =  newBox.add(newBox.volume, newBall.volume);
        System.out.print("Текущий объем коробки: ");
        System.out.println(Math.round(newBox.volume));


        // Рассчитываем объем пирамиды:
        System.out.println("Введите площадь основания пирамиды: ");
        double sq = in.nextDouble();
        System.out.println("Введите высоту пирамиды: ");
        double hg = in.nextDouble();
        // Конструктор пирамиды с введенными параметрами
        Pyramid newPyramid = new Pyramid(sq, hg);
        System.out.println("Объем пирамиды: " + Math.round(newPyramid.volume));
        newBox.volume =  newBox.add(newBox.volume, newPyramid.volume);
        System.out.print("Текущий объем коробки: ");
        System.out.println(Math.round(newBox.volume));



        // Рассчитываем объем цилиндра
        System.out.println("Введите радиус цилиндра : ");
        double rad = in.nextDouble();
        System.out.println("Введите высоту цилиндра : ");
        double hc = in.nextDouble();
        // Конструктор цилиндра с введенными параметрами
        Cylinder newCylinder = new Cylinder(rad, hc);
        System.out.println("Объем цилиндра : " + Math.round(newCylinder.volume));
        newBox.volume =  newBox.add(newBox.volume, newCylinder.volume);
        System.out.print("Текущий объем коробки: ");
        System.out.println(Math.round(newBox.volume));


    }
}
