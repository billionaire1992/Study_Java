import java.util.ArrayList;

public class ArrayListMain05 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add(new String("AAA"));	//정상적인 구현 방식
		list.add("BBB"); 				//AutoBoxing : 기본 데이터 타입(PDT), String Type 
		list.add("CCC");				//add() : 삽입 → 순차적으로 저장 
		System.out.println(list);
		
		list.add(1, "DDD");	 			//index 위치값에 값이 저장되고, 기존 값을 뒤로 이동한다.
		System.out.println(list);
		
		list.set(1, "EEE");				//index 위치값이 수정
		System.out.println(list);
		
		list.remove(1);					//index 위치값이 삭제되면서, 뒷 쪽의 값이 앞으로 이동된다.
		System.out.println(list);
		
		list.clear();					//list<> 의 전체 값이 삭제 : removeAll() 동일
		System.out.println(list);
		
	}//main()
}//class
