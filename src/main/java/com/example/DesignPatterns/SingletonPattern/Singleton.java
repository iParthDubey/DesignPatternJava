package com.example.DesignPatterns.SingletonPattern;

public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

/*
    Description:
    This approach minimizes synchronization overhead by first checking if the instance is already created
    before entering a synchronized block.
    The instance variable is marked as volatile to ensure proper visibility among threads.
    Pros:
    Reduces performance overhead by synchronizing only on the first creation.
    Cons:
    More complex and error-prone if not implemented correctly.
*/