//20240425 2

package com.kosta.lec;

public class Quiz01 {

	public static void main(String[] args) {
		
		
		// 퀴즈1
		int x = 2;
		int y = 5;
		char c = 'A'; //'A' : 아스키코드 65
		
		System.out.println(y += 10 - x++); //13
		System.out.println(x += 2);        //5 
		System.out.println('C'-c);         //2
		System.out.println('5' - '0');     //5
		System.out.println(c+1);           //66
		System.out.println(++c);           //B
		System.out.println(c++);           //B
		System.out.println(c);             //C
		
		
		int score = 70;
		String grade = null; //null은 주소를 아직 할당하지 않은거임. grade가 없는 상태에서 아래 것들이 출력되게 하는거임
		if(score >= 90) {
			grade = "A";
		}else if(score>=80) {
			grade = "B";
		}else {
			grade ="F";
		}
		System.out.println(grade);
	}

}
