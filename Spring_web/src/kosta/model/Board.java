package kosta.model;

import java.io.Serializable;


import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;




public class Board implements Serializable{
	private int seq;
	
	
	@NotEmpty(message="제목을 입력하세요")
	@Size(min=2,max=5,message="2자 이상 5자 미만")
	private String title;
	
	@Pattern(regexp="[0-9a-zA-Z가-힣]*",message="특수문자 금지")
	private String writer;
	private String contents;
	private String regdate;
	private int hitcount;
	private String fname;
	
	public Board() {}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public int getHitcount() {
		return hitcount;
	}

	@Override
	public String toString() {
		return "Board [seq=" + seq + ", title=" + title + ", writer=" + writer + ", contents=" + contents + ", regdate="
				+ regdate + ", hitcount=" + hitcount + ", fname=" + fname + "]";
	}

	public void setHitcount(int hitcount) {
		this.hitcount = hitcount;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}
	
	
	
}
