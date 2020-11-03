// ** Реализуйте метод шифрования и дешифрования текста с помощью одиночной
//перестановки по ключу (потом можно довести до двойной перестановки). Немного
//иллюстраций по теме есть здесь: http://fkn.ktu10.com/?q=node/4399 , текста здесь:
//ru.wikipedia.org/wiki/Симметричные_криптосистемы

package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
//        decryptionSimple();
//        encryptionSimple();
        encryptionWithKey();
    }



    public static void encryptionSimple ()
    {
//        String str = "ВРАГБУДЕТРАЗБИТ";

        // Вводим строку для зашифровывания
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку для зашифровывания: ");
        String str = in.nextLine();


        // Вводим шаг (длина строки)
        System.out.println("Введите длину строки");
        int step = in.nextInt();


        // Блок кода для внесения изменений в искомую строку (т.к. таблица, преобразованная из строки,
        // должна быть заполнена полностью)
        // Для этого создаем экземпляр объекта StringBuffer и параметр в него передаем строку
        StringBuffer stringBuffer = new StringBuffer(str);

        // Если длина stringBuffer не кратна длине строки таблицы, добавляем до полного символы "-"
        if(stringBuffer.length() % step != 0)
        {
            while (stringBuffer.length() % step != 0)
            {
                stringBuffer.insert(str.length(), "-");
            }
        }

        // преобразуем обратно stringBuffer в str с дополненными значениями
        str = stringBuffer.toString();

        // Объявляем двухмерный массив arr1, где сперва задаем количество строк таблицы,
        // а вторым параметром - длину строки таблицы
        String[][] arr1 = new String[str.length() / step][step];

        // Запускаем цикл для заполнения таблицы зашифрованными данными - пишем заданный текст в столбец
        for (int i = 0; i < step; i++)
        {
            for (int j = 0; j < str.length()/step; j++)
            {
                arr1[j][i] = String.valueOf(str.charAt(j + i* str.length()/step));
            }
        }


        // Зашифрованная строка (символ "-" на экран не выводим):
        System.out.println("Строка, полученная в результате шифровки: ");
        for (int i = 0; i < str.length()/step; i++)
        {
            for (int j = 0; j < step; j++)
            {
                if (arr1[i][j] != "-")
                {
                    System.out.print(arr1[i][j]);
                }
            }
        }

    }



    // Метод для дешифрования простой перестановкой
    public static void decryptionSimple ()
    {
//        String str = "ВГДРБРБЕАИАУТЗТ";

        // Вводим строку для расшифровки
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку для расшифровки: ");
        String str = in.nextLine();

        // Вводим шаг (длина строки)
        System.out.println("Введите длину строки");
        int step = in.nextInt();

        // Блок кода для внесения изменений в искомую строку (т.к. таблица, преобразованная из строки,
        // должна быть заполнена полностью)
        // Для этого создаем экземпляр объекта StringBuffer и параметр в него передаем строку
        StringBuffer stringBuffer = new StringBuffer(str);

        // Если длина stringBuffer не кратна длине строки таблицы, добавляем до полного символы "-"
        if(stringBuffer.length() % step != 0)
        {
            while (stringBuffer.length() % step != 0)
            {
                stringBuffer.insert(str.length(), "-");
            }
        }

        // преобразуем обратно stringBuffer в str с дополненными значениями
        str = stringBuffer.toString();

        // Объявляем двухмерный массив arr1, где сперва задаем количество строк таблицы,
        // а вторым параметром - длину строки таблицы
        String [] [] arr1 = new String[str.length()/step][step];

        // Заполняем массив символами из искомой строки
        for(int i = 0; i < str.length()/step; i++)
        {
            for (int j = 0; j < step; j++)
            {
                arr1[i][j] = String.valueOf(str.charAt(i*step+j));
            }
        }

        // Выводим на экран перестановку  - читаем массив по столбцам. Если текст читаемый, значит, расшифровали
        System.out.println("Расшифровка: ");
        for (int i = 0; i < step; i++)
        {
            for (int j = 0; j < str.length()/step; j++)
            {
                System.out.print(arr1[j][i]);
            }
        }
    }


    public static void encryptionWithKey ()
    {
        //        String str = "ВРАГБУДЕТРАЗБИТ";

        // Вводим строку для зашифровывания
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку для зашифровывания: ");
        String str = in.nextLine();



        String key = "памир";

       char [] keyStr = key.toCharArray();
        Arrays.sort(keyStr);
        System.out.println(keyStr[2]);




        for (int i = 0; i < key.length(); i++)
        {
//            System.out.println(key.charAt(i));
        }

        // Вводим шаг (длина строки)
        System.out.println("Введите длину строки");
        int step = in.nextInt();


        // Блок кода для внесения изменений в искомую строку (т.к. таблица, преобразованная из строки,
        // должна быть заполнена полностью)
        // Для этого создаем экземпляр объекта StringBuffer и параметр в него передаем строку
        StringBuffer stringBuffer = new StringBuffer(str);

        // Если длина stringBuffer не кратна длине строки таблицы, добавляем до полного символы "-"
        if(stringBuffer.length() % step != 0)
        {
            while (stringBuffer.length() % step != 0)
            {
                stringBuffer.insert(str.length(), "-");
            }
        }

        // преобразуем обратно stringBuffer в str с дополненными значениями
        str = stringBuffer.toString();


        // Объявляем двухмерный массив arr1, где сперва задаем количество строк таблицы,
        // а вторым параметром - длину строки таблицы
        String[][] arr1 = new String[str.length() / step][step];

        // Запускаем цикл для заполнения таблицы зашифрованными данными - пишем заданный текст в столбец
        for (int i = 0; i < step; i++)
        {
            for (int j = 0; j < str.length()/step; j++)
            {
                arr1[j][i] = String.valueOf(str.charAt(j + i* str.length()/step));
            }
        }


        // Зашифрованная строка (символ "-" на экран не выводим):
        System.out.println("Строка, полученная в результате шифровки: ");
        for (int i = 0; i < str.length()/step; i++)
        {
            for (int j = 0; j < step; j++)
            {
                if (arr1[i][j] != "-")
                {
                    System.out.print(arr1[i][j]);
                }
            }
        }

    }
}
