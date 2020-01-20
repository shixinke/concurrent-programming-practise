package com.shixinke.practise.concurrent.basic;



/**
 * 单个线程演示　
 * @author shixinke
 */
public class SingleDemo {

    /**
     * 任务1
     */
    private static void task1() {
        System.out.println("任务1开始");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("任务1结束");
    }

    /**
     * 任务2
     */
    private static void task2() {
        System.out.println("任务2开始");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("任务2结束");
    }


    /**
     * 任务3
     */
    private static void task3() {
        System.out.println("任务3开始");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("任务3结束");
    }


    /**
     * 任务4
     */
    private static void task4() {
        System.out.println("任务4开始");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("任务4结束");
    }


    /**
     * 执行4个任务
     * @param args
     */
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        task1();
        task2();
        task3();
        task4();
        /**
         * 1000 + 5000 + 2000 + 1000
         */
        System.out.println("共花费:" + (System.currentTimeMillis() - startTime));
    }
}
