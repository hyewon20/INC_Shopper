package org.zerock.domain;

import java.util.Date;

public class InventoryItemVO {
	
	private int invenItemNum;
	private String title;
	private String categor;
	private int price;
	private Date registerDate;
	private String manufacturer;
	private String url;
	private String description;
	
	
	public int getInvenItemNum() {
		return invenItemNum;
	}
	public void setInvenItemNum(int invenItemNum) {
		this.invenItemNum = invenItemNum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategor() {
		return categor;
	}
	public void setCategor(String categor) {
		this.categor = categor;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "InventoryItemVO [invenItemNum=" + invenItemNum + ", title=" + title + ", categor=" + categor
				+ ", price=" + price + ", registerDate=" + registerDate + ", manufacturer=" + manufacturer + ", url="
				+ url + ", description=" + description + "]";
	}
	
	

}
