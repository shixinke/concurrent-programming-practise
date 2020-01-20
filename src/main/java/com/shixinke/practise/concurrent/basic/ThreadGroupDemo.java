package com.shixinke.practise.concurrent.basic;

/**
 * 线程组演示
 * @author shixinke
 */
public class ThreadGroupDemo {

    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("线程组1");
        Thread t1 = new Thread(threadGroup, new Target());
        t1.start();
    }
}

class Target implements Runnable {

    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
