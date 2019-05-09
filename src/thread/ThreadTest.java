package thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadTest {
    public  static  int count = 0;

    public static int getCount() {
        return count;
    }

    public synchronized  static void addCount() {
        count++;
    }

    public static void main(String[] args) {
        ExecutorService executorService = new ThreadPoolExecutor(10, 1000,
                60L, TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(10));


        for (int i = 0; i < 1000; i++) {
            Runnable r = new Runnable() {

                @Override
                public void run() {
                    ThreadTest.addCount();
                    System.out.println(ThreadTest.count);
                }
            };
            executorService.execute(r);
        }
        executorService.shutdown();
    }
}
