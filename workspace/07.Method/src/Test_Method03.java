import java.text.DecimalFormat;
import java.util.Scanner;

public class Test_Method03 {
	//두개의 정수를 입력받아 (num1 , num2 ) ▶Scanner 객체 생성  
	//사칙연산을 수행하는 메소드를 호출 : add(),sub(), mul(), div() 
	//결과 값은 리턴받아 출력하시오.
	//단 , 나눗셈의 결과는 실수 형태로 출력하시오 .		   ▶실수타입으로 Casting 	→ divResult()		
	//단 , 나눗셈의 결과는 소수 둘째 자리까지 표시하시오 . ▶출력 형식을 변환 → divFormat ()  : DecimalFormat Class
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력하세요 :" );
		int num1 = Integer.parseInt(scanner.nextLine());
		System.out.print("두 번째 정수를 입력하세요 :" );											//스캐너 닫기     값을 바로 줘서 불필요한 코드 줄이기   // integer  nextLine 사용 
		int num2 = Integer.parseInt(scanner.nextLine());
		scanner.close();
		
		 System.out.println("두 정수의 덧셈 : " + add(num1,num2));
		 System.out.println("두 정수의 뺄셈 : " + sub(num1,num2));
		 System.out.println("두 정수의 곱셈 : " + mul(num1,num2));
		 System.out.println("두 정수의 나눗셈 : " + div(num1,num2));
		 System.out.println("두 정수의 나눗셈 : " + divResult(num1,num2));
		 System.out.println("나눗셈의 결과 : " + divFormat(num1,num2));
		  
	}//main()
	
	public static int add (int num1 , int num2) {
		return  num1 + num2;					
	}//add()

	public static int sub (int num1, int num2) {
		return num1 - num2;			
	}//sub()

	public static int mul (int num1, int num2) {
		return num1 * num2;		
	}//mul()
	
	public static int div (int num1, int num2) {
		return num1 / num2;	
	}//div()
	
	public static double divResult (int num1, int num2) {
		return (double) num1 / num2;																//실수타입으로 Casting      (double)	
	}//divResult()
	
	public static String divFormat(int num1, int num2) {
		//double  result = (double)num1 / num2;
		//return  result;																			//실수타입으로 Casting      (double)	
		DecimalFormat df = new DecimalFormat("0.00");
		double  result = (double)num1 / num2;
		return df.format(result);			// return df.format((double)num1/num2);					//DecimalFormat Class 사용하면 결과는 String Type 	
	}//divFormat()
	
	
}//class





/*
 ○ DecimalFormat Class :  출력 되는 표시 형식을 변경  
  #  : 의미없는 0 은 표시하지 않는다.
  0  : 0의 개수만큼 화면에 표시
 ===================================
 3.14 ##.###			3.14
 3.14 00.000			03.140
  ==================================
  
  0.00		▶ 소수 둘째 자리까지 표시  : 3.40
  #,##0		▶ 천단위 구분기호를 표시	: 1,234,567
  
  
 */


























