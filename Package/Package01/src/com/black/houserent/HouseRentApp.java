package com.black.houserent;

import com.black.houserent.domain.House;
import com.black.houserent.view.HouseView;

public class HouseRentApp {
    public static void main(String[] args) {
        //创建HouseView对象，并且显示主菜单，是整个程序的入口

        new HouseView().mainmenu();
        System.out.println("你退出了程序");

    }
}
