package com.itheima.demo06.TryCatch;

import java.io.FileWriter;
import java.io.IOException;

public class Demo01TryCatch {
    public static void main(String[] args) {
        FileWriter fw = null;
        try{
           fw =  new FileWriter("w:\\Java_Code\\g.txt",true);
            for (int i = 0; i <= 10 ; i++) {
                fw.write("Hello,world " + i);
                fw.write("\r\n");
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
