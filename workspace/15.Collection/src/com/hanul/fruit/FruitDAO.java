package com.hanul.fruit;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class FruitDAO {
	public FruitDAO() {}		 
	
	private ArrayList<FruitDTO> fruit;	 
	public FruitDAO(ArrayList<FruitDTO> fruit) {		
		this.fruit = fruit;
	}
	
	//가격 구하는 메소드 
	public void getPrice() {
		for (int i = 0; i < fruit.size(); i++) {
			fruit.get(i).setPrice(fruit.get(i).getCost() * fruit.get(i).getQty()); 				
		}//for	
		
		// for (FruitDTO dto : fruit) {
		//    dto.setPrice(dto.getCost() * dto.getQty());
		//}forEach
		
		
	}//getPrice()

	//가격 내림차순 정렬 
	public void priceDescSort() {
		for (int i = 0; i < fruit.size(); i++) {
			for (int j = i + 1; j < fruit.size(); j++) {
				if(fruit.get(i).getPrice() < fruit.get(j).getPrice()) {
					FruitDTO temp = fruit.get(i);
					fruit.set(i, fruit.get(j));
					fruit.set(j, temp);
				}//if
			}//for j
		}//for i 
	}//priceDescSort()
	//출력 1	
	public void display () {
		DecimalFormat df = new DecimalFormat("￦#,##0");
		System.out.println();
		System.out.println("과일명\t단가\t수량\t가격");
		System.out.println();
		for (int i = 0; i < fruit.size(); i++) {
			System.out.print(fruit.get(i).getName() +"\t");
			System.out.print(df.format(fruit.get(i).getCost()) +"\t");
			System.out.print(fruit.get(i).getQty() +"\t");
			System.out.print(df.format(fruit.get(i).getPrice()) +"\n");
		}// for
		System.out.println();
	}//display()
	//출력 2   
	public void displayPrintf() {
		DecimalFormat df = new DecimalFormat("￦#,##0");
		for (FruitDTO dto : fruit) {
			String name = dto.getName();
			int cost = dto.getCost();
			int qty = dto.getQty();
			int price = dto.getPrice();
			System.out.printf("%-6s\t%8s", name,df.format(cost),qty,df.format(price));
			
			//decimal format ㅏㅎ마ㅕㄴ 스트링타입으로 바뀌니까 d 에서 s로 
		}//for
	}//displayPrintf()
}//class
