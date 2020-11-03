package com.company;

public class Box<box> extends Shape
{

//  double valBox = 500;


    public static double add (double valBox, double valShape)
    {
        if ((valBox - valShape) >= 0)
        {
            valBox = valBox - valShape;
//            System.out.println(Math.round(valBox));
            return valBox;
        }
        else
        {

            System.out.println("Коробочка полна");
//            System.out.println("Объем коробки: " + Math.round(valBox));
            return valBox;
        }

    }

}
