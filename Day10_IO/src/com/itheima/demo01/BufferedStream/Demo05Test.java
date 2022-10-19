package com.itheima.demo01.BufferedStream;

import java.io.*;
import java.util.HashMap;

public class Demo05Test {
    public static void main(String[] args) throws IOException {

        HashMap<String, String> map = new HashMap<>();

        BufferedReader br = new BufferedReader(new FileReader("D:\\Java_Code\\IO.txt"));

        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Java_Code\\IO1.txt"));

        String line;
        while ((line = br.readLine())!= null) {
            String[] arr = line.split("\\.");
            map.put(arr[0],arr[1]);
        }
        
        for (String key : map.keySet()) {
            String value = map.get(key);
            line = key + "." + value;
            bw.write(line);
            bw.newLine();

        }

        bw.close();
        br.close();


    }
}
