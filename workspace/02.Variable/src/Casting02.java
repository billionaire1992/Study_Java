public class Casting02 {
	public static void main(String[] args) {
		char i = 'A';
		int j = i;		//자동 형 변환(char → int)
		System.out.println("변수 i의 값 : " + i);	//출력값 : A
		System.out.println("변수 j의 값 : " + j);	//출력값 : 65 → UniCode 값
		System.out.println("변수 j의 값 : " + (char) j);	//출력값 : A ▶ 강제 형 변환(int → char)
		
		int num1 = 10, num2 = 2, num3 = 4;	//변수의 선언, 할당(대입), 나열, 초기화
		int result1 = num1 / num2;
		int result2 = num1 / num3;
		double result3 = num1 / num3;
		double result4 = (double) num1 / (double) num3;	//강제 형 변환(int → double)
		
		System.out.println("결과1 : " + result1);	//출력값 : 5
		System.out.println("결과2 : " + result2);	//출력값 : 2(int / int = int)
		System.out.println("결과3 : " + result3);	//출력값 : 2.0(int / int = int ▶ double)
		System.out.println("결과4 : " + result4);	//출력값 : 2.5(double / double = double)
	}//main()
}//class