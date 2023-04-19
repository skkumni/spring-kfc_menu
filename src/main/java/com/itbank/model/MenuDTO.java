package com.itbank.model;

//	이름       널?       유형             
//	-------- -------- -------------- 
//	IDX      NOT NULL NUMBER         
//	NAME     NOT NULL VARCHAR2(100)  
//	CATEGORY NOT NULL VARCHAR2(50)   
//	PRICE             NUMBER         
//	IMG               VARCHAR2(255)  
//	MEMO              VARCHAR2(2000) 

public class MenuDTO {
	
	private int idx;
	private String name;
	private String category;
	private int price;
	private String img;
	private String memo;
	
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	
}
