package com.kosta.sample.json;


// VO : Value Object (값을 넣고 뺴기위한 클래스) -> 그러나 read-only 다. 읽기용도.
// DTO : Data Transfer Object (이것도 값을 넣고 빼기위한 클래스). -> 읽기 / 수정 용도다.
// 즉, 위 둘은 Entity클래스라고도 한다. 값을 넣고 빼기 위한 용도의 클래스다.

//private int num;
//setter() : 값 넣기
//getter() : 꺼내기


//import com.kosta.sample.json.EmpVO; 같은 패키지 내에 있으니 할 필요없음


public class VOTest {

	public static void main(String[] args) {
		
//		EmpVO emp = new EmpVO(); //이거 쓰고싶으면 EmpVO클래스에서 기본 생성자 만들어줘야함.
//        emp.setEmpno(7733);
//        emp.setEname("smith");
//        emp.setSal(600);
//        
//        System.out.println(emp.getEmpno());
//        System.out.println(emp.getEname());
//        System.out.println(emp.getSal());

//        또는
//		  int a = evo.getEmpno();
//		  String b = evo.getEname();
//		  int c = evo.getSal();
//		  System.out.println(a + "," + b + "," + c);
		
        
        //근데 위 방식은 많으면 힘듬.
        //생성자로 하면 된다.
		//EmpVO클래스로가서 생성자를 만들어주고 아래와 같이 출력하자.
		
        EmpVO emp = new EmpVO(7733, "smith", 600);
        //잘들어갔나보고싶으면?
        System.out.println(emp); //이건 주소값찍힌다 -> 근데 toString() 메서드를 썼으면 이것도 주소값이 아닌 정상값이 출력되긴 한다.
        //일일이 이렇게 칠꺼아니니
        //EmpVO클래스가서 toString();만들어줘서 한번에 출력하게 하자
        System.out.println(emp.toString());
        //EmpVO [empno=7733, ename=smith, sal=600] 이게 출력된다.

        
//       System.out.println(emp.getEmpno()); //7733
//       System.out.println(emp.getEname()); //smith
//       System.out.println(emp.getSal()); //600
        
	}

}
