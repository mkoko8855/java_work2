package com.kosta.boardtest;

import java.util.Date;
import java.util.List;

//VO
public class BoardVO {
	//ctrl + shift + X : 대문자
	//ctrl + shift + Y : 소문자
	private int seq;
	private String title;
	private String contents;
	private String regid;
	private String regdate; //디폴트값이 sysdate가 있어서 insert에서는 빼고 그냥넣어도 날짜는 들어갈것임
	
	List<ReplyVO> replies; //게시글하나에 댓글 여러개다. 일대다 관계라고 얘기한다. 배열을 쓰면 안된다. 왜? -> 댓글이 몇개 들어올지 모르니까. 
	//ArrayList로 했으면 ArrayList로만 받아야 한다! 해쉬로받을수도있으니
	//모든 것을 다 받을 수 있게 List로하자!
	
	
	
	
	public BoardVO() {}
	
	
	
	public BoardVO(int seq, String title, String contents, String regid, String regdate) {
		//super();
		this.seq = seq;
		this.title = title;
		this.contents = contents;
		this.regid = regid;
		this.regdate = regdate;
	}



	public BoardVO(int seq, String title, String contents, String regid, String regdate, List<ReplyVO> replies) {
		//super();
		this(seq, title, contents, regid, regdate);
		this.replies = replies;
	}


	public List<ReplyVO> getReplies() {
		return replies; 
	}


	public void setReplies(List<ReplyVO> replies) {
		this.replies = replies;
	}


	public int getSeq() {
		return seq;
	}
	public String getTitle() {
		return title;
	}
	public String getContents() {
		return contents;
	}
	public String getRegid() {
		return regid;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public void setRegid(String regid) {
		this.regid = regid;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}


	@Override
	public String toString() {
		return "BoardVO [seq=" + seq + ", title=" + title + ", contents=" + contents + ", regid=" + regid + ", regdate="
				+ regdate + ", replies=" + replies + "]";
	}
	
}