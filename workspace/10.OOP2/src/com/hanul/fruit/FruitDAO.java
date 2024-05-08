package com.hanul.fruit;

import java.text.DecimalFormat;


public class FruitDAO {
	//생성자 메소드 
	public FruitDAO() {}		//디폴트 생성자 메소드 : 빈 깡통 
	
	private FruitDTO[] fruit;	//멤버변수 선언 
	public FruitDAO(FruitDTO[] fruit) {		//생성자 메소드 초기화 : 객체 생성 시 전달되는 매개변수를 받는다.
		this.fruit = fruit;
		
	}
	
	
	//가격계산 
	public void getPrice() {
		for (int i = 0; i < fruit.length; i++) {
			fruit[i].setPrice(fruit[i].getCost() * fruit[i].getQty());					
		}//for
	}//getPrice()
	
	public void  priceDescSort() {
		//가격 내림차순 정렬 
		for (int i = 0; i < fruit.length; i++) {
			for (int j = i + 1; j < fruit.length; j++) {
				if(fruit[i].getPrice() < fruit[j].getPrice()) {
					FruitDTO temp = fruit[i];
					fruit[i] = fruit[j];
					fruit[j] = temp;
				}//if
			}//for j
		}//for i 
	}//heightDescSort()

	public void display () {
		DecimalFormat df = new DecimalFormat("￦#,##0");
		System.out.println("과일 명\t단가\t수량\t가격");
		System.out.println();
		for (int i = 0; i < fruit.length; i++) {
			System.out.print(fruit[i].getName() +"\t");
			System.out.print(df.format(fruit[i].getCost()) +"\t");
			System.out.print(fruit[i].getQty() +"\t");
			System.out.print(df.format(fruit[i].getPrice()) +"\n");
		}// for
	}//display()
}//class
