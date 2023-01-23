package com.object_oriented.interface_;

public class Computer {
    void work(UsbInterface usbInterface){
        usbInterface.start();
        usbInterface.stop();
    }
}
