package com.kosta.sample.quiz1;

public class Child extends Parent {

	
	
	
	private int[] scores = new int[3];
	// int[] scores = {0,0,0};

	public Child() {
		//super();
	}
	
	
	public Child(int kor, int eng, int math) {
		super(kor, eng, math); //파라미터를 여기로넘기기
	}

	
	public Child(int[] scores) { 
        super(scores);
        this.scores = scores;
//        for(int i=0; i<scores.length; i++) {
//        	System.out.println(scores[i] + "\t");
//        }
    }
	
	
	
	
	public static void main(String[] a) {
		//Sukang s = new Sukang(100,90,80); //과목 점수만 출력됨
		new Parent(100, 90, 80); //Score는 기본생성자X 부모생성자O,
		new Parent(88, 77, 66); //Score말고 SuKang을 적어도 가능하게
		
		//Sukang s = new Sukang(new int[] {100,90,80});
		//new Sukang (new int[]{100,90,80}); //배열을 새롭게파서 생성자에 담기. 담았으니 생성자하나생성ㄱㄱ		
	
		int[] temp = new int[]{100,90,80};
    	new Child(temp);
	
    	new Child(new int[]{88,77,66});
    	
    	

    	
    	
	
	}

}
