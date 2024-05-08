import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
	public static void main(String[] args) {
		//Map<String, Integer> map = new HashMap<String, Integer>();		//다형성
		HashMap<String, Integer> map = new HashMap<String, Integer>(); 		//Map 선언 및 생성
		
		map.put("홍길동", 95);	//map 안에 값 저장 : put();
		map.put("김길동", 85);
		map.put("나길동", 90);
		map.put("홍길동", 100);	//map의 key 중복 불가, 동일한 key에 다른 값을 저장 할 경우 최근에 저장한 값 적용
	
		
		System.out.println("Map Size : " + map.size()); 		//맵의 길이
		
		System.out.println("Map Value : " + map.get("홍길동"));	//Key를 사용하여 map안에 저장된 값을 가져온다
		
		map.replace("김길동", 100);								//Key값의 내용을 변경(수정) : replace() 
		System.out.println("김길동 : " + map.get("김길동"));
	
		System.out.println("Key 존재 : "+ map.containsKey("나길동"));	//Key의 존재여부 확인 : containsKey()
		System.out.println("Value 존재 : " + map.containsValue(80));	//Value의 존재여부 확인 : containsValue()
		
		System.out.println("Map Empty : " + map.isEmpty()); 			//Map이 비어있는지 
		
		map.remove("홍길동");											//특정 Key에 해당하는 값 삭제 

		System.out.println("Map Size : " + map.size()); 				//맵의 길이
	
		map.clear(); 													//맵의 전체값을 삭제 
		System.out.println("Map Empty : " + map.isEmpty()); 			//Map이 비어있는지 
		System.out.println("Map Size : " + map.size()); 				//맵의 길이
	
	}//main()
}//class
