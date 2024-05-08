public class StudentMain {
	//Student Class를 이용하여 객체 생성 
	//값( 이름 , 국어, 영어, 수학) 을 할당  : 멤버 변수 활용 
	//총점계산getSum(), 평균계산getAvg(), 결과display()를 출력하는 메소드를 호출 : 멤버 메소드 
	public static void main(String[] args) {
		Student s1 = new Student();		//객체생성 : s1 → 인스턴스 변수  (Instance Variable)
		s1.name = "홍길동";				//인스턴스 변수명 . 멤버변수  = 값;
		s1.kor = 90;		
		s1.eng = 65;
		s1.mat = 100;
		s1.getSum(); 					//메소드 호출 : 인스턴스 변수명.멤버 메소드();
		s1.getAvg();
		s1.display();
		
		System.out.println();
	
		Student s2 = new Student();
		s2.name = "박문수";
		s2.kor = 100;		
		s2.eng = 95;
		s2.mat = 80;
	
		s2.getSum(); 					//메소드 호출 : 인스턴스 변수명.멤버 메소드();
		s2.getAvg();
		s2.display();
		
	}//main()
}//class
