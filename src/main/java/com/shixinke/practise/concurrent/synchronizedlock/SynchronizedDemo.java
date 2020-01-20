package com.shixinke.practise.concurrent.synchronizedlock;

public class SynchronizedDemo {

    public static void main(String[] args) {
        Counter counter = new Counter();
        new Thread(new ThreadDemo(counter)).start();
        new Thread(new ThreadDemo(counter)).start();
        new Thread(new ThreadDemo(counter)).start();
        new Thread(new ThreadDemo(counter)).start();
        new Thread(new ThreadDemo(counter)).start();
        System.out.println(counter.getCount());
    }

}

class ThreadDemo implements Runnable {

    private Counter counter;

    public ThreadDemo(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.counter.increase();
    }
}


class Counter {
    private Integer count;

    public synchronized Integer getCount() {
        return count;
    }

    public synchronized void increase() {
        if (count == null) {
            count = 1;
        }
        count ++;
    }
}