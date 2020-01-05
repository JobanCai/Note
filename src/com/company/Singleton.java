package com.company;

public class Singleton {

    /**
     * volatile 禁止JVM重排序 instance = new Singleton();
     */
    private volatile static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                // 多线程情况下需要再校验一次
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
