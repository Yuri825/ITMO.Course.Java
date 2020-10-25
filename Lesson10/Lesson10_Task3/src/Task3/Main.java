// Дан класс:
// class Counter {
//int count = 0 ;
//public void increment() {
//count = count + 1 ;
//}
//public int getCount() {
//return count ;
//}
//}
// Напишите программу, в которой запускается 100 потоков, каждый из которых
//вызывает метод increment() 1000 раз.
//После того, как потоки завершат работу, проверьте, чему равен count .
//Если обнаружилась проблема, предложите ее решение.

package Task3;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // объявляем массив для хранения потоков
        MyThread [] myThread = new MyThread[100];

        // запускаем цикл от 1 до 100, создаем 100 потоков и запускаем их
        for(int i = 0; i < 100; i++)
        {
            myThread[i] = new MyThread();
            myThread[i].start();
            // прописываем, чтобы следующий поток не запускался, пока не завершится предыдущий
            myThread[i].join();
        }

        // выводим на экран значение переменной counter
        System.out.println(Counter.getCount());
    }

    static class MyThread extends Thread
    {
        public void run ()
        {
            for (int i = 0; i < 1000; i++)
            {
                Counter.increment();
            }
        }
    }

     static class Counter
     {
       static int count = 0 ;
        public static void increment()
        {
        count = count + 1 ;
        }
        public static int getCount()
        {
        return count ;
        }
     }
}
