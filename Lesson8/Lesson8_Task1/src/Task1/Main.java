// Написать метод для поиска наибольшего элемента в двумерном массиве

package Task1;

public class Main {

    public static void main(String[] args)
    {
        // Проверяемый массив
        int [][] arr = {{1,2,3,4}, {4,9,7,2},{5,7,8,3,4565,2}};


        try
        {
            System.out.println(getMax(arr));
        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println(ex.getMessage());
        }
    }


    public static int getMax (int [][]arr)
    {
        // объявляем переменную и записываем в нее минимально возможное значение для int
        int result = Integer.MIN_VALUE;

        // запускаем два цикла по двумерному масиву
       for (int i = 0; i < arr.length; i++)
       {
           for (int j = 0; j < arr[i].length; j++)
           {
               // перебираем все элементы двумерного массива и сравниваем их с переменной result,
               // в которую записываем максимальное значение. В итоге, в переменной result останется
               // максимальное значение
                result = Math.max(result, arr[i][j]);
           }
       }
       return result;
    }
}
