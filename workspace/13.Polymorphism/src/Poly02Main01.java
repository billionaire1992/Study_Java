import com.hanul.poly02.Animal;
import com.hanul.poly02.Cat;
import com.hanul.poly02.Dog;

public class Poly02Main01 {
	public static void main(String[] args) {
		//Dog 객체 생성 UpCasting ▶ 객체를 생성할 때 상위클래스 쪽으로 생성
		Animal animal = new Dog();
		animal.cry();
		animal = new Cat();
		animal.cry();
		((Cat)animal).night();		//DownCasting 		
	}//main()
}//class
