public class Operator03 {
	public static void main(String[] args) {
		// 비트연산 : 하드웨어 제어 → 현재는 거의 사용하지 않는다.
		// ① & (AND) : 입력값이 모두 1일때 1로 출력		
		// ② |	(OR)  : 입력값이 하나라도 1일때 1로 출력	
		// ③ ^	(XOR) : 입력값이 서로 다를 때 1로 출력
		// ④ !	(NOT) : 입력값을 반전 (부정)	▶ 0 → 1, 	1 → 0
		int x = 2;	//2진법  : 10
		int y = 3;	//2진법  : 11							
		
		System.out.println(x & y);		//출력값 : 2						
		System.out.println(x | y);		//출력값 : 3
		System.out.println(x ^ y);		//출력값 : 1
		
		boolean result = true;
		System.out.println(result); //출력값 : true
		System.out.println(!result); //출력값 : false
		
	}//main()
}//class