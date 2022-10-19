package com.itheima.demo02.Exception;

import java.io.IOException;

/*        finally代码块
无论是否出现异常都会执行 注意事项
finally不能单独使用必须和try一起使用 一般用于资源释放 无论程序是否出现程序异常 都要进行资源释放(IO)
*/
public class Demo02TryCatchFinally {
    public static void main(String[] args) {

        try {
            readFile("C:\\a.txt");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("资源释放");
        }
    }

    public static void readFile(String fileName) throws IOException {
        if (!fileName.equals("C:\\a.txt")) {
            throw new IOException("传递的不是正确的文件");
        }
        if (!fileName.endsWith(".txt")) {
            throw new IOException("传递的文件名结尾不正确");
        }
        System.out.println("文件正确 读取文件");
    }

}
