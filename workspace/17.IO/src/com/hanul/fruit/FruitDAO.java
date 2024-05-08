package com.hanul.fruit;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class FruitDAO {
	//ArrayList<FruitDTO> fruit를 매개변수로 전달받는 생성자 메소드 구현
	private ArrayList<FruitDTO> fruit;
	public FruitDAO(ArrayList<FruitDTO> fruit) {
		this.fruit = fruit;
	}
	
	//가격계산
	public void getPrice() {
		for (FruitDTO dto : fruit) {
			dto.setPrice(dto.getCost() * dto.getQty());
		}//for
	}//getPrice()
	
	//가격 내림차순 정렬
	public void priceDescSort() {
		for (int i = 0; i < fruit.size(); i++) {
			for (int j = i + 1; j < fruit.size(); j++) {
				if(fruit.get(i).getPrice() < fruit.get(j).getPrice()) {
					FruitDTO temp = fruit.get(i);
					fruit.set(i, fruit.get(j));
					fruit.set(j, temp);
				}
			}
		}
	}//priceDescSort()
	
	//화면출력
	public void display() {
		DecimalFormat df = new DecimalFormat("￦#,##0");
		System.out.println("================================");
		System.out.println("과일명\t단가\t수량\t가격");
		System.out.println("================================");
		for (FruitDTO dto : fruit) {
			System.out.print(dto.getName() + "\t");
			System.out.print(df.format(dto.getCost()) + "\t");
			System.out.print(dto.getQty() + "\t");
			System.out.print(df.format(dto.getPrice()) + "\n");
		}
		System.out.println("================================");
	}//display()
	
	//파일출력(저장)
	public void fileSave() {
		try {
			String outputPath = "D:\\Study_Java\\workspace\\17.IO\\fruitResult.txt";
			FileWriter fw = new FileWriter(outputPath);
			BufferedWriter bw = new BufferedWriter(fw);
			
			int index = 0;
			DecimalFormat df = new DecimalFormat("￦#,##0");
			for (FruitDTO dto : fruit) {
				if(index < fruit.size() - 1) {
					String result = dto.getName() + "\t" + df.format(dto.getCost()) + "\t";
					result += dto.getQty() + "\t" + df.format(dto.getPrice()) + "\n";
					bw.write(result);
					bw.flush();
					index++;
				}else {
					String result = dto.getName() + "\t" + df.format(dto.getCost()) + "\t";
					result += dto.getQty() + "\t" + df.format(dto.getPrice());
					bw.write(result);
					bw.flush();
					System.out.println("저장이 완료되었습니다.");
				}
			}//for
			
			bw.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//fileSave()
}//class
