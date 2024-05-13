// 20240423 1, 20240424 1
package com.kosta.lec;

import java.util.Scanner;

// 접근제어자 -> public default protect private

public class Hello {

	// 변수(variable)
	// 메서드(method)
	// 함수(function) : 생성자함수

	// 위를 객체(Object)라고 하기도 한다.
	// 객체와 비슷하게 인스턴스 라고 부르기도 한다.
	// 주소값을 갖고있는 객체, 또는 실행 가능하게끔 메모리에 올라간 객체 를 인스턴스 라고 하고
	// 올리는 과정을 인스턴스 화 라고 한다.

	public static void main(String[] args) {

		// 변수를 나타내는 방법은 타입이 필요하다.
		// 변수 표시 법은 다음과 같다
		
		// 타입 변수명;
		// 또는
		// 타입 변수명 = 값;
		//int age; 이것을 변수를 선언하다 라고 표현한다.
		//int age = 20; 이것은 변수를 선언한 뒤에 값을 (값 최초 할당. 즉, 초기화)한다고 표현한다.
		//int age = 30; 이것은 초기화 후에 다른 값을 할당한 것이다. 이것을 할당이라고 한다.
		//할당과 초기화는 다른 말이자 다른 표현이다.
		
		int age = 20;
		System.out.println("hello" + age);
		
		//컴퓨터는 주소를 4바이트로 표현한다. 주소는 16진수(0~9까지, 그리고 A~F까지는 10진수)다
		//4바이트는 32비트로 표현될 수 있다. 주소는 Ox4NF3D64..이렇게 32글자로 한다. 그것이 주소다.
		//20240423 1 끝
		
		
		
		
		
		
		
		
		
		
		//20240424 1 시작
		long lv = 1000;
		long lv2 = 1000L;
		System.out.println(lv);
		System.out.println(lv2);
		//결과는 같은데, 차이점이 뭘까?
		//lv에는 1천이라는 int(4바이트)를 넣는데, 작은수가 더 큰 수인 long으로 캐스팅이 일어난다.
		//lv2는 캐스팅이 아니라 그냥 같은 long이기 때문에 캐스팅이 일어나지 않는다.
		
		
		
		
		
		double dv = 3.14;
		double dv2 = 3.14d;
		System.out.println(dv+", "+dv2);
		//결과는 똑같이 3.14다. 실수형의 기본 타입은 double이기 떄문에 캐스팅이 일어나지 않음.
		
		
		
		
		
		
		boolean bv = true;
		boolean bv2 = false;
		System.out.println(bv + ", " + bv2); //결과 : ture, false
		
		
		
		
		
		char cv = 'A';
	  //char cv = 'AB'; 에러난다.
		
		
		
		
		
		
		
		String sv = "smith"; //문장이나 2개이상단어로 이루어지면 "" 써야한다.
		
		
		
		
		
		
		
		System.out.println("abc\n  def\t"); // \n은 줄바꿈, \t는 tab이다.
		
		
		
		
		
		
		
		
		boolean db; //변수를 선언만 했지 값을 담지 않았다. 즉, 선언만 하고 초기화를 하지 않았다.
		//선언은 가능하지만 다른곳에서 해당 변수를 사용하려고 할 때 값이 담겨져 있지 않기 때문에..안됨
		// System.out.println(db); 당연히 실행안됨. 초기화 하지 않았기 때문에 에러.
		
		boolean db2 = true; //와 같이 초기화를 반드시 해야 한다.
		System.out.println(db2);
		
		
		
		
		
		
		
		
		// char cv3 = ''; 에러다. 아무것도 없어서.
		char cv3 = ' '; //공백을 넣어주던가해.
		
		
		
		String str = ""; //이건 공백으로, 빈 값을 준 것이다.
		String str1 = null; //String은 레퍼런스타입(참조형타입)이라 기본값이 null이다. 주소 할당을 안한 것이다.
		System.out.println(str+str1);
		
		
		
		
		//즉, 초기화는 다음과 같다
		boolean isGood = false;
		char grade = ' ';
		byte b = 0;
		short s = 0;
		int i = 0;
		long l = 0;
		float f = 0;
		double d = 0;
		String s5 = null;
		String s2 = "";
		
		
		
		
		
		
		//문자열엔 어떠한 연산을 갖다 붙여도 결과는 문자열이다
		boolean bv3 = false;
		System.out.println(bv3);
		System.out.println(bv3 + "");
		//둘다 false다. 그러나 밑은 글자 5개인 f.a.l.s.e가 찍힌 것이다.
		System.out.println(7+7+"");
		//값은 14가 나오지만, 14라는 숫자가 아닌 문자열이 출력 된다.
		
		
	
		
		
		
		
		
		//byte h = 128; 에러 -> -2^7의 크기를 넘어 섰기 때문에 127까지만 허용한다.
		//h = h + 1; 이거또한에러
		
		byte j = 127;
		System.out.println(j);  //결과 : 127
		System.out.println(b+1); //결과 : 1   int가 되어버린 것이다.
		//j에 다시 담아서 출력해보면
		int qwe = j + 1;
		System.out.println(qwe); //128이 나온다
		
		//그러나 굳이 꼭 byte에 담고 싶다면?
		byte asd = (byte)(j + 1); //큰 타입을 작은 타입으로 강제 캐스팅 한것이다. int를 byte로 바꾸려 하낟.
		System.out.println(asd); //값은 -128이 나온다. 왜? 오버플로우의 특징이다. 최대값을 넘어가버리면 최소값으로 돌려버린다.
		
		
		
		//float은 4바이트고 3.14는 8바이트(더블이다) 왜? 실수형은 디폴트가 8바이트 이기 떄문이다.
		//이럴 경우 강제 캐스팅 해주면 된다.
		float f4 = (float)3.14;
		
		
		// 작은 타입이 큰 타입으로 들어올 경우
		// 암묵적 캐스팅 (강제캐스팅X)
		// double(8) <-- float(4)
		double fg = 1.4e3f; 
		double fg2 = (double) 1.4e3f; //굳이 더블 할 필요 X
		//즉, 캐스팅은 큰쪽이 작은 쪽으로 가는 경우만 주의하면 된다.
		
		
		
		
		System.out.println('A' + 'B'); //131 A=65, B=66 
		System.out.println('1' + 2); //51  1은 아스키코드값 49이기 때문이다.
		System.out.println('1' + '2'); //99 49+ 2는 아스키코드값 50 이기 떄문이다.
		
		
		//'A'라는 char는 컴퓨터가 int로 바꾼 후, 이진법 1000001로 바꾼다(인코딩과정).
		 
		
		
		
		
		
		//문제 : 형변환 생략 가능한 경우
		byte b10 = 10;
		char ch10 = 'A';
		int i10 = 100;
		long l10 = 1000L;
		
		b10 = (byte)i10; //int가 byte로 가기 때문에 형변환이 필요함
		System.out.println(b10); 
		ch10 = (char)b10; //byte와 char는 형태가 달라서 형변환이 필요함
		short s10 = (short)ch10; //char와 short는 형태가 달라서 형변환이 필요하다
		float f10 = (float)l10; //float이 long보다 크기 떄문에 형변환 생략 가능
		i10 = (int)ch10; //char(2) -> int(4)로 생략가능
		System.out.println(s10);
		
		
		
		
		
		//다시 풀어보면
		byte bb   = 10;
		char chch = 'A';
		int ii    = 100;
		long ll   = 1000L;
		
		bb        = (byte)ii; //4바이트가 1바이트로 간다는 뜻
		chch      = (char)bb; //1바이트에서 2바이트론 가지만, 타입이 달라서 안된다.
		short ss  = (short)chch; //마찬가지로, 크기는 상관없는데 타입이 달라서 안된다.
		float ff  = (float)ll; //(float)지워도 문제안생긴다. 실수형4바이트가 정수형8바이트보다 크기 떄문이다.
		ii        = (int)chch; //1바이트에서 4바이트로 가기 떄문에 상관없음.
		//그러나, 인트로 바이트로 바꾸는건 왜문제가 없음? 캐릭터로 인트로 바꾸는건 왜 문제가없음?
		//int형에 관련된 것은 타입미스매치를 내지 않고 있다.
		
		
		
		
		b = (byte)i; //는 생략이 가능할까? 바이트를 지우면 안된다. 생략불가.
		
		//chch = bb; 바이트에서 캐릭터로는 생략이 안된다. 바이트라는 유니코드를 글자로 어떻게 바꿈? 즉, 생략 불가.
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
		
		
		
		
		
	}


