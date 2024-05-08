import java.text.DecimalFormat;

public class Book {
	String name, title, company;
	int cost, qty, price;
	
	public void getPrice() {
		price = cost * qty;
		
		
	}//getPrice()
	public void display() {
		System.out.println("제목 : "+ title);
		System.out.println("저자 : "+ name);
		System.out.println("출판사 : "+ company);
		DecimalFormat df = new DecimalFormat("￦#,##0");	 //통화 기호    #,##0 
		System.out.println("단가 : "+ df.format(cost));
		System.out.println("수량 : "+ qty);
		System.out.println("가격 : "+ df.format(price));
		
	}//display
}//class
