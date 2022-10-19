package com.itheima.demo03.Exception;

public class Fu {
    public void show01() throws NullPointerException,ClassCastException{}
    public void show02() throws IndexOutOfBoundsException{}
    public void show03() throws IndexOutOfBoundsException{}
    public void show04() {}
}

class zi extends Fu {
    @Override
    public void show01() throws NullPointerException, ClassCastException {}

    @Override
    public void show02() throws IndexOutOfBoundsException {}

    public void show03() {}

    public void show04() {
        try {
            throw new Exception("编译期产生异常");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
