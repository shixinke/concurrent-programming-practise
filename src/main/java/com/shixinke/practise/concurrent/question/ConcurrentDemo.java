package com.shixinke.practise.concurrent.question;

/**
 * 并发演示
 * @author shixinke
 */
public class ConcurrentDemo {

    public static void main(String[] args)  {

        System.out.println("num = " + getCount());

    }

    public static long getCount()  {
        final Counter counter = new Counter();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                counter.increment();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                counter.increment();
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return counter.getCount();
    }
}

/**
 * 计数器
 */
class Counter {
    private long count;

    public void increment() {
        for (int i = 0; i <= 100000; i++) {
            count += i;
        }
    }

    public long getCount() {
        return count;
    }
}
