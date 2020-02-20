package com.mzw.HotelManagementSystem;

import jdk.jshell.execution.Util;

import java.util.Scanner;

/**
 * @author mzw
 * @date 2020/2/12 - 17:26
 */
public class Test {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        System.out.println("-------------欢迎光临-------------");
        hotel.Print();
        while (true){
            System.out.print("请选择业务：1：预定   2：退订");
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            if(i==1){
                System.out.print("请输入预定房间号");
                Scanner scanner1 = new Scanner(System.in);
                String s1 = scanner1.next();
                hotel.order(s1);
                hotel.Print();
            }
            else if(i==2){
                System.out.print("请输入退订房间号");
                Scanner scanner2 = new Scanner(System.in);
                String s2 = scanner2.next();
                hotel.unsubscribe(s2);
                hotel.Print();
            }
            else{
                System.out.println("请输入正确的数字（1、2）");
            }
        }
    }
}
