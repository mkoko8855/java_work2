package com.kosta.boardtest;

public class ReplyVO {
	private int rseq;  //PK
	private String reply;
	private String regid; //세션이나 쿠키로 집어넣어야 되는데, regid도 그냥 사용자한테 입력받는걸로 가자.(안배웠으니)
	private String regdate;
	private int seq ;   //FK 
	
	
	public ReplyVO() {}
	
	
	public ReplyVO(int rseq, String reply, String regid, String regdate, int seq) {
		super();
		this.rseq = rseq;
		this.reply = reply;
		this.regid = regid;
		this.regdate = regdate;
		this.seq = seq;
	}



	public int getRseq() {
		return rseq;
	}

	public String getReply() {
		return reply;
	}

	public String getRegid() {
		return regid;
	}

	public String getRegdate() {
		return regdate;
	}

	public int getSeq() {
		return seq;
	}

	public void setRseq(int rseq) {
		this.rseq = rseq;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	public void setRegid(String regid) {
		this.regid = regid;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	@Override
	public String toString() {
		return "ReplyVO [rseq=" + rseq + ", reply=" + reply + ", regid=" + regid + ", regdate=" + regdate + ", seq="
				+ seq + "]";
	}
	

	
}
	
	
	
	
	
	
	
