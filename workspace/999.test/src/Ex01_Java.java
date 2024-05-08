public class Ex01_Java { //의미 : 메모리에 올림. 
	//실행점을 메모리에 올려야함  . main 메소드
	
	// ★ 클래스 안쪽에 올 수있는 모든 멤버  : 우리가 알고있는 모든것
	
	int iVar ; //인스턴스화 과정을 거쳐야지 사용할 수 있는 멤버 (im,iv)
	String iString;
	class Iclass{
		
	}
	interface iInter{
		
	}
	
	static int sVar;
	static String sString;
	static class sClass{
		
	}
	interface sinter{
		
	}
	// 멤버  : 정적 멤버(static), 동적 멤버(instance)
	//static : 항상 클래스에만 접근해도 메모리에 올라가있음
	//instance : new 를 통해서 메모리에 동적으로 로딩해야 
				
	//static int var = 0 ;		//쓰지 못하는 이유 
	// 메모리에 로딩 되는게 달라서  
	public static void main(String[] args) {
		//Ex01_Java ??? = new Ex01_Java();
		//System.out.println(var);
		
		//Ex01_Java.  클래스에 접근만하면 나오는 것 :static 멤버 
		Ex01_Java java = new Ex01_Java();		//java라는 이름으로 ex01_java 에 있는 모든 멤버가 메모리에 올라감 
		//   ???. : 클래스를 인스턴스화 하고 접근하면 나오는것 :  모든멤버  (인스턴스멤버) 
		
		java.method1();
		//java.sMethod1();			//이미 메모리에 있는 메소드인데 또 인스턴스화 과정을 통해서 메모리에 올렸기에 메모리 낭비다
		Ex01_Java.sMethod1(); 
		
		//static 이 붙었는지 여부를 확인 → 안붙었음	→ 인스턴스화 해야겠다 
	
	}// 메모리에서 내림 
	
	static void sMethod1() {
		System.out.println("스태틱 메소드가 실행되었습니다.");
	}
	
	void method1() {
		//어떤 작업을 하고나서 결과를 호출한 부분에서는 받을 수가 없음
		System.out.println("메소드 1이 실행되었습니다.");
	}


	//메소드 : void , void x 
	//void : 단순 실행 메소드 (반환이 없는 타입의 메소드)
	//void x :  실행 후 반환이 반드시 있는 메소드 타입 

}
