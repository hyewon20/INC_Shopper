package org.zerock.domain;

import java.util.Date;

public class ShippingVO {
	
	private int shippingNum;
	private int shipCharge;
	private int state;
	private Date shipDate;
	private int orderNum;
	
	public int getShippingNum() {
		return shippingNum;
	}
	public void setShippingNum(int shippingNum) {
		this.shippingNum = shippingNum;
	}
	public int getShipCharge() {
		return shipCharge;
	}
	public void setShipCharge(int shipCharge) {
		this.shipCharge = shipCharge;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public Date getShipDate() {
		return shipDate;
	}
	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	
	@Override
	public String toString() {
		return "ShippingVO [shippingNum=" + shippingNum + ", shipCharge=" + shipCharge + ", state=" + state
				+ ", shipDate=" + shipDate + ", orderNum=" + orderNum + "]";
	}
	
	

}
