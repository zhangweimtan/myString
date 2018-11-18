package com.myjava02;
/*
    String：字符串类
        多个字符组成的一串数据
        字符串是一个字符数组

    构造方法：
        String(String original) //字符串封装成字符串对象
        String(char[] value)//字符数组数据封装成字符串对象
        String(char[] value, int index, int count)//把字符数组中一部分数据封装成字符串对象
    注意：
    字符串是一种比较特殊的引用数据类型，直接输出字符串对象输出的是该对象中的数据。
 */
public class StringDemo {
    public static void main(String[] args) {
//        方式1
        String s1 = new String("hello");
        System.out.println(s1);
        // 直接输出对象中的数据，s1指向内存地址
        System.out.println("------");
//        方式2
        char[] chs = {'h','e','l','l','o'};
        String s2 = new String(chs);
        System.out.println(s2);
        System.out.println("------");
//        方式3
        String s3 = new String(chs, 1, 3);
        System.out.println(s3);
        System.out.println("------");
//        方式4
        String s4 = "hello";
        System.out.println(s4);
    }
}
