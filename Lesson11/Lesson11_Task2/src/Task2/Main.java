// Метод получает на вход массив элементов типа К.
//Вернуть надо объект Map<K, Integer>, где K — Значение из массива, а Integer
//количество вхождений в массив.
//<K> Map<K, Integer> arrayToMap(K[] ks);

package Task2;

import java.util.HashMap;
import java.util.Map;

public class Main
{

    public static void main(String[] args)
    {
        int [] arr = new int[] {3,6,4,1,3,9,7,8,5,3};

        int step = 0;

        Map<Integer, Integer> mapArray= new HashMap<Integer, Integer>();
        do
            {
            if (!mapArray.containsKey(arr[step]))
            {
                int sum = 1;
                for (int i = step + 1; i < arr.length; i++)
                {
                    if (arr[i] == arr[step])
                    {
                        sum++;
                    }
                }
                mapArray.put(arr[step], sum);
            }
            step++;
        }
        while (step < arr.length);

            for(Map.Entry<Integer, Integer> pair : mapArray.entrySet())
            {
                System.out.println(pair.getKey() + " " + pair.getValue());
            }


    }
}
