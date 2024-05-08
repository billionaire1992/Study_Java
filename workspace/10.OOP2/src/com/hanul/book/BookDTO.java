package com.hanul.book;

public class BookDTO {
	//①멤버변수 선언 : title, name, company, cost, qty, price ▶정보은닉
	private String title, name, company;
	private int cost, qty, price;
	
	//②디폴트 생성자 메소드 
	public BookDTO() {}

	//③생성자 메소드 초기화			순서체크 입력할개수 체크 
	public BookDTO(String title, String name, String company, int cost, int qty) {
		super();
		this.title = title;
		this.name = name;
		this.company = company;
		this.cost = cost;
		this.qty = qty;
	}
	//④Getters & Setters 메소드 ▶자동완성 전부 체크 

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
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
	
}//class
