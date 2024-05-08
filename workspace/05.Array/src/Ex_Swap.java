public class Ex_Swap {
	public static void main(String[] args) {
		//swap (교환) : 서로 값을 맞바꾼다.
		int num1 = 10;
		int num2 = 20;
		System.out.println("교환 전 : num1 = " + num1 + ", num2 = " + num2 );
		
		//num1과 num2의 값을 교환하여 출력하시오 
		//System.out.println("교환 후 : num1 = " + num2 + ", num2 = " + num1 );

		int temp = num1	;		//기존의 num1 의 값을 저장할 임시변수 (temp)를 선언하고 num1의 값을 할당
		num1 = num2 ;			//변수 num2의 값을 변수 num1에 재할당
		num2 = temp ; 			//임시변수 temp의 값을 변수 num2에 재할당 
		System.out.println("교환 후 : num1 = " + num1 + ", num2 = " + num2 );
		
		
	}//main()
}//class
