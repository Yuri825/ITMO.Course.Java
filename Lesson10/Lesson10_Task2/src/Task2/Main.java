// Выведите состояние потока перед его запуском , после запуска и во время
//выполнения

package Task2;

public class Main
{
    public static void main(String[] args) throws InterruptedException {
        // объявляем поток
        MyThread myThread = new MyThread();

        // статус потока до запуска
        System.out.println(myThread.getState());

        // запускаем поток
        myThread.start();

        // статус потока во время работы
        System.out.println(myThread.getState());

         //останавливаем поток на секунду
        myThread.sleep(1000);

        // почему-то то срабатывает, то нет
//        myThread.interrupt();
//        myThread.stop();

        // статус потока после остановки
        System.out.println(myThread.getState());
    }


    // объявляем класс MyThread и наследуем его от класса Thread
    static class MyThread extends Thread
    {
        // обязательный метод run
        public void run()
        {
            for (int i = 0; i < 10; i++)
            {
//                System.out.println(i);
            }
        }
    }
}
