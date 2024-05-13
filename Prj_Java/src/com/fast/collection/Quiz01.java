package com.fast.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Quiz01 {

	public static void main(String[] args) {
		
		/*
		 empno  ename   sal
	     7733   smith   600

		 ArrayList list
		 HashMap emp 
		*/
		
		
		ArrayList<HashMap<String, String>>list = new ArrayList<HashMap<String, String>>();
		
	  //String[][] cv = {{"empno", "ename", "sal"},
      //                 {"7733", "smith", "600"}};
	  //이후에 맵에 집어넣는데,
	  //HashMap<String, String> emp = new HashMap<String, String>();
      //for(int c=0; c<cv.length; c++) {
      //	  for(int v=0; c<cv[c].length; c++) {
      //	 	  emp.put(cd[c], cv[v]);
      //	  }
      //}
      //list.add(emp);
	  //위 코드도 가능.
      
      
		
	  //또는
	  /*
	    ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
	    String[] arr = {"smith", "7733", "600"};
	    HashpMap getMap = list.get(0); 이러면 list에 hasp map을 담았기에 잘못됐다.
	    getMap.put("empno", arr[0]);
	    getMap.put("ename", arr[1]);
	    getMap.put("sal", arr[2]);
	    list.add(getMap);
	    
	    맵에 인스턴스 화가 없는 상태로 get을 사용했기 떄문이다.
        잘못된 코드다.	    
	    
	   */
		
		
	   //또는
		/*
		ArrayList<Map<String, String[][]>> lit2 = new ArrayListM<>();
		Map<String, String[][]> map2 = new HashMap<String, String[][]>();
		String[][] arr = {{"1", "kim", {"2", "park"}};
		map2.put("mykey", arr);
		list2.add(map2);
		list2.get(0); 이라면 map이 나온다.
		list2.get(0).get("mykey"); 이라면 arr가 나온다.
		list2.get(0).get("mykey").get(0).get(1); 이라면 kim을 뽑을 수 있다.
		[ {"mykey" = {{"1", "kim"}, {"2", "park"}} }]
		
		String cols = {"empno", "ename", "sal"};
		for i=0; map.keySets().length?size?; i++){
			키셋을 이용해서 루프돌려도됨
		}
		*/
		
      
		HashMap<String, String> emp = new HashMap<String, String>();
		
		emp.put("empno", "7733");
		emp.put("ename", "smith");
		emp.put("sal", "600");
		list.add(emp);
		
		for(int i=0; i<list.size(); i++) {
			String a = list.get(i).get("empno");
			String b = list.get(i).get("ename");
			String c = list.get(i).get("sal");
			System.out.println(a + "," + b + "," + c);
		}
		
		//출력 결과 : 7733, smith, 600
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
