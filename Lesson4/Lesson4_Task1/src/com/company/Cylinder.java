package com.company;

public class Cylinder extends SolidOfRevolution
{
    double height;


    // Объем цилиндра: v = П*r2*h
   Cylinder(double r, double h) {
        super(r);
        height = h;
        this.volume = Math.PI * r * r * height;
    }

}
