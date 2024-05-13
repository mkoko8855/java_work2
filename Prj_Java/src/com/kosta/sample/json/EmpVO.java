package com.kosta.sample.json;

public class EmpVO {

	//값을 넣었다 뻈다 하는 파란글씨는 프로퍼티 라고 한다. -> 3개있다.
	private int empno;
	private String ename;
	private int sal;
	
	
	public EmpVO() {} 
	
	
	public EmpVO(int empno, String ename, int sal) { //이 생성자를 만들어야 값을 일일이 집어 넣지 않음.
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	} 
	
	
	
	@Override
	public String toString() {
		return "EmpVO [empno=" + this.empno + ", ename=" + this.ename + ", sal=" + this.sal + "]";
	} //한번에 출력하는 용도로 Object클래스의 메서드를 오버라이딩! 


	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int impno) {
		this.empno = impno;
	}
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	//겟셋만들었으니 VOTest클래스로가서 불러보자
	
	
	
	
}
