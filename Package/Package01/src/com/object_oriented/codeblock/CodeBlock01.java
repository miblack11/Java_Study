package com.object_oriented.codeblock;

/**
 * 说明注意：
 * 1.代码块分为普通代码块和静态代码块（static）
 * 使用场景：
 * 1如果多个构造器都有重复的语句时，可以抽取到代码块中】
 * 提高代码的重用性
 * 理解：
 * 相当于另外一种构造器（对构造器的补充）
 */
public class CodeBlock01 {
    public static void main(String[] args) {
        Movie movie1 = new Movie("单身男女");
        Movie movie2 = new Movie("单身男女",100);
        Movie movie3 = new Movie("单身男女",100,"不知道");
    }
}
class Movie{
    private String name;
    private double price;
    private String director;
    {
        System.out.println("电影屏幕打开...");
        System.out.println("广告开始...");
        System.out.println("电影正是开始...");
    }

    public Movie(String name, double price, String director) {
        System.out.println("(String name, double price, String director)构造器被调用");
        this.name = name;
        this.price = price;
        this.director = director;
    }

    public Movie(String name, double price) {
        System.out.println("(String name, double price)构造器被调用");

        this.name = name;
        this.price = price;
    }

    public Movie(String name) {
        System.out.println("(String name)构造器被调用");
        this.name = name;
    }
}
