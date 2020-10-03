package com.company;

public class Ball extends SolidOfRevolution
{

    // Объем шара: V = 4/3 * П * r3

   Ball (double r)
   {
       super(r);
        this.volume = (4 * Math.PI * r*r*r)/3;
   }


}
