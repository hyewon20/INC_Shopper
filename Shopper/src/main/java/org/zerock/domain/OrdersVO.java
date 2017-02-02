package org.zerock.domain;

import java.util.Date;

public class OrdersVO {
	
	private int orderNum;
	private Date orderDate;
	private String orderAddress;
	private int totalAmt;
	private int state;
	private int accNum;
	
	
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderAddress() {
		return orderAddress;
	}
	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}
	public int getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(int totalAmt) {
		this.totalAmt = totalAmt;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	
	@Override
	public String toString() {
		return "OrdersVO [orderNum=" + orderNum + ", orderDate=" + orderDate + ", orderAddress=" + orderAddress
				+ ", totalAmt=" + totalAmt + ", state=" + state + ", accNum=" + accNum + "]";
	}
	
	
	

}
