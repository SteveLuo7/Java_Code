package com.itheima.demo09.Synchronized;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableImpl implements Runnable{

    private int ticket = 100;

    Lock l = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            l.lock();
               if (ticket > 0) {
                   try {
                       Thread.sleep(10);
                   System.out.println(Thread.currentThread().getName() + "Selling" + ticket);
                   ticket --;
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   } finally {
                       l.unlock();
                   }
               }
        }
    }
}
