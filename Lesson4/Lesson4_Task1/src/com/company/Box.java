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



//  double valBox = 500;


    public boolean add (Shape shape)
    {

        if (valBox >= shape.getVolume())
        {
            shapes.add(shape);
            valBox -= shape.getVolume();

//            System.out.println(Math.round(valBox));
            return true;
        }
        else
        {

            System.out.println("Коробочка полна");
//            System.out.println("Объем коробки: " + Math.round(valBox));
            return false;
        }

    }

}
