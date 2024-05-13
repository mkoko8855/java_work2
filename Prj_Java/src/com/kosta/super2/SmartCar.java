package com.kosta.super2;

public class SmartCar extends Car{
    public static final int NORMAL = 1;
    public static final int SMART = 2;

    public int driveMode = NORMAL;//driveMode는 기본적으로 NORMAL임

    @Override // 밑의 메소드가 오버라이딩된것이라는 것을 알려주는 어노테이션
    public void drive() {
        if(driveMode == NORMAL) {//driveMode가 NORMAL일 경우 부모 클래스인 Car 클래스의 drive 메소드를 사용.
            super.drive();
        }
        else {
            System.out.println("자동 주행 중입니다.");
        }
    }
}
