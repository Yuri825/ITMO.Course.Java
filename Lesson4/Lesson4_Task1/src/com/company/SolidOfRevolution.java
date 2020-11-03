package com.company;

public class SolidOfRevolution extends Shape
{
    double radius;

    SolidOfRevolution (double v, double r)
    {
        super();
        radius = r;
    }

    public SolidOfRevolution(double r) {
        super();
    }

    double getRadius (SolidOfRevolution s)
    {
        return radius;
    }
}
