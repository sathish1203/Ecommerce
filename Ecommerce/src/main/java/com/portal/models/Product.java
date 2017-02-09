package com.portal.models;

public class Product {
	private String id;  
	private String name;
	private String supplierid;
	private String categoryid;
	private String description;
	private String mrp;
	private String offerprice;
	private String quantity;
	private String imagepath;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(String supplierid) {
		this.supplierid = supplierid;
	}
	public String getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(String categoryid) {
		this.categoryid = categoryid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMrp() {
		return mrp;
	}
	public void setMrp(String mrp) {
		this.mrp = mrp;
	}
	public String getOfferprice() {
		return offerprice;
	}
	public void setOfferprice(String offerprice) {
		this.offerprice = offerprice;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getImagepath() {
		return imagepath;
	}
	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}
	
}
