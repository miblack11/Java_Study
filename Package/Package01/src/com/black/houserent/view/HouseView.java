package com.black.houserent.view;

import com.black.houserent.domain.House;
import com.black.houserent.service.HouseService;
import com.black.houserent.utils.Utility;


/**
 * 显示主菜单
 * 接受用户输入
 * 调用HouseService完成对房屋信息的各种操作
 */
public class HouseView {
    boolean fool = true;
    int key;
    private HouseService houseService = new HouseService(3);

    //编写addHouse接收输入 调用add方法(添加房源)
    public void addHouse() {
        System.out.println("----------------新增房源-------------");
        System.out.print("姓名：");
        String name = Utility.readString(4);
        System.out.print("电话：");
        String phone = Utility.readString(11);
        System.out.print("地址：");
        String address = Utility.readString(20);
        System.out.print("月租：");
        int monthlyrent = Utility.readInt();
        System.out.print("状态：");
        String state = Utility.readString(3);
        House newHouse = new House(0, name, phone, address, monthlyrent, state);
        if (houseService.add(newHouse)) {
            System.out.println("----------------添加房源完成-------------");
        } else {
            System.out.println("----------------添加房源失败-------------");
        }

    }
    //删除房源
    public void delHouse(){
        System.out.println("----------------删除房源-------------");
        System.out.print("请选择待删除房屋编号（-1退出）");
        int i = Utility.readInt();
        if ( i == -1){
            System.out.println("你放弃了删除房源");
            return;
        }
        char c = Utility.readConfirmSelection();
        if( c == 'y'){
            boolean del = houseService.del(i);
        }else{
            System.out.println("你还是放弃了删除房源");
        }
    }
    //编写houselist显示房屋信息
    public void listHouse() {
        System.out.println("----------------房屋列表-------------");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                break;
            }
            System.out.println(houses[i]);
        }
    }

    public void mainmenu() {
        HouseService houseService = new HouseService(2);

        do {
            System.out.println("-----------房屋出租系统---------");
            System.out.println("         1 新 增 房 源");
            System.out.println("         2 查 找 房 源");
            System.out.println("         3 删 除 房 源");
            System.out.println("         4 修 改 房 源");
            System.out.println("         5 房 源 列 表");
            System.out.println("         6 退       出");
            System.out.println("请选择1-6列表");
            key = Utility.readInt(1);
            switch (key) {
                case 1:
                    this.addHouse();
                    break;
                case 2:

                    break;
                case 3:
                    this.delHouse();
                    break;
                case 4:

                    break;
                case 5:
                    this.listHouse();
                    break;
                case 6:

                    fool = false;
                    break;

            }
        } while (fool);
    }
}
