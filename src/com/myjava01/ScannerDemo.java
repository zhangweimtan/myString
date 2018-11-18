package com.myjava01;

import java.util.Scanner;

/*
    Scanner:用于获取键盘录入的数据。（基本数据类型，字符串类型）
        public String nextLine():获取键盘录入的字符串类型
 */
public class ScannerDemo {
    public static void main(String[] args) {
//        创建对象
        Scanner sc = new Scanner(System.in);
//        接受数据
        System.out.println("请输入字符串：");
        String line = sc.nextLine();
        System.out.println("line:"+line);
    }
}
