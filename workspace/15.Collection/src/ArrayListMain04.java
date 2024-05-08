import java.util.ArrayList;

public class ArrayListMain04 {
	public static void main(String[] args) {
		//ArrayList<> 컬렉션 객체(list<>)에 정수 10, 20, 30, 40, 50 을 저장(add())하고 출력(get())
		//ArrayList<Integer> list = new ArrayList<Integer>();		//일반적인 객체 생성방식
		ArrayList<Integer> list = new ArrayList<>();				//생성자 메소드에서 타입 (Element)을 생략 가능
		
		for(int i = 1; i <= 5; i++) {
			list.add(i * 10);				//list.add(new Integer( i * 10)); ▶AutoBoxing : PDT, String Type
		}//for
		
		//단순 for문 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}//for
		
		System.out.println("==");
		//향상된 for문 출력
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		//Boxing된 List <>출력 
		System.out.println(list);
		System.out.println("==");
		
	}//main()
}//class
