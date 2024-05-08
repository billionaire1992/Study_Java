import java.util.Scanner;

public class Test_Method04 {
	//두개의 정수를 입력 받은 후 (num1 , num2 ) 받은 후  scanner
	//두 정수 사이의 홀수의 합 (oddSum)을 계산하여 결과를 리턴하는 메소드(getOddSum())를 호출  for if 
	//두 정수 사이의 짝수의 합 (evenSum)을 계산하여 결과를 리턴하는 메소드(getEvenSum())를 호출 
	//결과를 출력하는 메소드(display())를 호출   
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in); 
		 System.out.print("첫 번째 정수를 입력하세요 :" );
		 int num1 = Integer.parseInt(scanner.nextLine());
		 System.out.print("두 번째 정수를 입력하세요 :" );											 
		 int num2 = Integer.parseInt(scanner.nextLine());
		 scanner.close();
		
		 
		//int oddSum = getOddSum(num1,num2);
		//int evenSum = getEvenSum(num1,num2);
		//display(num1, num2, evenSum, oddSum);			//결과를 출력하는 메소드를 호출
		
		 
		 
		 if(num1 >=num2) {
			System.out.println("첫 번째 정수는 작은 수 , 두 번째 정수는 큰 수를 입력하세요 "); 
		 }else {
			int oddSum = getOddSum(num1,num2);				// 메소드 호출 
			int evenSum = getEvenSum(num1,num2);
			display(num1, num2, evenSum, oddSum);			//  59번 메소드 호출 
		 }//if
		 
		 
		 
		 
		 
		
	}//main()
	//홀수의 합을 계산하고 결과를 리턴하는 메소드를 정의  : getOddSum()
	public static int getOddSum(int num1, int num2) {
		int oddSum = 0;
		for(int i = num1; i <= num2; i++) {
			if(i % 2 != 0) {
				
				oddSum += i;
			}//if
		}//for
		return oddSum;	
	}//getOddSum()
	
	//짝수의 합을 계산하고 결과를 리턴하는 메소드를 정의  : getEvenSum()
		public static int getEvenSum(int num1, int num2) {
			int evenSum = 0;
			for(int i = num1; i <= num2; i++) {
				if(i % 2 == 0) {
					evenSum += i;
				}//if
			}//for
			return evenSum;
	}//getEvenSum()
	public static void display(int num1, int num2, int evenSum, int oddSum) {
		System.out.println("첫 번째 정수  : " + num1);
		System.out.println("두 번째 정수  : " + num2);
		System.out.println("홀수의 합  : " + oddSum);
		System.out.println("짝수의 합  : " + evenSum);															//59번 메소드를 28번  display 로 
	}//display()
	
	
}//class
