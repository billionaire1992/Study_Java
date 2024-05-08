import java.util.Scanner;

public class Test_Method02 {
	//두개의 실수를 입력(num1 , num2 ) 받아 ▶Scanner 
	//두 실수의 합을 계산하고 return 하는 메소드 (getSum())를 호출 
	//리턴 받은 결과를 출력 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫 번째 실수를 입력하세요 :" );
		double num1 = Double.parseDouble(scanner.nextLine());
		System.out.print("두 번째 실수를 입력하세요 :" );
		double num2 = Double.parseDouble(scanner.nextLine());
		scanner.close();
		double sum = getSum(num1, num2);		//getSum()메소드를 호출하고 결과를 리턴받는다.
		System.out.println("두 실수의 합 : " + sum);
		System.out.println("두 실수의 합 : " + getSum(num1,num2));
	}//main
	
	
	//두개의 실수를 전달받아 합(sum)을 계산하고 리턴하는 메소드 (getSum()) 정의 
	public static double getSum(double num1, double num2) {
		double sum = num1 + num2;
		return sum;
		//return num1 + num2;
	
	}//getSum
}//class
