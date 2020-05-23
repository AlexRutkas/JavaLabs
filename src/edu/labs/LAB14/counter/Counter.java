package edu.labs.LAB14.counter;

import java.util.ArrayList;
import java.util.List;


public class Counter {
    static Integer counter = 0;

    public static void main(String[] args) {
        //https://www.codeflow.site/ru/article/java-thread-yield
        //1.бо змінна counter не синхронизована
        synchronized (counter) {


            List<Thread> threads = new ArrayList<Thread>();
            for (int i = 0; i < 100; i++) {
                threads.add(new Thread(new TestThread("t" + i)));
            }
            System.out.println("Starting threads");
            for (int i = 0; i < 100; i++) {
                threads.get(i).start();
            }
            try {
                for (int i = 0; i < 100; i++) {
                    threads.get(i).join();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Counter=" + counter);
        }
    }

    static class TestThread implements Runnable {
        String threadName;

        public TestThread(String threadName) {
            this.threadName = threadName;
        }

        public void run() {
            for (int i = 0; i < 10000; i++) {
                counter++;
                Thread.yield();
            }
        }
    }

}