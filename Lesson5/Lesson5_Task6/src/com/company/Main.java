// Постройте частотный словарь букв русского (или английского) алфавита.
//(опустим проблему выбора и анализа корпуса языка, достаточно будет взять текст
//небольшой длины).
//Для чтения текста из файла можно использовать такую конструкцию:
//String content = new String(Files.readAllBytes(Paths.get("readMe.txt")), "UTF-8");

package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {

        // Получаем текст из файла
        String content = new String(Files.readAllBytes(Paths.get("readMe.txt")), "UTF-8");

        // преобразуем полученный текст в нижний регистр
        content = content.toLowerCase();

        // объявляем массив длиной с алфавит
        int [] alf = new int[33];

        // Объявляем массив с символами алфавита
        char[] alfavit = new char[]{'a', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н',
                'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};


        // Запускаем цикл по тексту
        for (int i = 0; i < content.length(); i++)
        {
            // В переменную ch кладем текущий символ текста
          char ch = content.charAt(i);

          // запускаем второй цикл по символам алфавита
            for (int j = 0; j < alfavit.length; j++)
            {
                // если текущий символ текста равен символу в алфавите, в массиве "alf" увеличиваем соответствующую позицию
                if (ch == alfavit[j])
                {
                    alf[j]++;
                }
            }
        }

        // Выводим на экран ответ (буква алфавита и сколько раз встречается в тексте)
       for (int i = 0; i < alf.length; i++)
       {
           if (alf[i] > 0)
           {
               System.out.println("Буква \"" + alfavit[i] + "\" встречается в тексте " + alf[i] + " раз");
           }
       }

    }
}
