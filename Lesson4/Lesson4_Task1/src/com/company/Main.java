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




//        newBox.volume = newBox.volume + newBall.volume;
        System.out.println("Объем шара: " + newBall.volume);
        System.out.println("Объем коробки: " + newShape.volume);






        // Рассчитываем объем пирамиды:
        System.out.println("Введите площадь основания пирамиды: ");
        double sq = in.nextDouble();
        System.out.println("Введите высоту пирамиды: ");
        double hg = in.nextDouble();
        // Конструктор пирамиды с введенными параметрами
        Pyramid newPyramid = new Pyramid(sq, hg);
        System.out.println("Объем пирамиды: " + newPyramid.volume);

        newShape.volume = newShape.volume + newPyramid.volume;
//        System.out.println("Общий объем: " + Box.add(newBox.volume, newShape.volume));

        // Рассчитываем объем цилиндра
        System.out.println("Введите радиус цилиндра : ");
        double rad = in.nextDouble();
        System.out.println("Введите высоту цилиндра : ");
        double hc = in.nextDouble();
        // Конструктор цилиндра с введенными параметрами
        Cylinder newCylinder = new Cylinder(rad, hc);
        System.out.println("Объем цилиндра : " + newCylinder.volume);





    }
}
