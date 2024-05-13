package com.kosta.Lec06;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

//		System.out.println("이름?");
//		Scanner sc = new Scanner(System.in); //스캐너에는 기본생성자가 없음
//		String str = sc.nextLine(); 
//		//int score = sc.nextInt();
//		System.out.println(str + " 이라고 함");
//		//Integer.parseInt(str); //문자열(참조타입 String)을 정수로 바꾸고 싶다면 파싱 
//		
//
//		System.out.println("전화번호?");
//		//String age = sc.nextLine(); 
//		
//		int numAge = Integer.parseInt(age);
//		System.out.println(numAge + 2);
//		//바로 위 두줄과 동일한 결과
//		int num = sc.nextInt();
//		System.out.println(num+2);
//		
//		//System.out.println(age + " 이라고 함");
//		System.out.println(str + num);

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("이름 : ");
			String name = sc.nextLine();

			if (name.equals("exit")) {
				break;
			}

			System.out.println("나이 : ");
			int aging = sc.nextInt();
		}
	}
}
