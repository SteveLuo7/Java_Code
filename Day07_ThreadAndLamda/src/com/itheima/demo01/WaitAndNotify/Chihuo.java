package com.itheima.demo01.WaitAndNotify;

public class Chihuo extends Thread {
    private Baozi bz;

    public Chihuo(Baozi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                if (bz.flag = false) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("It's Eating BaoZi!!!" + bz.pi + bz.xian);
                bz.flag = false;
                bz.notify();
                System.out.println(bz.pi + bz.xian + "Finished, It's Time to produce new BaoZi");
            }
        }
    }
}



