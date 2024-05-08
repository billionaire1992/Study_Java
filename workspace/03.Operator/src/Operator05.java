public class Operator05 {
	public static void main(String[] args) {
		//논리 연산자 : 여러개의 조건을 판단 ▶ 조건문에 많이 사용  
		//연산의 결과는 true, false 로 반화
		//조건A && 조건B : [AND조건] ( ~~이면서, ~~이고 )  조건 A도 참이고, B도 참일 경우 true 출력  
		//조건A || 조건B : [OR 조건] ( ~~이거나, ~~또는 ) 조건 A 또는 조건 B 중에서 하나라도 참일 경우 true 출력
		
		
		System.out.println(10 > 5 && 20 > 5);		//true  && true ▶true
		System.out.println(10 > 5 && 20 < 5);		//true  && false▶false
		System.out.println(10 < 5 && 20 > 5);		//false && true ▶false
		System.out.println(10 < 5 && 20 < 5);		//false && false▶false
		
		System.out.println();		//빈줄 삽입
		
		System.out.println(10 > 5 || 20 > 5);		//true  || true ▶true
		System.out.println(10 > 5 || 20 < 5);		//true  || false▶true
		System.out.println(10 < 5 || 20 > 5);		//false || true ▶true
		System.out.println(10 < 5 || 20 < 5);		//false || false▶false
		
		
	}//main()
}//class