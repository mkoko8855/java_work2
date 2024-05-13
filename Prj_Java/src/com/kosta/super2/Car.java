package com.kosta.super2;

public class Car {
    //Car 클래스에는 다음과 같은 3개의 메소드가 들어있다.
    public void carOn() {
        System.out.println("시동을 겁니다.");
    }
    public void drive() {//오버라이딩 될 메소드
        System.out.println("일반 주행 중입니다.");
    }
    public void carOff() {
        System.out.println("시동을 끕니다.");
    }
}


