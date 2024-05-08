import java.util.Scanner;

public class Ex_Scanner {
	public static void main(String[] args) {
		// 두 개의 정수를 (num1, num2) 입력받은 후, 사칙연산을 수행하고 결과를 출력하시오 
		//입력 : Scanner Class활용 → 객체화 ( 객체 생성) ▶ new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);		
		System.out.print("첫 번째 정수를 입력하세요 : ");		//입력을 대기하는 상태 
		int num1 = scanner.nextInt();
		System.out.print("두 번째 정수를 입력하세요 : ");		//Blocking State (블럭킹 상태)
		int num2 = scanner.nextInt();
		scanner.close();
		
		System.out.println("첫 번째 정수 : " + num1);
		System.out.println("두 번째 정수 : " + num2);
		
		int addResult = num1 + num2 ;
		System.out.println("덧셈의 결과 : " + addResult);
		System.out.println("덧셈의 결과 : " + (num1 + num2));
		System.out.println("뺄셈의 결과 : " + (num1 - num2));
		System.out.println("곱셈의 결과 : " + (num1 * num2));
		System.out.println("나눗셈의 결과 : " + (num1 / num2));				//정수만 찍힘 
		System.out.println("나눗셈의 결과 : " + (double)(num1 / num2));		// ▶ 타입 변환  Casting ▶위치가 잘못됨 연산 끝난후 변환 3.0 찍힘  
		System.out.println("나눗셈의 결과 : " + ((double)num1 / num2));		// ▶ 타입 변환  Casting ▶하나만 변환해도 상관 없음 double  / int 가장 큰 타입이 받음
	}//main()
}//class
