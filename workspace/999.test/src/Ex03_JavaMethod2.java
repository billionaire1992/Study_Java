import test2.Ex03_JavaMethod;

public class Ex03_JavaMethod2 {
	public static void main(String[] args) {
		//Ex03_JavaMethod에 있는 모든 멤버를 사용하려고 해보기 .
		//사용이 안된다면 왜 ?
		Ex03_JavaMethod ex = new Ex03_JavaMethod();	// (static) 인스턴스 멤버 사용하기 위해 
		Ex03_JavaMethod2 ex2 = new Ex03_JavaMethod2();
		ex.methodP();
		//ex.methodD();  //같은 패키지에서만 접근 가능 				
		// private 내부에서만 접근 가능 
		// private String id ; 외부에서 접근가능하게 만들 수 있음 (DTO) 
		// getter & setter (public 메소드 )
		ex2.voidMethod();
		
	}//main()
	
	
	//반환 :  밑에 코드를 실행하지않고 메소드를 종료함
	void voidMethod() {
		System.out.println("--");
		return; 
	}
	//반환 : 밑에 코드를 실행하지않고,  리턴타입에 해당하는 값을 반드시 다시 줘야함 
	int intMethod() {
		return 0;
	}
	//알고있는 모든 것들은 모두 리턴타입이 될 수 있음 
	//※해당하는 타입을 반드시 리턴해줘야한다※
	
	double doubleMethod() {
		//double temp_var = 3.14;
		return 3.14;
	}
	// 기본형 변수 -종류 : int, double, float, long, byte, char  	→ 소문자로 시작 
	// 차이점 : null 이라는 것으로 초기화가 가능한지 . 소문자로 시작하는지 
	// 참조형 변수 -종류 : Array[], ArrayList<>, String[], String, int[] 배열 종류는 무조건 참조 
	String[] sArrMethod() {	
		//String[] sArr = null;		
		return null;
	}
	
	
	
	
	
	
	
}//class
