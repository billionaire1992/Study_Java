public class Ex_static01Main {
	public static void main(String[] args) {
		display01();		
		//display02();		//none static : 접근 불가능 		
		
		Ex_static01Main ex01 = new Ex_static01Main();
		ex01.display02();
		
	}//main()
	
	public static void display01(){
		System.out.println("Display01");

	}//display01()
	
	public void display02() {
		System.out.println("Display02");
		
		
	}//display02()
	
	static {
		System.out.println("초기화 블럭");
		
	}//static

}//class

//static : 프로그램 시작전에(초기화) 먼저 메모리에 할당(로딩)
//초기화 블럭 : static {~~~~} ▶ 가장 먼저 실행되는 블럭 