import com.hanul.poly01.Animal;
import com.hanul.poly01.Cat;
import com.hanul.poly01.Dog;

public class Poly01Main02 {
	public static void main(String[] args) {
		Dog dog = new Dog();			//일반적인 객체 생성방법
		dog.cry(); 
		
		Animal animal = new Cat();		//업캐스팅 → 다형성 
		animal.cry(); 					//상위클래스가 동작을 시킨다.
		//animal.night();				//오류 발생 : Animal 클래스에는 night() 메소드가 없다.
		
		Cat cat = (Cat)animal;			//다운캐스팅(DownCasting)
		cat.night();
		((Cat)animal).night();			//연쇄 
		
		
		
	}//main()
}//class


/*
○ 객체를 생성하는 방법 
	- Dog dog = new Dog();				▶ 일반적인 객체 생성 방법 : A a = new A();
	- Animal animal = new Cat();		▶ 업캐스팅 (upCasting) → 다형성이 발생  : A a = new B();
	
	
○ 다형성의 전제 조건
	- 상속관계 : public class 하위클래스( A ) extends 상위클래스( B )▶ A → B
	- Override 필수 : 하위클래스(A)에서는 상위클래스 (B) 의 기능(메소드)을 재정의 
	- UpCasting 으로 객체를 생성 : 상위 클래스 (B)쪽으로 할당한다. 	

*/