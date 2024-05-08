package com.hanul.book;

import java.text.DecimalFormat;

public class BookDAO {
	public void getPrice(BookDTO[] book) {
		for (int i = 0; i < book.length; i++) {
		//int cost = book[i].getCost();
		//int qty = book[i].getQty();
		//int price =cost * qty;
		//book[i].setPrice(price);
		book[i].setPrice(book[i].getCost() * book[i].getQty());				
		}
	}//getPrice()
	
	public void display(BookDTO[] book) {
		DecimalFormat df = new DecimalFormat("￦#,##0");
		System.out.println();
		System.out.println("제목\t저자\t출판사\t단가\t\t수량\t가격");
		System.out.println();
		for (int i = 0; i < book.length; i++) {
			System.out.print(book[i].getTitle() +"\t");
			System.out.print(book[i].getName() +"\t");
			System.out.print(book[i].getCompany() +"\t");
			System.out.print(df.format(book[i].getCost()) +"\t");
			System.out.print(book[i].getQty() +"\t");
			System.out.print(df.format(book[i].getPrice()) +"\n");
		}//for
	}//display()
}//class
