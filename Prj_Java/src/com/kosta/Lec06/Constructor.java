//package com.kosta.Lec06;
//
//public class Constructor{
//	
//	String name;
//	int age;
//	
////	public Constructor() {
////		
////	}
//	
//	public Constructor() {
//		this("Unknown", 0);
//	}
//	
//	
//	public Constructor(String name) {
//		this(name, 55);
//	}
//	
//	
//	public Constructor(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//	
//	
//	public void show() {
//		System.out.println(name + "," + age);
//	}
//	
//	
//	
//	public static void main(String[] args) {
//
//		Constructor c1 = new Constructor(); //기본생성자 호출
//		c1.show(); //Unknown, 0
//		
//		Constructor c2 = new Constructor("Lee");
//		c2.show(); //Lee, 0
//		
//		Constructor c3 = new Constructor("Kim", 30);
//		c3.show(); //Kim, 30
//		
//	}
//
//}

package com.kosta.Lec06;

public class Constructor {
	
	int userPoint = 0;
	
	
	//static 메서드 안에서는 this 사용이 불가하다.
	//this는 생성자 함수를 호출 후에 만들어진 주소를 지칭하는 키워드.
	//언제 메모리에 올라갈 줄 알고..static은 실행하면서 바로 메모리에 올라가기 때문
	
	
	public Constructor(int userPoint) {
		
		this.userPoint = userPoint; //this란? 클래스가 인스턴스화 된 주소값. 즉, this는 new를 해서 만들어진 메모리에 올라간 값의 주소값이다.
		//System.out.println(this);   주소값이 나오는 것을 볼 수 있음
	}
	
	
	public void show() {
		System.out.println(this.userPoint);
	}
	
	
	public static void main(String[] args) {

		Constructor obj = new Constructor(500); //참조변수 obj
		obj.show(); //500
		
		
		
		
		
		
	}
}