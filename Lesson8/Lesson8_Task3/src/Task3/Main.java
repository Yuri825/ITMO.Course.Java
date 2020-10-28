// Написать метод, который, в двумерном массиве (матрице) ищет строку, сумма
//элементов которой является максимальной среди всех строк матрицы.

package Task3;

public class Main
{

    public static void main(String[] args)
    {
        // исследуемый массив
        String [][] arr = new String[][]
                {
                        {"первый", "втffffffffffffffорой", "третий"},
                        {"четвертый", "пятый ", "шестой", "седьмой"},
                        {"восьмой", "девятый", "десятый", "одиннадцатый"}
                };
        try
        {
            System.out.println(getMaxString(arr));
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }


    public static String getMaxString(String[][] arr)
    {
        // объявляем переменную для записи в нее результата
        String result = "";

        // запускаем два цикла
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                // если длина элемента подмассива равна длине самой длинной строки, записываем ее в result
                if (arr[i][j].length() == getMaxElem(arr))
                {
                    result = arr[i][j];
                }
            }
        }
        return result;
    }

    // метод для нахождения самого длинного элемента в массиве
    public static int getMaxElem(String [][] arr)
    {
        // вводим счетчик
        int count = 0;

        // запускаем два цикла, первый по массиву:
        for (int i = 0; i < arr.length; i++)
        {
            // второй по подмассиву:
            for (int j = 0; j < arr[i].length; j++)
            {
                // если длина элемента подмассива больше переменной count, присваиваем величину этой длины переменной count
                if(arr[i][j].length() > count)
                {
                    count = arr[i][j].length();
                }

            }
        }
        // в итоге в переменной countNext будет число самого длинного элемента массива
        return count;
    }

}
