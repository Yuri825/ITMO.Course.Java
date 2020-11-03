package com.company;

public class SolidOfRevolution extends Shape
{
    private double radius;

//    SolidOfRevolution (double v, double r)
//    {
//        super();
//        radius = r;
//    }

    public SolidOfRevolution(double volume, double radius) {
        super(volume);
        this.radius = radius;
    }

    double getRadius ()
    {
        return radius;
    }
}
