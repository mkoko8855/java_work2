package com.kosta.interface1;


class 부모클래스 {         // 근데 부모클래스도 쓰고싶다면
	public void div() { // div도 오버라이딩도 쓰고싶다면
						// 아래 public class 인터페이스자식 implements 인터페이스에
						// public class 인터페이스자식 extends 부모클래스 implements 인터페이스
						// 라고하면됨
	}
}




public class 인터페이스자식 extends 부모클래스 implements 인터페이스부모1, 인터페이스부모2 {
	
	
	
//  인터페이스 클래스에 public void add(); 라고 했기에 오버라이딩 해야함. 위에 이클래스 위에 implemtents 인터페이스 라고 했기에.
//	@Override
//	public void add() {
//		
//	} 
//  근데 바로위에 implements 인터페이스를
//  implements 인터페이스부모1, 인터페이스부모2로 했으니 위 메서드는 필요가없는셈이됨.
	
	
	
	//인터페이스 클래스에 extends 인터페이스부모1, 인터페이스부모2 이렇게 적었기 때문에 아래도 오버라이딩 해야한다....
	@Override
	public void inter1ParentMethod1() {}

	@Override
	public void inter1ParentMethod2() {}

	@Override
	public void inter2ParentMethod1() {}

	
	
	
	
	
	
	public static void main(String[] args) {

	}

}
