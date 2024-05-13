package com.kosta.oop;

public class Calc {

	public static void myPrint(String prm) {
		System.out.println(prm);
		//void면 return; 이것도 사용X
	}
	
	
	public static String add(String a, String b) {
		String res = a + b;
		return res;
	}
	
	public int div(int a1, int b1) {
		return a1+b1;
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		myPrint("hello"); //메서드가 void면 걍 부르고 끝내면됨. void res = myPrint("hello"); 이런식으로 쓰지마.
		
		
		
		String ress = add("가", "나");
		System.out.println(ress); //가나
		
		
		
		int a1 = 1;
		int b1 = 2;
		Calc obj = new Calc();
		int c1 = obj.div(a1, b1);
		System.out.println(c1); //3
		//또는
//		Calc ca = new Calc();
//		int result = Calc.div(5, 10);
//		System.out.println(result);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



