package org.zerock.domain;

public class OrderItemVO {
	
	private int orderItemNum;
	private int qty;
	private int invenItemNum;
	private int orderNum;
	
	
	public int getOrderItemNum() {
		return orderItemNum;
	}
	public void setOrderItemNum(int orderItemNum) {
		this.orderItemNum = orderItemNum;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getInvenItemNum() {
		return invenItemNum;
	}
	public void setInvenItemNum(int invenItemNum) {
		this.invenItemNum = invenItemNum;
	}
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	
	@Override
	public String toString() {
		return "OrderItemVO [orderItemNum=" + orderItemNum + ", qty=" + qty + ", invenItemNum=" + invenItemNum
				+ ", orderNum=" + orderNum + "]";
	}
	
	
	
	
	

}
