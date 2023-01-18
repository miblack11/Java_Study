package com.object_oriented.static_;

public class StaticMethod {
    public static void main(String[] args) {
//创建两个学生对象 交学费
        Stu stu1 = new Stu("make");
        Stu.payFee(200);
        Stu stu2 = new Stu("while");
        Stu.payFee(100);
        Stu.showFee();
        //如果我们希望不创建实例，也可以调用某个方法(即当做工具来使用)
//这时，把方法做成静态方法时非常合适
        System.out.println("9 开平方的结果是=" + Math.sqrt(9));
        System.out.println(MyTools.numSum(12,22));
    }
}

//开发自己的工具类的时候可以把方法做成静态的方便调用
class MyTools {
    //求两个数的和
    public static double numSum(double n1, double n2) {
        return n1 + n2;
    }
    //可以写很多这样工具的方法

}

class Stu {
    private String name;
    private static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }
    //当方法使用了static 修饰后， 该方法就是静态方法
    //静态方法就可以访问静态属性
    public static void payFee(double fee){
        Stu.fee += fee;
    }
    public static void showFee(){
        System.out.println("总学费：" + fee);
    }
}
