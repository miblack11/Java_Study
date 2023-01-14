package com.black.extend_.exercise;

public class Text {
    public static void main(String[] args) {
//        编写 Test 类，在 main 方法中创建 PC 和 NotePad 对象，
//        分别给对象中特有的属性赋值，以及从 Computer 类继承的
//        属性赋值，并使用方法并打印输出信息
        PC pc = new PC("Inter",64,10000,"IBM");
        System.out.println( pc.PrenInfo());
        NotePad notePad = new NotePad("RTX", 64, 1080, "红色");
        System.out.println(notePad.Presoninfo());
    }
}
