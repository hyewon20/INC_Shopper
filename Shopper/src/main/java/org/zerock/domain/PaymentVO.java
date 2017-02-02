package org.zerock.domain;

import java.util.Date;

public class PaymentVO {
	
	private int paymentNum;
	private String type;
	private String amount;
	private Date paymentDate;
	private int orderNum;
	
	public int getPaymentNum() {
		return paymentNum;
	}
	public void setPaymentNum(int paymentNum) {
		this.paymentNum = paymentNum;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	
	@Override
	public String toString() {
		return "PaymentVO [paymentNum=" + paymentNum + ", type=" + type + ", amount=" + amount + ", paymentDate="
				+ paymentDate + ", orderNum=" + orderNum + "]";
	}
	
	
	

}
