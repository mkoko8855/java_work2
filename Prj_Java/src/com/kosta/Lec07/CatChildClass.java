package com.kosta.Lec07;

class CatChildClass extends AnimalSuperClass {

    public CatChildClass(String name) {
        super(name); // 부모 클래스의 생성자 호출
    }

    @Override
    public void makeSound() {
        System.out.println("부모클래스에서 따와서 재정의한거다."); 
    }
}
