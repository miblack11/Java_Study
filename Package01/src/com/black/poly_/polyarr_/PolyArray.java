package com.black.poly_.polyarr_;

//应用实例:现有一个继承结构如下：要求创建 1 个 Person 对象、
// 2 个 Student 对象和 2 个 Teacher 对象, 统一放在数组中，并调用每个对象 say 方法
public class PolyArray {
    public static void main(String[] args) {
        Person person[] = new Person[5];
        person[0] = new Person("blac");
        person[1] = new Study("jack", 333);
        person[2] = new Study("mike", 33);
        person[3] = new Teach("while", 4444);
        person[4] = new Teach("bale", 444);
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].say());//动态绑定
            if (person[i] instanceof Study) {
                Study study = (Study) person[i];
                ((Study) person[i]).ings();
            } else if (person[i] instanceof Teach) {
                Teach teach = (Teach) person[i];
                ((Teach) person[i]).ings();
            }
        }
    }
}
