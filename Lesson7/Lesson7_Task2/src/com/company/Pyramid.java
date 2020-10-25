package com.company;

public class Pyramid extends Shape
{
    double square;
    double height;

    // Объем пирамиды: (1 / 3) * S * h
    // S - площадь основания пирамиды
    // h - высота пирамиды
    Pyramid(double square, double height)
    {
        super(Math.round((square * height) / 3));
        this.square = square;
        this.height = height;
    }
}
