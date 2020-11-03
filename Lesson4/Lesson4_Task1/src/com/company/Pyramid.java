package com.company;

public class Pyramid extends Shape
{
    double square;
    double height;

    // Объем пирамиды: (1 / 3) * S * h
    // S - площадь основания пирамиды
    // h - высота пирамиды
    Pyramid(double s, double h) {
        super();
        square = s;
        height = h;

//        this.volume = (1 / 3) * square * height;
        this.volume = (square * height) / 3;
    }




}
