package com.kosta.shop;

/**
 * 패키지 생성 : com.kosa.sample.shop
 * 
 * 부모 클래스 : User 부모 메서드 : getUserName(String uid)
 * 
 * 공통 변수 : orderPoint = 100 //값 변경 불가, 직접 접근 불가 공통 메서드 : getCompName(),
 * order(int price)
 * 
 * 자식 클래스 : Member Guest Member : order(int price) 시 구매 금액의 10% 추가 적립 Guest :
 * order(int price) 시 구매 금액 적립 불필요
 */
//-------------------------------------------


class User {
	String name = "dd";

	public String getUserName(String uid) {
		// DB 조회 select ename from emp where userid = 'uid';
		return "홍길동";
	}

	public int orderByUser(Order o, int price) {
		// 런타임 시 타입체크 : isInstanceOf() o.isInstanceOf(MemberOrder) ????
		// JUnit --> if (o.isInstanceOf(MemberOrder.class)) { }

		// 컴파일 시 타입체크 : instanceof o instanceof MemberOrder
		// Java --> if (o instanceof MemberOrder) { }

		int res = o.order(1000);
		return res;
	}
}

//-------------------------------------------
class Member extends User {
//메서드
}

//--------------------------------------------
class Guest extends User {
//메서드
}
//-------------------------------------------

class Order {
	private final int ORDER_POINT = 100; // 값 변경 불가, 직접 접근 불가

	public int getOrderPoint() {
		return this.ORDER_POINT;
	}

	public int order(int price) {
		// 1. DB
		// 2. 상품조회
		// 3. 기관계 연동
		return 0;
	}
}

//--------------------------------------------
class MemberOrder extends Order {
	@Override
	public int order(int price) {
		super.order(price);
		// 1. DB
		// 2. 상품조회
		// 3. 기관계 연동
		int res = price + getOrderPoint() + (int) (price * 0.1);
		return res;
	}
}

//--------------------------------------------
class GuestOrder extends Order {
	@Override
	public int order(int price) {
		super.order(price);
		// 1. DB
		// 2. 상품조회
		// 3. 기관계 연동
		int res = price + getOrderPoint();
		return res;
	}
}
//--------------------------------------------

public class ShopCallTest2 {
	public static void main(String[] args) {
		User u = new User();
		// public int orderByUser(Order o, int price) {

		// Order o = new MemberOrder();
		int mRes = u.orderByUser(new MemberOrder(), 1000);
		System.out.println("회원구매:" + mRes);

		// Order o = new GuestOrder();
		int gRes = u.orderByUser(new GuestOrder(), 1000);
		System.out.println("비회원구매:" + gRes);

	}

}