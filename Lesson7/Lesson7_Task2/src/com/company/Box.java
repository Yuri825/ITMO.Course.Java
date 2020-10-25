package com.company;

import java.util.ArrayList;

public class Box extends Shape
{
    private double valBox; // сичтать доступное место
    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public Box(double valBox) {
        super(valBox);
        this.valBox = valBox;
    }

    public boolean add (Shape shape)
    {

        if (valBox >= shape.getVolume())
        {
            shapes.add(shape);
            valBox -= shape.getVolume();

            return true;
        }
        else
        {
            System.out.println("Коробочка полна");
            return false;
        }

    }

}
