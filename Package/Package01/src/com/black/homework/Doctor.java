package com.black.homework;

public class Doctor {
    private String name;
    private String job;
    private String gender;
    private double sal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public Doctor(String name, String job, String gender, double sal) {
        this.name = name;
        this.job = job;
        this.gender = gender;
        this.sal = sal;

    }

    public boolean equals (Object obj){
    if ( this == obj){
        return true;
    }
    //过关斩将方法
        //判断运行内存如果不是的话就false
    if (! (  obj instanceof Doctor)){
        return false;
    }else{
        Doctor doctor = (Doctor) obj;
        return this.name.equals(doctor.name) && this.job.equals(doctor.job) && this.gender.equals(doctor.gender) && this.sal == doctor.sal;
    }
    }
}
