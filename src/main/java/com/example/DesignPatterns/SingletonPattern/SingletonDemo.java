package com.example.DesignPatterns.SingletonPattern;

public class SingletonDemo {

    public static void main(String[] args) throws InterruptedException {
        final int threadCount = 100;
        final Singleton[] instances = new Singleton[threadCount];
        Thread[] threads = new Thread[threadCount];

        // Create multiple threads, each calling getInstance().
        for (int i = 0; i < threadCount; i++) {
            final int index = i;
            threads[i] = new Thread(() -> {
                instances[index] = Singleton.getInstance();
            });
        }

        // Start all threads.
        for (Thread thread : threads) {
            thread.start();
        }

        // Wait for all threads to complete.
        for (Thread thread : threads) {
            thread.join();
        }

        // Verify that every instance retrieved is the same.
        Singleton firstInstance = instances[0];
        for (int i = 1; i < threadCount; i++) {
            System.out.println("All instances must be identical");
            System.out.println(firstInstance == instances[i]);
        }
    }
}
