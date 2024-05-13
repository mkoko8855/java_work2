//package com.kosta.shop;
//
//
//class User {
//	private final int ORDER_POINT = 100;   //값 변경 불가, 직접 접근 불가
//    public int getOrderPoint() {
//    	return this.ORDER_POINT;
//    }
//    
//	public String getUserName(String uid) {
//		//DB 조회 select ename from emp where userid = 'uid';
//		return "홍길동";
//	}
//	public int order(int price) {
//		return 0;
//	}
//	
//	public String getCompName() {
//		return "KOSTA";
//	}
//	
//}
//// --------------------------------------------
//class Member extends User {
//	@Override
//	public int order(int price) {
////		int res = 0;
//		int res = price + getOrderPoint() + (int)(price*0.1);
//		return res;
//	}
//	
//}
////--------------------------------------------
//class Guest  extends User { 
//	@Override
//	public int order(int price) {
//		int res = price + getOrderPoint();
//		return res;
//	}
//}
////--------------------------------------------
//public class ShopCallTest {
//	public static void main(String[] args) {
//		Member m = new Member();
//		int mRes = m.order(1000);  //1000 + 100 + 100
//		System.out.println("회원구매:" + mRes);
//		
//		Guest g = new Guest();
//		int gRes = g.order(1000);  //1000 + 100
//		System.out.println("비회원구매:" + gRes);
//	}
//
//}
//////--------------------------------------------
