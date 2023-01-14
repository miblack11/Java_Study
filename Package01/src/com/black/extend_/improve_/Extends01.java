package com.black.extend_.improve_;

import com.black.extend_.Graduate;
import com.black.extend_.Pupil;

public class Extends01 {
    public static void main(String[] args) {
        com.black.extend_.Pupil pupil = new Pupil();
        pupil.name = "银角大王";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(99);
        pupil.showInfo();
        com.black.extend_.Graduate graduate = new Graduate();
        graduate.name = "金角大王";
        graduate.age = 23;
        graduate.testing();
        graduate.setScore(50);
        graduate.showInfo();
    }
}
