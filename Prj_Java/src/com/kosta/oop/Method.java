package com.kosta.oop;

public class Method {
	public static void main(String[] args) {
		//System.out.println("main");
		main(7); //메서드를 호출(사용)한다 라고 표현한다.
		
		int callRes = add(1, 8);
		System.out.println(callRes); //9
		//아래 add메서드에서 static안쓸꺼면 객체 만들어줘야함
	
		
		
		int a = 3;
		int b = 6;
		Method me = new Method();
		int c = me.sum(a,b);
		System.out.println(c); //9
		
		
		
		System.out.println(sum2(1, 2)); //2, 추천X
		
	}
	
	//메서드 정의(준비) 또한, 메서드는 헤더와 바디로 나눠진다.
	public static void main(int args) { //헤더
		System.out.println("오버로딩 한 main");
	}
	
	public static int add(int a, int b) {
		int res = a + b;
		return res;
	}
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	
	public static int sum2(int a1, int b1) {
		return a1*b1;
	}
	
	
	
	
	
	
	
}
