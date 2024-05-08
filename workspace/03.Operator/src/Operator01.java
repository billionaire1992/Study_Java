public class Operator01 {
	public static void main(String[] args) {
		//산술연산자  : "+ ,-, *, /	▶수학식에서 다루는 사칙연산과 동일
		//나머지 연산  : % 	▶ 짝수 / 홀수 , 배수의 판단에 사용 → 조건식 처리에 활용
		int num1 = 10, num2 = 3;	// 정수형 변수 num1을 선언하고 값(10)을 할당 하고 ▶초기화
									//정수형 변수 num2 를 선언하고 값(3)을 할당하면서 나열
		
		int addResult = num1 + num2;	//덧셈
		int subResult = num1 - num2;	//뺄셈
		int mulResult = num1 * num2;	//곱셈
		int divResult = num1 / num2;	//나눗셈(주의: 나눗셈의 연산결과는 실수가 나올 수 있다) ▶Casting
		int modResult = num1 % num2;	//나머지 
		
		System.out.println("덧셈 : " + addResult);		//출력값 : 13
		System.out.println("뺄셈 : " + subResult);		//출력값 : 7
		System.out.println("곱셈 : " + mulResult);		//출력값 : 30
		System.out.println("나눗셈 : " + divResult);	//출력값 : 3 	 //int 로 받으면 int 로 
		System.out.println("나머지 : " + modResult);	//출력값 : 1
		
		//출력문에서 사용되는 +(Plus) 연산자의 특성 
		int x = 3, y =5;		
		System.out.println("x + y = " + x + y);		//출력값 : 35   ▶ 결합
		System.out.println("x + y = " +(x + y));	//출력값 : 8	▶괄호에 의한 연산자 우선순위가 결정   
		System.out.println(x + y + " = x + y ");	//출력값 8 = x + y	
	}//main()
}//class