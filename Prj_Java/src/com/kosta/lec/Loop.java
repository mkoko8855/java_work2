//20240425 1

package com.kosta.lec;

public class Loop {

	public static void main(String[] args) {

		// for(초기화; 조건문; 증감문;) {할일}
		//int i = 0; //초기화 문장임
		//i<=5; //조건문 문장임
		//i = i+1; 를 깔끔하게 하면 i += 1 좀더 깔끔하게 하려면 i++;
		//for(int i = 0; i<=5; i++) {
			//System.out.println(i); // 0 1 2 3 4 5
			//System.out.println(i+1); // 0 1 2 3 4 5 6
			
		//}
		
		int sum =0;
		for(int a=1; a<=100; a++){
			sum = sum+a;
		}
		System.out.println(sum); //5050
		
		System.out.println("========================1");
		
		
		
		
		
		
		
		
		
		
		for(int a1=0; a1<=8; a1+=2) {
			System.out.println(a1);
		}
		
		System.out.println("========================2");
		
		int a2 = 0;
		while(a2<=8) {
			System.out.println(a2);
			a2+=2;
		}
		
		System.out.println("========================3");
		
		int a3=0;
		do {
			System.out.println(a3);
			a3+=2;
		} while(a3<=8);
	
		
		System.out.println("========================4");

		
		
		//다른 방법도 있다
		for(int num = 0; num<5; num++) {
			System.out.println(num*2);
		} 
		
		
		System.out.println("========================5");

		
		
		
		//구구단 전체 출력해봐(다했으면 뒷단이 1,3,5인거 찍어봐)
		for (int a4=1; a4<=9; a4++) {
			System.out.println(a4 + "단");
			for (int a5=1; a5<=9; a5++) {
				System.out.print(a4 + " x " + a5 + " = " + (a4*a5) + "\t");
			}
			System.out.println();
		}
		
				
		System.out.println("========================6");
		
		
		
		
		//2단의 뒷단도 2단인 것을 찍어라(2에서 6까지)
		for(int a6=2; a6<=6; a6+=2) {
			System.out.println(a6 + "단");
			for(int b6=2; b6<=6; b6+=2) {
				System.out.print(a6 + " x " + b6 + " = " + (a6*b6) + "\t");
			}
			System.out.println();
		}
	
		
		
		
		
		
		System.out.println("========================7");
		
//		int flag = 0;
//		for(int a6=2; a6<=8; a6+=2) {
//			if(flag == 0) {
//				for(int b6=2; b6<=6; b6+=2) {
//					System.out.print(b6 +"단" + "\t");
//				}
//				System.out.println();
//			}
//			flag = 1;
//			for(int b6=2; b6<=6; b6+=2) {
//				System.out.print(b6 + " x " + a6 + " = " + (a6*b6) + "\t");
//			}
//			System.out.println();
//		}
		
		
		
		
		
		System.out.println("========================8");

		
		
		
		
		
		
		//일부터 백까지 합 구해라.
//		int b = 1;
//		int sum2 = 0;
//			while(b<=100) {
//				sum2+=b;
//				b++;
//			}
//			System.out.println("1~100까지의 합 -> "+sum2);
//		  
//		System.out.println("----------------------------2");

		
		
		
		
		
			
//		for (int i = 1; i <= 10; i++) {
//			if (i>7) {
//				break;
//			}
//			System.out.println(i + " ");
//		} // 1 2 3 4 5 6 7
			
			
		
		
		//직접 while문으로 구해봐라.
		  int a6=2;
	      int a7=1;
	        while (a6<=9) {     
	        	System.out.println(a6 + "단");
	        	while (a7<=9) {
	             System.out.println( a6 +" X "+ a7 +" = " + (a6*a7));
	             a7++; //안써주면 무한대로찍히겠지..
	           } 
	             a7=1; 
	             System.out.println();
	             a6++;
	    }
			
		
		
		
//		int i = 1;
//		while(true) {
//			if(i>5) {
//				break;
//			}
//			System.out.println("안녕하세요 " + i );
//			i++;
//		}
//		//안녕하세요1 안녕하세요2 안녕하세요3 안녕하세요4 안녕하세요5
//
//			
//		System.out.println("----------------------------4");

		
		
		
		
		// while(조건문) {증감문}
//		int c = 0;
//		while(c<=5) {
//			System.out.println(c);
//			c++; 
//		}
		// 결과 : 0 1 2 3 4 5
		
		
		
		
		// do { 증감문 } while (조건문);
//		int d = 0;
//		do {
//			System.out.println(d);
//			d++;
//		} while(d<=5);
		// 결과 : 0 1 2 3 4 5
	        
	        
	        
	        
	        
	        
			System.out.println("========================8");
			
			
			for(int i = 1; i<=5; i++) {
				for(int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

			
			System.out.println("========================9");
 
			
			for(int i = 1; i<=5; i++) {
				System.out.print("*");
			}
			
	        System.out.println();
			System.out.println("========================10");

			
			for(int i = 0; i<5; i++) {
				for(int j = 0; j<5; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
	        
	        
			System.out.println("========================11");

			
	        for(int i=0; i<5; i++) {
	        	for(int j=0; j<=i; j++) {
	        		System.out.print("*");
	        	}
	        	System.out.println();
	        }
	        
	        
			System.out.println("========================12");

			
			for(int i=5; i>0; i--) {
				for(int j=0; j<i; j++) {
	        		System.out.print("*");
	        	}
	        	System.out.println();
	        }
	        
	        
			System.out.println("========================13");

			for(int i=0; i<5; i++) {
				//공백
				for(int j=4; j>i; j--) {
					System.out.print(" ");
				}
				//별
				for(int k=0; k<i+1; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
	        
			System.out.println("========================14");

			for(int i = 4; i > -1; i--) {
				for(int j = 0; j < 5; j++) {
					if(j < i) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
	       
			System.out.println("========================15");

			for(int i=0; i<5 ;i++) {
				for(int j=4; j>i; j--) {
					System.out.print(" ");
				}
				for(int k=0; k<=i*2; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			System.out.println("========================16");
			
			int MAX = 5;
			int half = MAX-1;
			for(int i = MAX; i > 0; --i) {
				for(int j = 0; j < MAX * 2; ++j) {
					int start = half - i;
					int end = half + i;
					//
					if(start < j && j < end) {
						System.out.print("*");
					}
					else System.out.print(" ");
				}
				System.out.print("\n");
			}
			System.out.println();
			
			
			
			
			
			
			int num = 15; // 센터 별찍기
			for (int i = 0; i < num; i++)
			{
				for (int j = 0; j < num - i - 1; j++) //빈칸출력
				{
					System.out.print(' ');
				}
				
				for (int k = 0; k < 2 * i + 1; k++) // 각 행은 2N+1개 만큼 출력
				{
					System.out.print('*');
				}
				System.out.println("");
			}
			
			System.out.println("------------------123123");
			
			
			System.out.println();
			System.out.println("리버스 센터 별찍기");
			
			for (int i = 0 ; i < num; i++) //리버스 센터 별찍기
			{
				for (int j = 0; j  < i; j++) //빈칸출력
				{
					System.out.print(' ');
				}
				
				for (int k = 0; k < 2*(num-i)-1; k++) //별출력
				{
					System.out.print('*');
				}
				System.out.println("");
			}
			
			
			int count = 1;
			int max = 5;
			for(int c=0;c<max; c++) {
			for(int a =max; a>count/2; a--) 
				System.out.print(" ");
			for(int a =0; a<count; a++) 
				System.out.print("*");
			count+=2;
			System.out.print("\n");
			}
			
			for(int c=0;c<max+1; c++) {
				for(int a =max; a>count/2; a--) 
					System.out.print(" ");
				for(int a =count; a>0; a--) 
				System.out.print("*");
			count-=2;
			System.out.print("\n");
			}
			
			
			
			
			
			// 나비 코드
			// for 중첩으로 나비 만들기
			for (int i = 1, n=1; i <= 10; i++) { //  
				for(int j = 1; j <= 10; j++) { //
					System.out.print(((j >= n+1) && (j <= 10-n))?" ":"*");


				}
				if(i<5) {
					n++;
				} else {
					n--;
				}

				System.out.println();
			}
			/* 10행 10열의 배열 , 조건으로 공백과 별을 번갈아가며 찍음
			 * n+1 <= x <= 10-n의 범위에 공백을 출력 (n은 행, x는 열)
			 * i와 n은 1부터 시작 i가 10보다 크거나 같을 때 까지 1씩 증가 반복문
			 * j도 같다
			 * j가 n+1한 것 보다 크거나 같고 j가 10-n 한 것보다 작거나 같음을 모두 만족하면
			 * true로 공백 출력 , 그렇지 않으면 *을 출력
			 * -별 줄이기-
			 * if문 사용 i가 5보다 작으면 n을 늘리고 그렇지 않으면 n을 줄인다.
			 */
			
			
			
			
			System.out.println("------------------------------");
			
			
			
			
			// 1~20까지 정수 중 2또는 3의 배수가 아닌 수들의 총합
			int total = 0;
			for (int i = 1; i <= 20; i++) {
				if(i%2!=0 && i%3!=0) {
					total += i;
				}
			}
			System.out.println(total); //73
			
			
			
			
			
			
			
			
			// 1+(-2)+3+(-4)+5+(-6)...와 같은 식으로 계속 더해나갔을 때, 
			// 몇까지 더해야 총합이 100이상인지?
			int total1 = 0; //총합
			int n = 1; 
			while(total1 < 100) {
			  if(n%2==0) {
				  total1 -= n;
			  } else {
				  total1 += n;
			  }
			  n++;
			}
			System.out.println(n-1);
			
			
//			//또는
//			int tsum = 0;
//			int i = 1;
//			while(tsum >= 100) {
//				if (i%2 == 1) {
//					tsum += i;
//				} else {
//					i = i * -1;
//					tsum += i;
//				}
//				i++;
//			}
	
			
			
			
			
			
			
			// 다음의 for문을 while문으로 변경
			for(int i=0; i<=10; i++) {
				for(int j=0; j<=i; j++) {
					System.out.print("*");
					System.out.println();
				}
			}
			
			System.out.println("-------------------------");
			
			int i = 0; 
			while (i <= 10) { 
			    int j = 0; 
			  while(j<=i) {
			    System.out.println("*");
			        System.out.println();
			        j++; 
			    }
			  System.out.println();
			    i++; 
			}
	
			
			
			System.out.println("-------------------------");

			
			//두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의수 출력
			 for (int a = 1; a <= 6; a++) {
		            for (int j = 1; j <= 6; j++)
		                if (a + j == 6) {
		                    System.out.println(a + ", " + j);
		                }
		        }

			
			 
			 
			 
			 
			 System.out.println("============================");
			 
			 int number = 151;
				int tmp = number; 
				int result = 0; 
				while (tmp != 0) {
				    int digit = tmp % 10; 
				    result = result * 10 + digit; 
				    tmp /= 10; 
				}
				if (number==result) {
					System.out.println("true");
				} else {
					System.out.println("false");
				}
			 
			 
			 
				
				//for 추가 문법
				//for(타입 변수 : 떼거지데이터) {}
				String[] arrStr = {"A", "B", "C"};
				for(String val : arrStr) {
					System.out.println(val);
				}
			 
				
				int[] dan = {2,3,4,5};
				int[] gob = {1,2,3};
				for(int d : dan) {
					for(int g : gob) {
						System.out.println(d + "*" + g + "\t");
					}
					System.out.println();
				}
			 
			
			
			
			
			
			
			
			
	}
}


