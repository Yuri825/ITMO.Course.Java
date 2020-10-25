package FinalTask;

import java.util.Comparator;

public class byName implements Comparator<String>
{
    public int getCount (String str)
    {
        int count = 0;
        char [] ch = str.toCharArray();
       for(int i = 0; i < str.length(); i++)
       {
           if(ch[i] > '0' && ch[i] < '9')
           {
                count++;
           }
       }
       return count;
    }


    @Override
    public int compare(String o1, String o2)
    {
        if(getCount(o1) < getCount(o2))
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
