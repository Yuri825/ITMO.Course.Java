package com.company;

public class Cylinder extends SolidOfRevolution
{
    double height;


    // Объем цилиндра: v = П*r2*h
  public Cylinder(double radius, double height)
  {
        super(Math.PI * radius * radius * height, radius);
       this.height = height;
    }

}
