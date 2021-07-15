package com.company;

abstract class SmartPhoneFeatures {

    public void Model(){
        System.out.println("Note 8");
    }

    public void Camera(){
        System.out.println("8 MPXL Camera");
    }

    public void DualCam(){
        System.out.println("2MPXL Front facing Camera");
    }

    public void RAM(){
        System.out.println("8GB RAM");
    }

    public void Bluetooth(){
        System.out.println("Bluetooth 3.2V");
    }

    abstract void WiFi();

    public void TouchScreen(){
        System.out.println("5.6\" touch screen");
    }

}
