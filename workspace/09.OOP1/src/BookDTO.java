//상태정보(멤버변수, 필드, 속성)을 저장하는 Class : DTO ,VO, Java Beans
//서로 다른 타입의 데이터를 하나로 묶기 위해서 설계

public class BookDTO {
	// ① 멤버변수 (필드, 속성) 를 선언 ▶접근제어자 : private  → 외부로부터 접근제한
	//정보 은닉(Information hiding), 캡슐화 (Encapsulation) 	
	private String title;
	private String name;
	private String company;
	private int price;


	//② 기본 생성자 메소드 : Default Constructor Method 
	//객체를 생성할 때 호출되는 메소드 : new BookDTO();
	//생략 하면 JVM이 자동으로 생성 : DTO Class 설계시 반드시 구현 
	//클래스의 이름과 메소드의 이름이 동일 , 리턴타입이 존재하지않는다 
	//전달되는 매개변수 리스트와 구현부 (body{})에 코드가 없다. : 깡통 
	//만약에 구현부(body{})에 코드를 작성하면 , 객체가 생성될 때 구현부의 코드가 무조건 실행 
	public BookDTO() {}

	//③ 생성자 메소드 초기화 : 멤버 변수들이 하나로 묶어진다.
	//Source Menu(우클릭) > Generate Constructor using Fields
	public BookDTO(String title, String name, String company, int price) {
		super();				//상위클래스 : JAVA 의 모든클래스는 Object Class 무조건 상속 
		this.title = title;		//매개변수(전달되는 값)와 멤버변수(클래스 안에서 선언된 변수)를
		this.name = name;		//구분하기 위해 멤버변수앞에 this 키워드 사용 
		this.company = company;
		this.price = price;
	}
	
	//④ 입력(setter) 과 출력(getter) 메소드를 정의 : 멤버 변수에 접근
	//generate getters and setters
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}//class
