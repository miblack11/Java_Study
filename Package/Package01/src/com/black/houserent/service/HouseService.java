package com.black.houserent.service;

import com.black.houserent.domain.House;

/**
 * 定义一个House[]，保存House对象
 * 相应HouseView的调用
 * 完成对房屋信息的各种操作（增删改查）（ crud)
 */
public class HouseService {
    House[] house;
    private int houseNums = 1;//记录当前有多少房屋信息
    private int idCounter = 1;//id自增长

    public HouseService(int i) {//构造器确定数组大小

        house = new House[i];
        house[0] = new House(1, "jakd", "1211", "asjf", 1231, "weichuz");
    }

    public boolean add(House newHouse) {
        if (houseNums == house.length) {
            System.out.println("添加超过数组数组长度,不能在添加了....");
            return false;
        }
        //把newHouse对象添加到house数组中
        house[houseNums++] = newHouse;
        newHouse.getId(++idCounter);
        return true;
    }
    //编写一个删除判断方法
    public boolean del(int delId) {
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if(delId == house[i].getId(idCounter)){
            index = i;
            }
        }
        if(index == -1){
            System.out.println("找不到要删除房源编号,删除失败");
            return false;
        }
        //删除房源
        for (int i = index; i < houseNums -1 ; i++) {
            this.house[i] = this.house[i+1];
        }
        //表示把数组最后一个元素制空  并且减少一个数组
        this.house[--houseNums] = null;
        return true;
    }

    public House[] list() {//返回所有的房屋信息
        return house;
    }

}
