package com.kosta.Lec07;

public class Main {

	public static void main(String[] args) {
		AnimalSuperClass a1 = new AnimalSuperClass("a1입니다.");
        DogChildClass a2 = new DogChildClass("a2입니다.");
        CatChildClass a3 = new CatChildClass("a3입니다.");

        a1.makeSound(); 
        a2.makeSound();          
        a3.makeSound();      
	}

}
