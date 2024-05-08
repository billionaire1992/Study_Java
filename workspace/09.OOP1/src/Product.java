public class Product {		//Class (설계도) : 특성(변수, 상태정보)과 동작(메소드, 행위정보)이 기술(구현)된다 
	//멤버 변수 (필드, 속성) : 상태정보 ▶ DTO Class , VO Class, Java been
	int num;		//제품번호	
	String name;	//제품명 
	
	
	//멤버 메소드(행위정보) ▶ DAO Class 
	public void display() {
		System.out.println("제품번호 : " + num);
		System.out.println("제품명 : " + name);
		System.out.println();
	}//display
}//class
