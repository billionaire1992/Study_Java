import com.hanul.book.BookDAO;
import com.hanul.book.BookDTO;

public class BookMain {
	//- 3권의 도서정보(제목, 저자, 출판사 , 단가, 수량 ▶ BookDTO.java)
	//객체배열 (book[])을 선언 및 생성하고 값을 할당
	
	public static void main(String[] args) {
		BookDTO[] book = new BookDTO[3];
		book[0] = new BookDTO("JAVA", "신용권", "한빛", 24000, 14);
		book[1] = new BookDTO("View", "김은옥","삼양", 28000, 11);
		book[2] = new BookDTO("SQL", "개발팀", "한울", 15000, 19);
		
		BookDAO dao = new BookDAO();
		dao.getPrice(book);
		dao.display(book);
		
		
	}//main()
}//class
