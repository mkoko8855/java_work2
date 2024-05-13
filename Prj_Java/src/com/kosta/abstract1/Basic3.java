package com.kosta.abstract1;

public abstract class Basic3 extends Basic { //근데 이줄에 abstract붙으면 메서드 오버라이딩 안해도됨. 그냥 abstract 메서드를 쓸 수 있다.

	@Override
	public void absMethod() {}
	@Override
	public void absMethod2() {}
	@Override
	public void absMethod3() {}
	@Override
	public void absMethod4() {}
	
	
	
	public static void main(String[] args) {
		//노말메서드 호출못함
		//nomalMethod(); -> public abstract class Basic3 extends Basic으로 선언했기에.
		Basic2 c = new Basic2();
		c.nomalMethod();
		//는 되는데 -> 자식은 일반클래스라서 부모 메서드 사용 가능 -> 지금 Basic2는 추상클래스가 아니기에 가능
		
		//Basic3 c3 = new Basic3()
	    //c3.nomalMethod();
		//는 안됨 -> 자식도 추상클래스라서 부모 메서드 사용 불가능 -> 지금 맨위에 abstract써있으니 이 Basic3도 추상 클래스가 된다.
	
	
	
	}


}
