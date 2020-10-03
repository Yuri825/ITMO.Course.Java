package com.company;

public class Box<box> extends Shape
{

  double valBox = 500;


    public static void add (double valBox, double valShape)
    {
        if ((valBox - valShape) >= 0)
        {
            valBox = valBox - valShape;
        }
        else
        {
            System.out.println("Коробочка полна");

        }

    }

}
