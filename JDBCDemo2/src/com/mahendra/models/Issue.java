package com.mahendra.models;

import java.io.Serializable;
import java.util.Date;

public class Issue implements Serializable {
	private int issueId;
	private int bookId;
	private int memberId;
	private Date issueDate;
	private Date returnDate;
	private String status;
	public int getIssueId() {
		return issueId;
	}
	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Issue() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Issue(int issueId, int bookId, int memberId, Date issueDate, Date returnDate, String status) {
		super();
		this.issueId = issueId;
		this.bookId = bookId;
		this.memberId = memberId;
		this.issueDate = issueDate;
		this.returnDate = returnDate;
		this.status = status;
	}
	
}
