package com.kosta.Lec07;

public class AnimalSuperClass {
	String name;

    public AnimalSuperClass(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("부모클래스다에서 정의했다.");
    }
}
