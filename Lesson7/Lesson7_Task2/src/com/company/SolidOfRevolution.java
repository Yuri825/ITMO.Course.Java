package com.company;

public class SolidOfRevolution extends Shape
{
    private double radius;

    public SolidOfRevolution(double volume, double radius) {
        super(volume);
        this.radius = radius;
    }

    double getRadius ()
    {
        return radius;
    }
}
