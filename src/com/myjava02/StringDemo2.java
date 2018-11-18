package com.myjava02;
/*
    构造方法穿甲的字符串与直接赋值创建的字符串对象有什么区别？

    ==:
        基本数据，比较值
        引用数据：比较内存地址
 */
public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = "hello";
        System.out.println(s1);
        System.out.println(s2);
//        比较地址
        System.out.println("s1==s2:"+(s1==s2));
        String s3 = "hello";
        System.out.println("s2==s3:"+(s2==s3));
    }
}
