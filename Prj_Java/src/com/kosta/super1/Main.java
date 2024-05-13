package com.kosta.super1;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("김철수", 22, 98);//3개의 매개변수를 전달
        System.out.println("이름 : " + student.name);//부모 클래스의 필드 출력
        System.out.println("나이 : " + student.age);//부모 클래스의 필드 출력
        System.out.println("점수 : " + student.score);
    }
}
