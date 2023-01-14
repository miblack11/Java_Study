package com.black.extend_.exercise;
 //编写 Computer 类，包含 CPU、内存、硬盘等属性，
 // getDetails 方法用于返回 Computer 的详细信息
public class Computer {
    private String cpu;
    private int memory;
    private int dick;

     public Computer(String cup, int memory, int dick) {
         this.cpu = cup;
         this.memory = memory;
         this.dick = dick;
     }

     public String getCup() {
         return cpu;
     }

     public void setCup(String cup) {
         this.cpu = cup;
     }

     public int getMemory() {
         return memory;
     }

     public void setMemory(int memory) {
         this.memory = memory;
     }

     public int getDick() {
         return dick;
     }

     public void setDick(int dick) {
         this.dick = dick;
     }
     public String getDetails(){
         return "cpu=" + cpu + " memory=" + memory + " dick=" + dick;
     }
 }
