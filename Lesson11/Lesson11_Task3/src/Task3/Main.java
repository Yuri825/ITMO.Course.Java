// Напишите метод, осуществляющий двоичный поиск в несколько потоков.
//Используйте лямбды

package Task3;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws InterruptedException {
        FirstThread firstThread1 = new FirstThread();
        FirstThread firstThread2 = new FirstThread();
        firstThread1.start();
        firstThread1.join();
        firstThread2.start();
    }
}
