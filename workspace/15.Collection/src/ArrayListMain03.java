import java.util.ArrayList;

public class ArrayListMain03 {
	public static void main(String[] args) {
		//ArrayList<> 컬렉션 객체(list<>)에 정수 10, 20, 30, 40, 50 을 저장(add())하고 출력(get())
		//ArrayList<Object> list = new ArrayList<Object>();		//Object : 타입비교 (instanceof) 후 Casting 필요 
		ArrayList<Integer> list = new ArrayList<Integer>();		//Integer 타입으로 제한 
		
		list.add(new Integer(10));						//정상적인 구현방식 
		list.add(new Integer(20));						//new 키워드로 객체화 
		list.add(30);									//int → Integer ▶AutoBoxing				
		list.add(40);									//컴파일러(JVM)가 자동으로 처리해줌
		list.add(50);									//기본 데이터 타입(PDT), String Type만 가능
		 
		
		
		
		System.out.println((Integer)list.get(0));		//Casting 후 출력 (접근)
		System.out.println((Integer)list.get(1));		//정상적인 구현방식
		System.out.println(list.get(2));				//원래의 타입으로 변환 ▶AutoUnBoxing
		System.out.println(list.get(3));				//
		System.out.println(list.get(4));				//
		
		
		
	}//main()
}//class

//autoboxing