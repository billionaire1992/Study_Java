public class Ex_Method01 {
		//getSum() 메소드에 10과 20을 매개변수로 전달하는 메소드 호출문을 작성  
	public static void main(String[] args) {
		int num1 = 10;				//getSum() 메소드로 전달할 매개변수를 초기화 
		int num2 = 20;
		getSum(num1, num2);			//getSum() 메소드를 호출하는 호출문  ▶실인수
		
		
	}//main()	
	//2개의 정수를 매개변수로 전달받아 합계(sum)를 구하고 출력하는 메소드를 정의 
		public static void getSum(int num1, int num2) {		//getSum() 메소드를 정의 ▶가인수 
			int sum = num1 + num2;
			System.out.println("첫 번째 정수 : " + num1);
			System.out.println("두 번째 정수 : " + num2);
			System.out.println("두 정수의 합 : " + sum);
		}//getSum
	
}//class




/*	
public class Ex_Method01 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int sum = num1 + num2 ;		//동작
		System.out.println("첫 번째 정수 : " + num1);
		System.out.println("두 번째 정수 : " + num2);
		System.out.println("두 정수의 합 : " + sum);
	}//main()
}//class
*/