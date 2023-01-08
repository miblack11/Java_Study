package com.black.extend_.exercise;
//  编写 NotePad 子类，继承 Computer 类，添加特有属性【color】
public class NotePad extends Computer{
    String color;

    public NotePad(String cup, int memory, int dick, String color) {
        super(cup, memory, dick);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String Presoninfo(){
       return getDetails() + " color=" + color;
    }
}
