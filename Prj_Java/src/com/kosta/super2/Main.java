package com.kosta.super2;

public class Main {
    public static void main(String[] args) {
        SmartCar smartCar = new SmartCar(); //객체 생성
        smartCar.carOn();
        smartCar.drive();
        smartCar.driveMode = SmartCar.SMART; //driveMode를 SMART로 바꿈
        smartCar.drive();
        smartCar.carOff();
    }
}
