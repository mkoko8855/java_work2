package com.kosta.Inh;

class Parent {

    public String addr;
    public int age;
    
    public Parent(String addr, int age) {
        this.addr = addr;
        this.age = age;
    }
}

class Child extends Parent {
    
    public String addr;
    public int age;
    
    public Child(String addr, int age) {
        super(addr + " 상록구", age + 10);
        
        this.addr = addr;
        this.age = age;
    }
    
    void search () {
      
       System.out.println("Parent cLass : {" + addr + ", " + age + "}");
       System.out.println("Child cLass : {" + super.addr + ", " + super.age + "}");
       System.out.println(super.age);
    }
  
  }

public class Inheritance {
    public static void main(String[] args) {
        Child child = new Child("경기 안산시", 20);
        child.search();
    }
}

// --------------------------------------------------------------------------------
// Parent class : {경기 안산시, 20}
// Child class : {경기 안산시 상록구, 30}
