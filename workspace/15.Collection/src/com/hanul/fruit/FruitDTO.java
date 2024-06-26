package com.hanul.fruit;

public class FruitDTO {
	private String name; 
	private int cost,qty,price;
	
	public FruitDTO() {}
	
	public FruitDTO(String name, int cost, int qty) {
		super();
		this.name = name;
		this.cost = cost;
		this.qty = qty;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getCost() {
		return cost;
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}	
	
}
