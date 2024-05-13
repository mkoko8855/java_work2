package com.kosta.abstract1;

//상속 받은 abstract 메서드를 '반드시' 구현해야한다. -> 자식클래스에서 오버라이딩!
public class Basic2 extends Basic {
	
	
	//반드시 부모 클래스에 있는 추상메서드를 반드시 오버라이딩!★★★★★★★★★★★★
	public      void absMethod() {
		System.out.println("부모에 있는 메서드를 자식으로 와서 오버라이딩으로 바디 완성해!");
	}
	
	
	
	//근데 만약 부모클래스에서 추상메서드가 여러개있는데 그 중 하나를 쓰기위한다해도
	//나머지도 전부 오버라이딩 해야 한다.
	public     void absMethod2(){}

	public     void absMethod3(){}

	public     void absMethod4(){}
	
	
	//또한 부모 클래스에서 정의한 nomalMethod는 그냥 필요하면 오버라이딩 해도 된다. 안해도됨.
	public void nomalMethod() {
		System.out.println("부모에 있는 메서드를 자식으로 와서 필요하면 오버라이딩 해도 되는 부분");
		System.out.println("이제 부모가 아닌 자식의 nomalMethod다!");
	}
	
	
	
	
	public static void main(String[] args) {
		
		//쓰겠다 안쓰겠다 여부는 자식에서 사용한다.
		//그럼 노말메서드 쓰는 방법은?
		//new할 수 있는 얘로 하면됨.
		Basic2 c = new Basic2();
		c.nomalMethod(); //->자식 인스턴스 생성(상속받았기에 부모 메서드 호출 됨)
		c.absMethod(); // -> 상속받아서 오버라이딩된 자식의 메서드를 호출한다.
		
		staticMethod(); //스태틱메서드는 사용 가능!
		//자세히 쓴다면 아래처럼 써도 되는데 비추
		Basic.staticMethod();
		
		/*
		c.staticMethod(); 는?
		가능하지만, c로 접근하는건 잉여코드.
		주소가 있는데 굳이 우회해서 가져올 필욘 없다.
		*/
	
		
		/*
		 
		 public      void absMethod() {
		System.out.println("오버라이딩으로 바디 완성해!");
	}
	     그럼 이거를 부모에서 불러와보자
		 
		
		Basic p = new Basic();
		p.absMethod();
		new를 못해서 부모에서 접근하는 것은 안된다.
		그럼 상속받았으니 자식에서 돼?
		
		*/
		
		
	
		
	}
	
	
	
	
}
