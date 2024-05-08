package test2;

public class Ex03_JavaMethod {
	
	
	
	//public - 접근제한자 ( 외부에서 접근이 가능함 ) 
	//default - 같은 패키지 내부에서만 접근이가능함.
	//private - 내부에서만 접근이 가능함
	
	//static (메모리에 항상 먼저 올라가야함)
	//instance (new 를 통해서 생성될 때 메모리에 올라감) 
	
	
	public static void main(String[] args) {  
		//메모리에 올리는 과정 ( 참조를 시작함) 
		Ex03_JavaMethod ex = new Ex03_JavaMethod();
		ex.methodP();
		ex.methodD();
		ex.methodPr();
		
	}//main()  
	
	//void (리턴 타입이 없는)
	public void methodP() {
		System.out.println("퍼블릭 메소드 실행 ");
		//main(null);
	}//methodP()
	void methodD() {
		System.out.println("디폴트 메소드 실행");
	}
	private void methodPr() {
		System.out.println("프라이빗 메소드 ");
	}
	
}//class
