package com.kosta.exception;

public class Throws1 {

	public void myPrint() {
		
		try {
			System.out.println("11");
			System.out.println("22");
			
			Exception MyExc = new Exception(); //강제에러 -> 캐치가 잡을거임
			throw MyExc; //근데 이줄이랑 바로윗줄 보단, 메서드에 public void myPrint() throws Exception{ 으로 해도됨
			//System.out.println("33"); MyExc를 만나는 순간 나가버림. 의미없는코드며 오류임.
	
		
		} catch(Exception e) {
			System.out.println("44");
			System.out.println(e.getClass());
			//e.printStactTrace();
		} finally {
			System.out.println("55");
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Throws1 t = new Throws1();
		//t.myPrint(); //위의 Exception객체는 예외처리는 호출한 이놈한테 던져버린다. 		Exception MyExc = new Exception(); 

		try { //만약위에캐치문이 없으면 이렇게 써야됨
			t.myPrint();
		} catch(Exception e) {
			System.out.println("잡았음");
		}
		
		
		
		System.out.println("myPrint 호출 끝");
		
		
		
		
		
		
		
		
		
		int res = 0;
		
		try {
			System.out.println("11");
			System.out.println("22");
			
			Exception MyExc = new Exception(); //강제에러내기. -> 익셉션내면 catch가 잡음.
			throw MyExc;
			//System.out.println("33"); MyExc를 만나는 순간 나가버림. 의미없는코드며 오류임.
		} catch(Exception e) {
			System.out.println("44");
			System.out.println(e.getClass());
		} finally {
			System.out.println("55");
		}
	}

}
