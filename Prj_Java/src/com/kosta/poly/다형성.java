package com.kosta.poly;

/*
다형성 -> 다양한 형태의 성질(여러타입에 접근할 수 있는 방법) 
	
  Parent pc = new Child();
  자식 인스턴스로 부모타입의 객체에 접근하는 것
  
?	-> Parent에 있는 메서드와 자식에서 오버라이딩된(부모타입으로된) 것을 사용할 수 있다.

	
자신의 클래스에 있는 메서드들(부모에게도 있는 자식의 메서드(오버라이딩)
멤버들을 제한적으로 사용하되, (부모에게 있는 자식메서드만 사용가능)
공통의 것을 해야 할 때 '다형성'을 사용한다.

*/



class 다형성부모 {
	public int point = 100; //자식에서 오버라이드했으니 어차피사용안됨
	
	public void add(int a) { //자식에서 오버라이드했으니 어차피사용안됨
		System.out.println(a*100);
 
	}
	
	
	public void ParentMethod() {
		System.out.println("부모에만 있는 ParentMethod가 콜됨!");
	}
	
}



public class 다형성 extends 다형성부모 {

	public int point = 10; //없으면 위에 point = 100 씀.

	
	@Override
	public void add(int a) { //오버라이드했으니 부모것이아님.
		System.out.println(a*10);
	}
	
	
	//일반메서드도만들기
	public void childMethod() {
		System.out.println("자식에만 있는 childMethod가 콜됨!");
	}
	
	
	public static void main(String[] args) {
		//1. 자식타입 = 자식인스턴스(); 로 연습해보자
		다형성 c = new 다형성();
		System.out.println(c.point); //10점이찍힘 -> 자식꺼만나옴.
		c.add(8); //80점이찍힘 -> 자식꺼만나옴.
		//그럼 부모한테만 있는건? -> 상속받았으니 다사용할수있음
		c.ParentMethod(); //출력됨
		//그럼 자식한테만 있는건?
		c.childMethod(); //출력됨
		
		
		//2. 이번에는 부모타입 = 부모인스턴스();로 연습해보자
		다형성부모 p = new 다형성부모();
		System.out.println(p.point); //부모꺼 100점 나옴
		p.add(5); //부모꺼 500점 나옴
		p.ParentMethod(); //부모꺼 나옴
		
		
		
		
		//3. 이제 다형성 -> 부모타입 = 자식인스턴스();
		다형성부모 pc = new 다형성();
		System.out.println(pc.point); //부모한테있는걸찍어! -> 부모있는거 100나옴
		pc.add(3); //자식이나옴! 30 -> 자식에서 오버라이딩했으니까!
		pc.ParentMethod(); //부모한테만 있으니 부모께 나옴!
//      pc.childMethod(); 안됨. 객체타입이 부모이기에, 자식만 있는 것은 에러!
		
		
		
	}

}
