package com.company;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Shape> shapes = new TreeSet<Shape>();

        Shape firstSape = new Pyramid(50,50);
        Shape secondShape = new Ball(5);
        Shape thirdShape = new Box(1000);
        Shape fourthShape = new Cylinder(2,2);

        shapes.add(firstSape);
        shapes.add(secondShape);
        shapes.add(thirdShape);
        shapes.add(fourthShape);

        for (Shape h: shapes)
        {
            System.out.println("Тип фигуры: " + h.getClass() + " объём: " + h.getVolume());
        }
    }
}
