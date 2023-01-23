package com.object_oriented.interface_;

public class OracleDB implements DBInterface{//B程序员连接Oracle
    @Override
    public void connect() {
        System.out.println("连接Oracle");
    }

    @Override
    public void close() {
        System.out.println("关闭Oracle");
    }
}
