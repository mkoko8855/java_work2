package 접근제어자1;

public class EX1 {
	
	
	int num = 100;
	
	public float add(float a, float b) {
		return a+b;
	}
	
	public void myPrint(String msg) {
		System.out.println(msg);
	}
	
	
	public static void myPrint2(String over, String over1) {
		System.out.println(over);
		System.out.println(over1);
	}
	
	public static void main(String[] args) {
		EX1 t = new EX1();//객체만들어서 메모리에 올려야 num을 출력가능.
		System.out.println(t.num);
		
		float as = t.add(1, 2);
		System.out.println(t.add(1, 2)); //3.0
		System.out.println(as); //3.0
		
		t.myPrint("d"); //d
		
		EX1.myPrint2("야", "여"); //야 여
		
		
	}

	
	
	
	
	
	
	
}
