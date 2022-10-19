package com.itheima.demo03.FileUpload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TCPSever {
    public static void main(String[] args) throws IOException {

        ServerSocket sever = new ServerSocket(8888);

        while (true) {

            Socket socket = sever.accept();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {

                        InputStream is = socket.getInputStream();

                        File file = new File("D:\\upload");
                        if (!file.exists()) {
                            file.mkdirs();
                        }

                        String fileName = "itcast" + System.currentTimeMillis() + new Random().nextInt(99999) + ".txt";

                        FileOutputStream fos = new FileOutputStream(file + "\\" + fileName);
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while ((len = is.read(bytes)) != -1) {
                            fos.write(bytes, 0, len);
                        }

                        socket.getOutputStream().write("Upload Sucessful".getBytes());
                        fos.close();
                        socket.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
            }).start();

        }
//        sever.close();

    }
}
