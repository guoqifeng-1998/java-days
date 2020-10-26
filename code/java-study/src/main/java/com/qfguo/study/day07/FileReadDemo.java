package com.qfguo.study.day07;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @ClassName FileDemo1
 * @Description 文件读取练习-用InputStream读取文件
 * @Author 郭崎锋
 * @Date 2020/10/26
 **/
public class FileReadDemo {
    public static void main(String[] args) throws IOException {
        //创建一个文件File 对象，注意需要显示抛出异常（IOException是编译时异常——
        //可以用try catch 捕获，也可以在方法签名处使用 throws 抛出
        File inputFile =new File("D:/Download/Logo/a.jpg");
        //创建一个字节输入流，此处有上转型对象
        InputStream is = new FileInputStream(inputFile);
        //准备和文件大小一致的字节数组
        byte[] b = new byte[(int) inputFile.length()];
        System.out.println(inputFile);
        //通过字节输入流将文件读入数组
      is.read(b);
     //准备输出文件对象
      File outputFile = new File("D:/Download/Logo/a11.jpg");
        // 准备输出流
        OutputStream os = new FileOutputStream(outputFile);
        os.write(b);
        is.close();
        os.close();
    }
}
