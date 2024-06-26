package com.fast.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;



public class Lec11컬렉션복합 {

	public static void main(String[] args) {
		
		//ArrayList에 String[] (배열을 넣어보는 형태를 해보자)
		String[] arr = {"1", "제목1", "2024-01-01", "kim"};
		//ArrayList list = new ArrayList();
		ArrayList<String[]> list = new ArrayList<String[]>();
		list.add(arr);
		System.out.println(list.get(0)[1]); //출력결과 : 제목1
		//System.out.println((String[])list.get(0))[1]; 더러우니까 제네릭쓴다.
		
		//System.out.println(list); //[Ljava.lang.String;@7c30a502
		//String[] res = (String[]) list.get(0); 
		

		
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		} //[Ljava.lang.String;@7c30a502

		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		} //출력결과 : 1 제목1 2024-01-01 kim 
		
		
		
//		List<String> list2 = new ArrayList<>();
//		for (int i = 0; i < list2.size(); i++) {
//		    System.out.println(list2.get(i));
//		}
		
		
		ArrayList<ArrayList<String>> list2 = new ArrayList<ArrayList<String>>();
		//리스트안에 스트링이 있는데 떼거지가 list2에 담길 것이다..
//		ArrayList<String> arr2 = new ArrayList<String>();
//		arr2.add("1");
//		arr2.add("제목");
//		arr2.add("2024-01-01");
//		arr2.add("kim");
//		//바깥에 ArrayList에 담자
//		list2.add(arr2);
//		//System.out.println(list.get(0)); //출력결과 : 1, 제목, 20224....다나옴
//		//System.out.println(list.get(0).get(1)); //출력결과 : 1
//		
//		ArrayList<String> arr3 = new ArrayList<String>();
//		arr2.add("2");
//		arr2.add("제목2");
//		arr2.add("2024-02-02");
//		arr2.add("kim2");
//		list2.add(arr3);
//		System.out.println(list2.size()); //2
		
		//이후에 데이터베이스에서 데이터를 가져오는 형태로 이 밑은 변경이 들어갈 것이긴하다..데이터없으니 잠시 쓰는 용도다.
		for(int i=0; i<4; i++) {
			ArrayList<String> arr3 = new ArrayList<String>();
			arr3.add(""+i);
			arr3.add("제목" + i);
			arr3.add("2024-01-01");
			arr3.add("kim"+i);
			list2.add(arr3);
		} //윗부분만 DB에서 가져오면 되는 것이다. 이 아랫부분이 핵심라인!
		System.out.println(list2.size());
		for(int i=0; i<list2.size(); i++) {
			String seq = list2.get(i).get(0);
			String title = list2.get(i).get(1);
			String rdate = list2.get(i).get(2);
			String regid = list2.get(i).get(3);
			
			System.out.println(seq + "\t" + title + "\t" + rdate + "\t" + regid);
		}
		
		
	
	}

}
