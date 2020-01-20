package com.shixinke.practise.concurrent.basic;



/**
 * 多个线程演示　
 * @author shixinke
 */
public class MultiDemo {


    /**
     * 执行4个任务
     * @param args
     */
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Thread t1 = new Thread(new Task("任务1", 1000));
        Thread t2 = new Thread(new Task("任务2", 5000));
        Thread t3 = new Thread(new Task("任务3", 2000));
        Thread t4 = new Thread(new Task("任务4", 1000));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        /**
         * 5000
         */
        System.out.println("共花费:" + (System.currentTimeMillis() - startTime));
    }
}

/**
 * 任务
 */
class Task implements Runnable {

    /**
     * 任务名称
     */
    private String name;
    /**
     * 模拟的执行的时长
     */
    private long sleepTime;

    public Task(String name, long sleepTime) {
        this.name = name;
        this.sleepTime = sleepTime;
    }

    public void run() {
        System.out.println(name + "开始");
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + "结束");
    }
}
