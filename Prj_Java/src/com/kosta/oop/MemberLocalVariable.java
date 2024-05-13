package com.kosta.oop;

//멤버변수 와 지역변수의 차이점


/*
		 
		 # 멤버 변수(field, class member variable) 란 ? >  객체의 멤버가 되는 변수
		 1. 클래스 블록에 선언된 변수를 의미합니다.
		 
		 2. 메모리의 heap 영역에 저장되며, 값을 초기화하지 않아도
		  각 데이터타입의 기본값으로 자동 초기화됩니다.
		  
		 3. 객체를 가리키고 있는 레퍼런스변수(참조변수)가 사라지거나
		  주소값을 잃어버리게 되면, 메모리에서 가비지 컬렉터(gc)에 의해
		  자동으로 제거됩니다.

		 


		 # 지역 변수 (local variable)
		 1. 메서드나 생성자(=객체를 생성해주는 자) 블록 내부에서 선언된 변수를 의미합니다. (메인 메서드도 포함됨)
		 
		 2. 메모리의 stack영역에 저장되며, 선언된 블록을 벗어나면
		  메모리에서 자동으로 소멸합니다.
		  
		 3. 값을 초기화하지 않으면 변수를 사용할 수 없습니다.  //아래 b가 에러나는 이유..초기화해줘야됨
		 
*/
public class MemberLocalVariable {
	
	
	int a; //클래스 블럭에 있으니 멤버변수이다. 
	       //객체의 멤버(필드)가 되는 변수이다. (즉, 멤버변수(=필드)이다.)
	
	
	
	void printNumber(int c) {  //정수를 하나 전달받을 것, int c는 매개변수이다.
		int b=1;                 //지역변수
		System.out.println("멤버변수 a는 : " + a);  //a는 값을 주지 않아도 값이 당연히 0으로 초기화가 된다. 
		System.out.println("지역변수 b는 : " + b);  //그러나 b는 빨간줄이 긁힘..b는 값을 줄 사람이 없다. 메서드를 선언한 내가 줘야 된다.
												 //그래서 int b=?; 처럼 값을 줘야 한다.
		System.out.println("매개변수 c는 : " + c);
	}
	
	
	
	

	public static void main(String[] args) {
		
		MemberLocalVariable m = new MemberLocalVariable();
		m.printNumber(4);
		//출력결과
		//멤버변수 a는 : 0
		//지역변수 b는 : 1
		//매개변수 c는 : 4
		
		
		
		
		
		
		
		
	}
}
