package com.itheima.demo01.WaitAndNotify;

public class Baozipu extends Thread {
    private Baozi bz;

    public Baozipu(Baozi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            synchronized (bz) {
                if (bz.flag == true) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            if (count % 2 == 0) {
                bz.pi = "薄皮";
                bz.xian = "Beef";

            } else {
                bz.pi = "冰皮";
                bz.xian = "beef";
            }
            count++;
            System.out.println("包子铺正在生产：" + bz.pi + bz.xian + "包子");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            bz.flag = true;
            bz.notify();

            System.out.println("包子铺已经生产：" + bz.pi + bz.xian + "包子！！！ 吃货可以开始吃了");
            }
        }
    }
}
