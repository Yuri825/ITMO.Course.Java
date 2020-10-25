package com.company;

public class Ball extends SolidOfRevolution
{
    // Объем шара: V = 4/3 * П * r3

   public Ball (double radius)
   {
       super(Math.round((Math.PI * radius*radius*radius)*4/3), radius);
   }
}
