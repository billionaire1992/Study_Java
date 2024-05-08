import java.util.HashMap;

public class Ex07_HashMap {
	public static void main(String[] args) {
		//Map 컬렉션 생성
		//      Key(E), Value(E)
		//       id    , tmdwls0203
		//K,V 는 Object 형태만 넣을 수 있음 ( 대문자로 시작하는 것 ) 
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		// ArrayList<E> list = new ArrayList<>;
		//Hash 자료구조는 중복된 키 값을 허용하지 않음 . 마지막 정보로 덮어씀.
		
		map.put("임승진", 100);
		map.put("줄무늬 셔츠 김강윤", 0);
		map.put("최인혁", 123);
		map.put("주세영", 92);
		map.put("이술빈", 95);
		System.out.println(map.size());
		System.out.println(map.get("임승진")); // HashMap 에서 데이터 빼올 때 사용 
		
	}//main()
}//class
