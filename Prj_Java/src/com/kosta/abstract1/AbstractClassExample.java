package com.kosta.abstract1;

abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    // 추상 메소드
    public abstract void sound();

    // 일반 메소드
    public void eat() {
        System.out.println(name + "냠냠");
    }
}

// 추상클래스 상속
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + "가");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + "나");
    }
}

// 메인 클래스
public class AbstractClassExample {
    public static void main(String[] args) {
        Animal dog = new Dog("메인1");
        Animal cat = new Cat("메인2");

        dog.sound(); 
        cat.sound(); 

        dog.eat(); // 
        cat.eat(); // 
    }
}