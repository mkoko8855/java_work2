package com.kosta.sample.quiz1;

//패키지명 : com.kosta.sample.quiz1
//
//다음과 같은 정보를 관리하는 Sukang 클래스가 있다.
//이름     국어   영어  수학
//-------  -----  -----  -----
//홍길동   100   90    80
//아무개     88   77    66
//
//###########################################################################
//1. Sukang 클래스에 국어,영어,수학 점수를 담을 수 있는 빈 배열 변수 scores를 생성하세오.
//    배열 변수 scores : 인스턴스 변수(접근제어자 private)
//    생성자 : 기본생성자
//
//
//2. Sukang 클래스의 부모 클래스 Score를 생성하시오.
//   생성자1 : "국어   영어  수학"이라는 타이틀을 출력하는 함수
//          실행결과)  국어   영어  수학
//   생성자2 : 국어,영어,수학 점수를 매개변수로 받아 출력하는 함수
//               (생성자1 함수를 사용할 것)
//           실행결과)  국어   영어  수학
//                         100   90    80
// 	           국어   영어  수학
//                          88   77    66
//
//3. Score 클래스에 각 과목의  "과목명 평균점수"를 계산해서 리턴해주는 subjectAverage() 함수를 생성하세요.
//   
//4. Score 클래스에 전체 응시인원수를 리턴해주는 userCount() 함수를 생성하세요.
//
//5. Sukang 클래스에서 subjectAverage() 함수를 재사용해 사용자 이름도 같이 출력되는 함수를 생성하세요.




public class Parent {

	private int[] scores = new int[3];
	static int korSum;
	static int engSum;
	static int mathSum;
	private int[][] s = new int[2][3];
	
	
	public Parent() {
		System.out.println("국어\t 영어\t 수학");
	}

	
	public Parent(int kor, int eng, int math) {
		this(); // new Score();
		this.korSum += kor;
		this.engSum += eng;
		mathSum += math;
		System.out.println(kor + "\t" + eng + "\t" + math);
	}

	
	public Parent(int[] scores) {
		this();
		this.korSum += scores[0];
		this.engSum += scores[1];
		this.mathSum += scores[2];
		System.out.println(scores[0] + "," + scores[1] + "," + scores[2]);
	}
	

	
	 
}