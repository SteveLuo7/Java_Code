package com.itheima.demo01.BufferedStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Demo01BufferedOutputStream {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("c");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("将数据写入缓冲区中".getBytes(StandardCharsets.UTF_8));
        bos.flush();
        bos.close();

    }

}
