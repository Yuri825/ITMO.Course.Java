package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        BaseConverter baseConverter = new BaseConverter();
        System.out.println("Введите величину градусов по Цельсию: ");
        Scanner in = new Scanner(System.in);
        double num = in.nextDouble();

        System.out.println("Перевод в Кельвины: " + baseConverter.convertToKelvin(num));
        System.out.println("Перевод в Фаренгейты: " + baseConverter.convertToFarengeight(num));
    }
}
