package com.black.extend_.exercise;
// 编写 PC 子类，继承 Computer 类，添加特有属性【品牌 brand】
public class PC extends Computer{
    String brand;

    public PC(String cup, int memory, int dick, String brand) {
        super(cup, memory, dick);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String PrenInfo(){
     return getDetails() + " brand" + brand;
    }
}
