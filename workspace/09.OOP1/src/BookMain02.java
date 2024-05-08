public class BookMain02 {
	public static void main(String[] args) {
		//도서정보(title, name, company, price ▶BookDTO.java)를 저장 할 
		//객체 배열 (BookDTO[])을 선언
		//BookDTO[] book;
		
		//3권의 도서정보가 저장될 객체 배열을 생성 : new 
		//book = new BookDTO[3];
		
		//3권의 도서정보(BookDTO.java)가 저장될 객체 배열(BookDTO[])을 선언 및 생성
		BookDTO[] book = new BookDTO[3];					//배열을 생성하는  new 
	
		//BookDTO.java 의 초기화 된 생성자 메소드(3단계에서 작성)를 이용하여 내용(값)을 입력
		book[0]= new BookDTO("JAVA", "신용권", "한빛", 24000);		//객체를 생성하는 new 
		book[1]= new BookDTO("View", "김은옥", "삼양", 28000);		//객체를 생성하는 new
		
		//디폴트 생성자 메소드(2단계에서 작성)를 이용하여 값을 입력 : setter method
		BookDTO dto = new BookDTO();
		dto.setTitle("SQL");
		dto.setName("개발팀");
		dto.setCompany("한울");
		dto.setPrice(15000);
		book[2] = dto;
	
		//도서정보 (book[])의 내용을 출력 ▶BookDAO.java → display()메소드 호출 
			BookDAO dao = new BookDAO();
			dao.display(book);
	}//main()
}//class
