import java.util.ArrayList;
import java.util.List;

import com.hanul.array.Test;

public class ArrayListMain02 {
	public static void main(String[] args) {
		//ArrayList<> 컬렉션 객체 (list<>)생성 → Object type : 모든 객체를 다 받아준다.
		//List<Object> list = new ArrayList<Object>();		//다형성 : A a = new B();
		ArrayList<Object> list = new ArrayList<Object>();	//일반적인 객체 생성 : A a = new A();	
		list.add(new Integer(100));		//Element(요소)는 반드시 클래스타입만 허용한다 → 객체화 
		list.add(new String("Apple")); 
		list.add(new Test());
		
		for (int i = 0; i < list.size(); i++) {
			Object object = list.get(i);				//list의 i번째 index 값을 가져온다 ▶Object Type 
			if(object instanceof Integer) {				//object의 타입이 Integer 타입이면 
				System.out.println((Integer)object);	//Integer의 타입으로 Casting 후 출력	
				
			}else if(object instanceof String) {		//object의 타입이 String 타입이면
				System.out.println((String)object);		//String 타입으로 Casting 후 출력
			}else if(object instanceof Test) {
				((Test)object).display();
			}
		}//for
			System.out.println("=========================");
			
			//ArrayList<>컬렉션 객체 생성 (list2<>) : 특정 클래스만(Test.java) 저장하기 위해 타입제한
			List<Test> list2 = new ArrayList<Test>();				//다형성 : A a = new B();
			//ArrayList<Test> list2 = new ArrayList<Test>();		//일반적인 객체 생성 : A a = new A();
			
			list2.add(new Test());
			//list2.add(new String("Banana"));	                    //오류
			list2.get(0).display();
			
	}//main()
}//class


//element















