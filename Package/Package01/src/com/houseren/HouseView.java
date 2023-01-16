package com.houseren;

import java.util.Scanner;

//完成显示菜单 接受用户输入
public class HouseView {

    boolean fool = true;
    int key;

    public void menu() {//显示菜单
        HouseSen houseSen = new HouseSen("mike","12312","北京",100,"出租");
        System.out.println("==============房屋出租系统===========");
        System.out.println("            1 新 增 房 源");
        System.out.println("            2 查 找 房 源");
        System.out.println("            3 删 除 房 源");
        System.out.println("            4 修 改 房 屋 信 息");
        System.out.println("            5 房 屋 列 表");
        System.out.println("            6 退      出");
        do{
            System.out.println("请选择1-6");
            Scanner scanner = new Scanner(System.in);
            key = scanner.nextInt();
            switch(key){
                case 1:
                houseSen.m1(houseSen.houseSen);
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    fool = false;
                    break;
            }
        }while(fool);
    }

}