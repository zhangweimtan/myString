package com.myjava03;

import java.util.Scanner;

/*
    模拟登陆，提示输入用户名，密码，并提示三次错误
    键盘录入用户名，密码
 */
public class StringTest {
    public static void main(String[] args) {
        String userName = "admin";
        String password = "admin";
        for (int x = 0; x < 3; x++) {
//        创建键盘录入对象
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String name = sc.nextLine();
            System.out.println("请输入密码：");
            String psd = sc.nextLine();

//        判断
            if (userName.equalsIgnoreCase(name) && password.equalsIgnoreCase(psd)) {
                System.out.println("用户登陆成功");
                break;
            } else {
                if(2-x ==0){
                    System.out.println("登陆失败，忘记密码？");
                }else {
                    System.out.println("登陆失败，还有" + (2 - x) + "次机会");
                }
            }
        }
    }
}
