

public class Ex02_Java {
	
	public Ex02_Java() {
		//객체를 생성할 때 사용되는 메소드
		//비어있는 생성자는 별도로 개발자가 생성자 메소드를 만들기 전까지만 유효하다.
	}
	
	public static void main(String[] args) {
		//문제 : IClass에 있는 멤버 iField 와 method1을 각각 출력하고 실행하기
		
		Ex02_Java ex = new Ex02_Java(); // 생성자 메소드 : 객체를 인스턴스화 인스턴스 멤버 사용하게 해줌  
		
		System.out.println("iValued의 값 : " + ex.iValue); 
		
		
		
		
		Ex02_Java.IClass ic = ex.new IClass(); 			//인스턴스 클래스 생성식   
		System.out.println("Ic의 필드 "+ ic.iField );
		ic.method1(); 
		
		
		
		System.out.println("------------------");	
		
		Ex02_Java.Sclass Sc = new Sclass();
		//SClass sc = new Ex02_Java.Sclass(); 		//  static 멤버이기때문에 클래스에 .찍으면됨
		System.out.println(Sc.field1);				// *. 찍고 나오는거 인스턴스 멤버 
		System.out.println(Sclass.field2);
		Sc.method1();
		Sclass.method2();
		ex.localMethod();
		
		
		
		
	}//main()
	
	int iValue;
	
	//Ex02_java의 멤버 (static 이 안붙음)
	class IClass{		//인스턴스화 과정이 있고나서부터 사용가능 
		
		//멤버
		int iField ;
		//static int iField2; // 인스텐스 멤버의 자식은  static 사용이 불가능 . 
		void method1() {
			System.out.println("IClass의 메소드 실행 ");
		}
	}
	
	//main메소드에서 SClass에서 멤버 전체를 사용하기 (변수-출력, 메소드 출력)
	
	static class Sclass{
		int field1;
		static int field2;
		void method1() {
			System.out.println("SClass의 멤버 (인스턴스 멤버)");
		}
		static void method2() {
			System.out.println("SClass의 멤버 (스태틱)");
		}
	
	}

	
	void localMethod() {	//지역 변수 : 메소드 안에서 선언되고 사용되는 것들 
		//LClass의 모든멤버 사용해보기 
		
		int lv = 0; //메소드 밖에서 어떻게 사용할 수 있을까 o/x :  X 
		// 별도로 return 을 두는게 아니면 접근자체가 불가능 하다. 
		
		
		class LClass{
			//Class 안쪽에 있는지 여부 
			//static 붙었는지 여부 
			//static 붙었으면 바로 사용 가능 안붙었으면 instance 화 후 사용가능 
			int field1 = 0;
			//static 변수 field2 만들어보기 될까 안될까 X 
			void method1() {
				System.out.println("LClass의 메소드 ");
			}//method1
		}//LClass
		
		LClass lc = new LClass();
		System.out.println(lc.field1);
		lc.method1();

		
	}//return 이 필요한 이유는 메소드 안에있는 모든것들은 메소드 중괄호가 닫힐 때 전부 다 사라짐
	
}//class
