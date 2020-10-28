// Написать метод, который проверяет, является ли двумерный массив квадратным

package Task2;

public class Main
{

    public static void main(String[] args)
    {
        // Проверяемый массив
        int [][] arr = new int[][] {{1,5,7}, {6,8,7,7}, {5,6,4}};
        try
        {
            System.out.println(ifSquare(arr));
        }
        catch (Exception ex)
        {
            ex.getMessage();
        }
    }

    // Метод для проверки массива на квадратность
    public static boolean ifSquare (int [][] arr)
    {
        // объявляем переменную а и записываем в нее длину массива
        int a = arr.length;

        // объявляем будевую переменную flag
        boolean flag = true;

        // запускаем цикл по массиву
        for (int i = 0; i < arr.length-1; i++)
        {
            // если длина подмассива не равна длине следующего подмассива, значит массив не квадратный,
            // делаем flag false и выходим из цикла
            if(arr[i].length != arr[i+1].length)
            {
                flag = false;
                break;
            }
        }

        return flag;
    }
}
