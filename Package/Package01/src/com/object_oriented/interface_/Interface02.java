package com.object_oriented.interface_;

public class Interface02 {
    public static void main(String[] args) {
        MysqlDB mysqlDB = new MysqlDB();
        t(mysqlDB);
        OracleDB oracleDB = new OracleDB();
        t(oracleDB);
    }
   public static void t(DBInterface dbInterface){
        dbInterface.connect();
        dbInterface.close();
    }
}
