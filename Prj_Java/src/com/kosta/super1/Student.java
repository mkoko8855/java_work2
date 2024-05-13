package com.kosta.super1;
//자손클래스

public class Student extends People {
    public int score;

    public Student(String name, int age, int score) {//3개의 매개변수를 받는 생성자
        super(name, age);//name과 age는 부모 생성자를 호출하는 super()를 이용
        this.score = score;
    }
}
