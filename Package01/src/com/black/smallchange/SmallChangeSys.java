package com.black.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

//面向过程编程
public class SmallChangeSys {
    public static void main(String[] args) {
        //1.化繁为简
        //.先完成显示菜单，并可以选择菜单，给出对应提示
        System.out.println("============零钱通菜单=====");
        System.out.println("\t\t\t" + "零钱通明细");
        System.out.println("\t\t\t" + "收益入账");
        System.out.println("\t\t\t" + "消费");
        System.out.println("\t\t\t" + "退出");
        //定义相关变量
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        int key;
        //2.完成细节明细
        String detail = "                    收支细节明细";
        //3.完成收益入账，完成功能驱动程序增加变化的代码
        double money = 0;
        double balance = 0;//余额
        Date date = null;//date 是java.util.Date 类型 表示日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//用于日期格式化
        //4.消费
        String note = "";//消费商家
        //5.退出
        String sing="";
        do {
            System.out.println("请选择（1 - 4 ）");
            key = scanner.nextInt();
            //是switch分支结构控制
            switch (key) {
                case 1:
                    System.out.println(detail);
                    break;
                case 2:
                    System.out.println("收益入账金额");
                    money = scanner.nextDouble();
                    //money 有限制
                    //编程思想 ，设置关卡 就是错误的方式
                    if(money <= 0){
                        System.out.println("收益金额应该大于0");
                        break;
                    }
                    balance += money;
                    //拼接收益入账信息到details
                    date = new Date();//获取当前日期
                    detail += "\n" + "收益入账金额\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case 3:
                    System.out.println("消费金额");
                    money = scanner.nextDouble();
                    if(balance < money || money <= 0){
                        System.out.println("你的钱不够，不能购买");
                        break;
                    }
                    System.out.println("消费商家");
                    note = scanner.next();
                    balance -= money;
                    date = new Date();//获取当前日期
                    detail += "\n" + note + "\t" + "消费金额\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case 4:
                    //当用户选择4时，提示（Y/N)显示是否退出程序，
                    //输入其他的字符话 ，将一直循环问
                    while(true){
                        System.out.println("你是否确定要退出（y/n）");
                        sing= scanner.next();
                        if (sing.equals("y") || sing.equals("n")){
                            break;
                        }
                    }
                    if (sing.equals("y")){
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("选择有误，请重新输入");
            }
        } while (loop);
        System.out.println("退出了零钱通小程序");
    }
}