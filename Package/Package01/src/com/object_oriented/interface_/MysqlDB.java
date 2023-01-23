package com.object_oriented.interface_;

public class MysqlDB implements DBInterface{//A程序员连接MySQL
    @Override
    public void connect() {
        System.out.println("连接Mysql");
    }

    @Override
    public void close() {
        System.out.println("关闭mysql");
    }
}
