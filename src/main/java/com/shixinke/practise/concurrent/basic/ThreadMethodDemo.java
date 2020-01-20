package com.shixinke.practise.concurrent.basic;

/**
 * 线程拥有的方法
 * @author shixinke
 */
public class ThreadMethodDemo {

    public static void main(String[] args) {
        Thread t1 = new Thread();
        /**
         * 设置线程名称
         */
        t1.setName("线程1");
        System.out.println("线程ID=" + t1.getId());


    }
}
