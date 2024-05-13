package com.kosta.Lec07;

class DogChildClass extends AnimalSuperClass {

    public DogChildClass(String name) {
        super(name); // 부모 클래스의 생성자 호출
    }

    @Override
    public void makeSound() {
        System.out.println("마찬가지로 부모꺼 불러서 재정의한거다.");
    }
}