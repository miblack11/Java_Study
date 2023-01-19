package com.object_oriented.main_;

public class Main02 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            //若是要调用args数组就要访问 edit -> program
            System.out.println(args[i]);
        }
    }
}
