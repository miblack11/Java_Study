package com.black.pag;

import java.util.Arrays;

//注意：
//建议使用那个方法就导入那个方法
//只导入java.util 下的scanner这个方法
//import java.util.Scanner;
//导入java.util这个类的全部方法
//import java.util.*;
public class Import01 {
    public static void main(String[] args) {
        int arr[] = {-2,34,5,34,3,6,54,6};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
