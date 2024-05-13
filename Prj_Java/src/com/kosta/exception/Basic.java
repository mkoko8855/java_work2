package com.kosta.exception;

public class Basic {

	public static void main(String[] args) {

			int res = 0;
			try {
				//코드라인
				System.out.println("1.try");
				int num = 100;
				res = num / 0;	         //--->문제 코드
				
				//int[] arr = new int[3];
				//int[] arr = new int[] {1,2,3};
				int[] arr   = {1,2,3};
				System.out.println(arr[3]);  //--->문제 코드
				//for (int i=0; i<arr.length; i++) {
				//	System.out.print(arr[i]);
				//}

			} catch(ArrayIndexOutOfBoundsException e)	{
				//예외가 발생했을 경우
				System.out.println("2.catch");
				System.out.println(e.getMessage());
				System.out.println(e.getClass());
				//개발자 예외처리부 코드라인
			} catch(ArithmeticException e) {	
				//예외가 발생했을 경우
				System.out.println("3.catch");
				System.out.println(e.getMessage());
				System.out.println(e.getClass());
				//개발자 예외처리부 코드라인
			} catch(Exception e) {
				//예외가 발생했을 경우
				System.out.println("2.catch");
				System.out.println(e.getMessage());
				System.out.println(e.getClass());
				//개발자 예외처리부 코드라인
			}
			System.out.println();
			System.out.println(res);
			System.out.println("----done----");
		
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		
		
		String[] pets = { "강아지", "고양이", "짹짹이" };

		for (int i = 0; i < 4; i++) {
			try {
				System.out.println(pets[i] + "키우고 싶다");
			} catch (Exception e) {
				System.out.println("애완 동물의 정보가 없다.");
			} finally { // 예외가 발생 하든 말든 실행 하고 싶을 때 사용한다.
						// finally는 필수는 아님. 필요없으면 안 써도 됨, 주로 객체를 반납하거나 메모리에서 해제할 때 주로 사용한다.
				System.out.println("예외 발생 하던 말던 아무튼 실행 될 문장");
				System.out.println("----------------------------");
			}
		}
	}
	

}
