package com.kosta.boardtest;

import java.util.ArrayList;

public class BoardCallTest {

	public static void main(String[] args) {
		BoardDAO dao = new BoardDAO();
		
		//public ArrayList<BoardVO> boardSelect() {}
		ArrayList<BoardVO> list = dao.boardSelect();
		System.out.println("총 : " + list.size());
		for(BoardVO bvo : list) {
			int seq         = bvo.getSeq();
			String title    = bvo.getTitle();
			String contents = bvo.getContents();
			String regid    = bvo.getRegid();
			String regdate  = bvo.getRegdate();
			System.out.println(seq + "\t" + title + "\t" + contents + "\t" + regid + "\t" + regdate);			
		}
				
		//public int boardDelete(int seq) {}
		int delRows = dao.boardDelete(12);
		System.out.println(delRows + "건 삭제");
		
		//public ArrayList<BoardVO> boardSelect() {}
		list = dao.boardSelect();
		System.out.println("총 : " + list.size());
		for(BoardVO bvo : list) {
			int seq         = bvo.getSeq();
			String title    = bvo.getTitle();
			String contents = bvo.getContents();
			String regid    = bvo.getRegid();
			String regdate  = bvo.getRegdate();
			System.out.println(seq + "\t" + title + "\t" + contents + "\t" + regid + "\t" + regdate);			
		}
		
		
		BoardVO bvo  = new BoardVO();
		bvo.setTitle("title...");
		bvo.setContents("contents...");   	
		bvo.setSeq(1);   		
		int updateRows = dao.boardUpdate(bvo);
		System.out.println(updateRows + "건 수정");
		
		bvo  = new BoardVO();
		bvo.setTitle("title222...");
		bvo.setContents("contents222...");   	
		bvo.setRegid("zzzz");   
		int insertRows = dao.boardInsert(bvo);
		System.out.println(insertRows + "건 입력");		
			
//		for(int i=0; i<list.size(); i++) {
//			int seq         = list.get(i).getSeq();
//			String title    = list.get(i).getTitle();
//			String contents = list.get(i).getContents();
//			String regid    = list.get(i).getRegid();
//			String regdate  = list.get(i).getRegdate();
//			System.out.println(seq + "\t" + title + "\t" + contents + "\t" + regid + "\t" + regdate);			
//		}
				
		
	}

}
