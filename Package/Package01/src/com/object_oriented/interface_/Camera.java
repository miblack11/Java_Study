package com.object_oriented.interface_;

//实现接口，就是把接口方法实现
public class Camera implements UsbInterface{
    @Override
    public void start() {
        System.out.println(
                "相机开始工作"
        );
    }

    @Override
    public void stop() {
        System.out.println("相机结束工作");
    }
}
