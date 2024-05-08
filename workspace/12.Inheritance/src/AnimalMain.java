import com.hanul.animal.Cat;
import com.hanul.animal.Dog;

public class AnimalMain {
	public static void main(String[] args) {
		Dog dog = new Dog("멍멍이",3);			//Dog 객체를 생성하고 초기화
		Cat cat = new Cat("야옹이", 2);			//Cat 객체를 생성하고 초기화 		
		
		System.out.println("강아지 이름 : " + dog.getName()+"\t" + "나이: " + dog.getAge());
		System.out.println("고양이 이름 : " + cat.getName()+"\t" + "나이: " + cat.getAge());
		
		
		dog.setName("방울이");
		dog.setAge(5);
		System.out.println("강아지 이름 : " + dog.getName()+"\t" + "나이: " + dog.getAge());
		
	}//main()
}//class
