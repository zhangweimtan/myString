package com.myjava03;
/*
    Object:是类层次结构中的根类，所有类都直接或间接继承该类；

    String 类的判断功能：
    boolean equals(Object obj):比较字符串的内容是否相同
    boolean equalsIgnoreCase(String str)：比较字符串的内容是否相同，忽略大小写
    boolean startWith(String str):判断字符串对象是否以指定str开头
    boolean endWith(String str):判断字符串对象是否以指定str结尾
 */
public class StringDemo {
    public static void main(String[] args) {
//        创建字符串对象
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "Hello";
//        boolean equals(Object obj)
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println("------");
//        boolean equalsIgnoreCase(String str)
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));

    }
}
