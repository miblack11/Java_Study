package com.black.object_;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person person1 = new Person("jack", "男", 14);
        Person person2 = new Person("jack", "男", 14);
        System.out.println(person1.equals(person2));
    }
}
class Person{
    String name;
    String gender;
    int age;
    //重写 Object 的 equals 方法
    public boolean eauals(Object obj){//是 Person，我们才比较,
        // 进行 向下转型, 因为我需要得到 obj 的 各个属性
        //判断如果比较的两个对象是同一个对象，则直接返回 true
        if ( this == obj){
            return true;
        }
        //类型判断
        if(obj instanceof Person){
            Person person = (Person)obj;
            return this.name.equals(person.name) && this.gender.equals(person.gender) && this.age == person.age;
        }
        return false;
    }
    //重写person方法
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}
