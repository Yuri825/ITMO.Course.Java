package com.company;

public class BaseConverter
{
    double degrateCelcy;

    public double convertToKelvin (double degrateCelcy)
    {
        return degrateCelcy + 273.15;
    }

    public double convertToFarengeight (double degrateCelcy)
    {
        return (degrateCelcy * 9 / 5 ) + 32;
    }

}
