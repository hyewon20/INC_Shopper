package org.zerock.domain;

import java.util.Date;

public class UseraccountVO {
	
	private int accNum;
	private String id;
	private String pw;
	private String address;
	private Date registerDate;
	private int visits;
	private String grade;
	
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public int getVisits() {
		return visits;
	}
	public void setVisits(int visits) {
		this.visits = visits;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "UseraccountVO [accNum=" + accNum + ", id=" + id + ", pw=" + pw + ", address=" + address
				+ ", registerDate=" + registerDate + ", visits=" + visits + ", grade=" + grade + "]";
	}
	

}
