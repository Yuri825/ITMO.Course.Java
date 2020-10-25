// Напишите программу, в которой запускается 10 потоков и каждый из них выводит
//числа от 0 до 100

package Task5;

public class Main {
static class  SomeThread extends Thread
{
    public void run()
    {
        for(int i = 0; i < 100; i++)
        {
            System.out.println(i);
        }
    }
}
    public static void main(String[] args)
    {
        SomeThread [] test = new SomeThread[10];
        for(int i = 0; i < 10; i++)
        {
            test[i] = new SomeThread();
            test[i].start();
        }
    }
}
