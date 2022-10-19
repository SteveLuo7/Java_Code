package com.itheima.demo02.FileUpload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPSever {
    public static void main(String[] args) throws IOException {

        ServerSocket sever = new ServerSocket(8888);

        Socket socket = sever.accept();

        InputStream is = socket.getInputStream();

        File file = new File("D:\\upload");
        if (!file.exists()) {
            file.mkdirs();
        }

        FileOutputStream fos = new FileOutputStream(file + "\\1.txt");
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = is.read(bytes)) != -1 ) {
            fos.write(bytes,0,len);
        }

        socket.getOutputStream().write("Upload Sucessful".getBytes());
        fos.close();
        socket.close();
        sever.close();

    }
}
