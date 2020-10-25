// * Найти корень уравнения cos(x^5) + x^4 - 345.3 * x - 23 = 0 на отрезке [0; 10]
//с точностью по x не хуже чем 0.001.
//Используйте для этого метод деления отрезка пополам (и рекурсию).

package com.company;

public class Main {

        // вспомогательный метод
    public static double func(double x)
    {
        return Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) - 345.3 * x - 23;
    }

        // решить уравнение
    public static double  solve(double start, double end)
    {
        if(end - start <= 0.001)
        {
            return start;
        }

        double x = start + (end - start) / 2;

        if(func(start) * func(x) > 0)
        {
            return solve(x, end);
        }
        else
            {
                return solve(start, x);
            }
    }


    public static void main(String[] args) {
        System.out.println(solve(0, 10));
    }
}





