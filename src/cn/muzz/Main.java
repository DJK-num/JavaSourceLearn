package cn.muzz;


import sun.misc.Unsafe;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ReentrantLock lock = new ReentrantLock(true);
        for (int i = 0; i < 3; i++) {
            new Thread(()->lock.lock()).start();
        }

        Thread.sleep(1000);
        System.out.println("HH");

    }
}
