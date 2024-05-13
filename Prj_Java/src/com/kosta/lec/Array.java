//20240429 1

package com.kosta.lec;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		 int[] arr = new int[6]; //6개의 int값을 저장할 수 있는 배열을 생성한다.
			for (int i=0; i<6; i++){
				System.out.println(arr[i]);
			}
		// 0 0 0 0 0 0 
			
			
			int[] dan = {1, 2, 3, 4, 5, 6, 7, 8, 9};
			int[] gob = {1, 2, 3, 4, 5, 6, 7, 8, 9};
			
			for(int i=0; i<dan.length; i++) {
				System.out.println(dan[i] + "단");
				for(int j=0; j<gob.length; j++) {
					System.out.print(dan[i] + " x " + gob[j] + " = " + (dan[i]*gob[j]) + "\t");
				}
				System.out.println();
			}
			
			
			
			
			
			//배열 선언 및 초기화 방법
			int[] num = new int[3];
			System.out.println(num); //주소값나옴
			System.out.println("num 배열의 길이 : " + num.length); //3
			System.out.println(num[0]); //0
			System.out.println(num[1]); //0
			System.out.println(num[2]); //에러 -> 인덱스가 2까지임
			
			
			
			
			System.out.println("______________________");
			
			
			
			//int[] num = new int[3] 을 반복문으로쓰면
			for(int i=0; i<3; i++) {
				System.out.println(num[i]);  // 0 0 0
			}
			
			
			//그러나 길이가 바뀔 수 있기 때문에
			for (int i=0; i<num.length; i++) {
				System.out.println(num[i]);  // 0 0 0
			}
			
			
			
			//10 20 30 형태로 초기화하고싶다?
			int [] numArr = {10, 20, 30};
			System.out.println(Arrays.toString(numArr)); //[10, 20, 30]
			System.out.println(numArr); //주소값이 나옴
			System.out.println(numArr[0]); //10
			
			
			
			//9. 배열의 생성과 동시에 초기화도 진행 할 수 있는 방법
			char[] letters =  {'A', 'B', 'C', 'D'};
			System.out.println(letters);    //출력결과 :  ABCD
			System.out.println(Arrays.toString(letters));  //출력결과 : [A, B, C, D]
			
			
			
			
			//9번에 이어서 하나 더 있다. 선언과 동시에 초기화를 할 때 딱 1번만 가능한 문법
			String[] names = {"홍길동", "김철수", "박영희"};
			//배열의 크기를 느리거나 줄이고 싶다면 기존의 배열을 조작하는 것이 아니라 새롭게 생성해야 한다.
			//names = new String[]{"홍길동", "ㅋㅋㅋ", "ㅎㅎㅎ", "ㄴㄴㄴ"}; 로 바꿀 수 있음
			
			
			
			System.out.println("111111111111111111");
			
			int[] arr1 = {10, 20, 30, 40, 50};
			int sum = 0;
			
			for(int i = 0; i < arr1.length; i++) {
				sum += arr1[i];
			}
			System.out.println("sum = " + sum);
			//sum = 150
			System.out.println("222222222222222222");
			
			
			/*
			 for(배열 요소를 받아 줄 수 있는 변수 : 배열변수명) {
			 		이쪽은 반복 실행문을 써주면 된다.
			 	}
			 */
		
			String[] week = {"월", "화", "수", "목", "금", "토", "일"};
			//일반 for문 사용
			for(int i=0; i<week.length; i++) {       
				System.out.println(week[i]);  //출력결과 : 월요일 좋아요 화요일 좋아요 수요일 좋아요 목요일 좋아요...
			}
			
		
			//향상 for문 사용, day는 임의로 설정해준 것, 즉 우항을 받아줄 수 있는 데이터 타입의 명을 새롭게 정의해주면 됨.
			for(String day : week) {  //그러나 향상된 for문은 index 요소 하나하나를 활용 할 수 없음. 인덱스 자체를 설정 안 했기 때문.
				System.out.println(day + "요일 좋아요");  //출력결과 : 월요일 좋아요 화요일 좋아요 수요일 좋아요 목요일 좋아요...
			}
			
			
			
		
			
			
			
			
			
			
			
			
//			Scanner sc = new Scanner(System.in);
//			String[] names1 = new String[6];  //입력받을것이기 때문에 바로 {}로 생성은 불가.
//			
//			for(int i = 0; i < names1.length; i++) {
//				System.out.print("이름을 입력하세요 : ");
//				String name = sc.next();		
//				if(name.equals("그만")) {
//					System.out.println("입력을 종료합니다.");
//					break;
//				}
//				
//				names1[i] = name;
//			}
//			
//			System.out.println(Arrays.toString(names1));
			
			//6명의 이름을 차례로 입력하면 [홍길동, 김철수, 박영희 , , , ] 로 출력됨.
			
			
			
			
			
			int[][] arr4 = {
					{1, 2, 3},
					{4, 5, 6},
					{7, 8, 9},
					{10, 11, 12, 13, 14}
			};
			
			
			System.out.println(arr.length);  //출력 결과 : 4
			System.out.println(Arrays.toString(arr4)); //16진수출력됨
			System.out.println(Arrays.toString(arr4[0])); // [1,2,3]
			System.out.println(Arrays.toString(arr4[1])); // [4,5,6]
			System.out.println(Arrays.toString(arr4[2])); // [7,8,9]
			System.out.println(arr4[2][1]); //8이 출력됨 -> 
			System.out.println(arr4[2][2]); //9이 출력됨
			System.out.println(arr4[1][0]); //4이 출력됨
			System.out.println(Arrays.deepToString(arr4)); //배열 전부
			
			System.out.println("-------------------------");
			
			
			int[][] score = new int[][] {
				{100, 70, 80},
				{99, 88, 77}
			};
			
			System.out.println(score.length); //2찍힘
			System.out.println(score[0]); //주소값찍힘
			System.out.println(score[0].length); //3찍힘
			
			//그냥 반복문으로 출력하기
			for(int i=0; i<score.length; i++) {
				for(int j=0; j<score[0].length; j++) {
					System.out.print(score[i][j]+"\t");
				}
			}
			
			
			//위 2차배열을 반복문으로 출력하기
				for(int[] array : score) {
					for(int n : array) {
						System.out.print(n + " ");
					}
				}
				System.out.println();
			
				
				
				int[][][] score3 =  {{
						{1, 2, 3, 4},
						{5, 6, 7, 8},
						{9, 10, 11, 12}
				}};
				System.out.println(score3[0][0][0]); //1
				System.out.println(score3[0][2][1]); //10
				
				
				
				//가변배열
				//다차원 배열에서 마지막 차수의 크기를 지정하지 않고 각각 다르게 지정
				int[][] score6 = new int[5][];
				score6[0] = new int[3];
				score6[1] = new int[3];
				System.out.println(score6[1]); //주소값
			
			
				//배열의 복사
				int[] number1 = {1,2,3,4,5};
				int [] newnumber1 = new int[10];
				
				for(int i=0; i<number1.length; i++) {
					newnumber1[i] = number1[i]; //배열 number1값을 newnumber에 저장한다.
				}
				
				
				int[] arr7[]; //가능. 그러나 보통 int[][]arr 이거나 int arr[][] 라고 함
				int[] arr8 = {1,2,3,}; //선언과 동시에 사용자 값을 할당해서 초기화 -> 사용자 정의 초기화 라고도 함. 즉, 에러안남
				int[] arr9 = new int[5]; //가능
				//int[] arr10 = new int[5] {1,2,3,4,5}; //에러
				//int arr11[5]; 에러
				int[] arr12[] = new int[3][]; //가능
				
				
				//arr[3].length은 무엇인가?
				int[][] arr13= {
						{5, 5, 5, 5, 5},
						{10, 10, 10},
						{20, 20, 20, 20},
						{30, 30}
				};
				System.out.println(Arrays.toString(arr13[3])); //30 30 -> 2
				
				
				
				//총합과 평균 구하기
				int[][] arr14 = { 
						{ 5, 5, 5, 5, 5}, 
						{10,10,10,10,10}, 
						{20,20,20,20,20}, 
						{30,30,30,30,30} 
						}; 
				
				int total = 0;
				float average = 0;
				int count = 0; //몇번루프?
				for(int i =0; i<arr14.length; i++) {
					for(int j=0; j<arr14[0].length; j++) {
						total += arr14[i][j];
						count++;
					}
				}
				average = (float)total / count;
				System.out.println("total="+total); 
				System.out.println("average1="+average);
				
				
				System.out.println("----------------------------");
				
				
				//또는
				int[] score5 = new int[] {90, 85, 75, 80, 95};
				int sum3 = 0;
				float avg1 = 0;
				
				for(int i=0; i<score5.length; i++) {
					sum3 += score5[i];
				}
				avg1 = sum3/(score5.length);
				System.out.println(sum3);
				System.out.println(avg1);
				
				System.out.println("----------------------------");

				
				//총합과 평균구하기
				  int[][] array = {
				            {95, 86},
				            {83,92,96},
				            {78, 83, 93, 87, 88}

				        };

				        int sum2 = 0;
				        double avg = 0.0;
				        int avg_su = 0; //카운트용
				        
				        for(int i=0; i<array.length; i++) {
				            for(int j=0; j<array[i].length; j++) {
				                sum2 += array[i][j]; // 2차원 배열의 값을 꺼내서 총합을 구한다

				                avg_su++; // 평균을 내기 위해 총 갯수를 구한다.

				            }

				        }
				        avg = sum2 / avg_su;

				        System.out.println("총합 : " + sum2);
				        System.out.println("평균 : " + avg);
		
				        
				     // 큰 금액의 동전을 우선적으로 거슬러 줘야한다
				        int[] coinUnit = {500, 100, 50, 10};
				        int money = 2680;
				      
				        System.out.println("money="+money);
				        int res = 0;
				        for(int i=0;i<coinUnit.length;i++) {
//				        	int sum4 = money / coinUnit[i];
//				        	System.out.println(coinUnit[i] + "원" + money/coinUnit[i] + "개");
//				        	System.out.println(sum4);
//				        	money = money % coinUnit[i];
				        	res = money / coinUnit[i];
				        	System.out.println(coinUnit[i] + "원 : " + res + "개");
				        	money = money % coinUnit[i];
				        }
				        
				        	
				        
				        System.out.println((char)65); // A
				        

				        
				        
				         // 32~126 아스키 코드 출력 --> 오류
				        for(int i=32; i<=126; i++) {
				        	char char1 = (char)i;
				             System.out.println("아스키 코드 : " + i + "문자 : " + char1) ;
				        }
				        
				        int inputNum = 65; //A를 출력
				        System.out.println((char)inputNum); //A
				        
				        System.out.println("1111111111111111111");
				        
				        char inputChar = 'A';
				        System.out.println((int)'A'); //65
				        
				        System.out.println("!!!!!!!!!!!!!!!!!!");
				        
				        
				        //65 66 67로 출력하라
				        //charAt(i) : str --> char
				        String inputStr = "ABC";
				        char c = inputStr.charAt(0);
				        System.out.println((int)c); //65
				        
				        System.out.println("!!!!!!!!!!!!!!!!!!");
				        
				        for(int i=0; i<inputStr.length(); i++) {
				        	System.out.println((int)inputStr.charAt(i));
				        }
				        
				        //또는
				        //toCharArray(str) --> char[]       length() 주의!!
				        char[] carr = inputStr.toCharArray();
				        for(int i=0; i<carr.length; i++) {
				        	System.out.println(carr[i] + "," + (int)carr[i]);
				        }
				        
				        
				        //또는
//				        String inputStr1 = "ABBC";
//				        char c1 = ' ';
//				        for (int i=0; i<inputStr1.length(); i++) {
//				        	c1 = inputStr.charAt(i);
//				        	System.out.println(c1 + "," + (int)c1);
//				        }
				        
				        
				        
				        
				        
				        
	}

}
