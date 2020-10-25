// Напишите программу, в которой создаются два потока, каждый из которых выводит
//по очереди на консоль своё имя.
//Начать можно с написания своего класс-потока, который выводит в бесконечном
//цикле свое имя. Потом придется добавить синхронизацию с помощью wait() и
//notify().

package Task4;

public class Main {

    public static void main(String[] args)
    {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        myThread1.start();
        myThread2.start();
    }

    static class MyThread extends Thread
    {
        String name;
        public void run()
        {
            while (true)
            {
                try
                {
                    Thread.sleep(1000);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }

                System.out.println(getName());
                Thread.yield();
            }

        }
    }
}
