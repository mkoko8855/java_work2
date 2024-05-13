package com.kosta.override;


//오버 라이딩(over riding)
//상속관계에서 부모 메서드를 재사용 한다. -> 재사용은 메서드의 선언부는 같고, 구현부는 다를 수 있다고 하는 것.
class MyParent{
	
	public int myPrint(String name, int age) {
		System.out.println("부모인" + name);
		return age;
	}
}





public class Child extends MyParent {

	public int myPrint(String name, int age) {
		System.out.println("자식인 " + name);
		System.out.println(111);
		return age;
	} //근데 똑같이 오버라이딩할꺼면 왜 쓸까? 부모것이 내건데.
//    윗대로 안써야 할 때 오버라이딩을 사용하는 것이다. -> 구현부 바꾸는 것.
	
	
	
	public static void main(String[] args) {
		Child c = new Child();
		c.myPrint("홍길동", 20);
	}

}
