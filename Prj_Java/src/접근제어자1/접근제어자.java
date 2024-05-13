package 접근제어자1;

import 접근제어자2.Other;


public class 접근제어자 {

	public static void main(String[] args) {
		
		
		//public > protected > default(아무것도안씀 -> int add() { reutrn 0; } 이런거.) -> private
		Other other = new Other();  // 객체 생성
        System.out.println(other.otherPoint);  // otherPoint 필드 접근
        other.otherMethod();  // otherMethod 메서드 호출
		
		
		
		
		
	}

}
