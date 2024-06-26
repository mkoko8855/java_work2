package com.kosta.sample.pkg;

//패키지 = 폴더
//유사한 기능을 하는 클래스의 묶음
import com.kosta.sample.pkg.DelDel;

class Parent {
	public Parent() {}
	
	
    public Parent(String name) {
        System.out.println("Parent() 생성자 콜");
    }
}


public class DelCall extends Parent {
	
	public DelCall() {
		super("ABC"); //위 부모클래스의 String name 받았으니 하드코딩해도됨. 근데 맨위에 기본생성자 넣었음
		//super(); //모든생성자에는 super()다 따라들어간다. 숨어있는중.
		System.out.println("DelCall() 기본생성자 콜");
	}
	
	public DelCall(int a) {
		super(); //Parent()를 부른다. 이건 숨은 코드다. 자식의 생성자를 호출할 때 상속(extends Parent)는 있는데, 부모의 생성자 호출이 없을 경우, 컴파일러가 기본 부모 생성자를 추가해준다.
		System.out.println("DelCall(int a) 생성자 콜");
	}
	
	
	
	public static void main(String[] args) {
		
		//남의 클래스 가져다 사용할 경우
		//1. import패키지부터 확인
		//2. 메모리에 올려야 실행 가능 -> 남의 클래스를 메모리에 올리는 것은 생성자뿐이니, new 생성자();가 기본인건지 매개변수를 받는지에 맞춰서 써주자
		//3. DelDel클래스의 생성자로 d = new 생성자(); --> d.메서드()해서 사용.
		
		
		DelCall cd = new DelCall(5); //출력결과는 Parent()와 DelCall() 같이 찍힌다.
		
		DelDel d = new DelDel();
		d.myprint();//출력결과는 ddd만 찍힌다.
		
		
		
		DelCall me = new DelCall();
		DelCall me2 = new DelCall(5);
		
		
		
		System.out.println("------------------------------------");
		//3
		char a;
		char b;
		System.out.println('A'+'B'+""+null);
		// "" + null의 결과가 "null"
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
