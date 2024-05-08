public class Operator06 {
	public static void main(String[] args) {
		//대입(할당) 연산자 : = (equal)는 같다라는 의미가 아니라 대입(할당)을 의미
		//Left_Value = Right_Value : Right_Value의 값을 Left_Value에 대입(할당) 
		//Variable = Literal, Data, Expression 
		int num1 = 10;	//정수형 변수  num1을 선언하고 num1 에 값 10을 할당▶ 초기화 
		System.out.println("변수 num1 의 값 : " + num1);	
		
		int num2 = num1;
		//정수형 변수 num2 를 선언하고 값 (num1 변수에 할당된 값)을 할당 
		System.out.println("변수 num2 의 값 : " + num2);
		
		num2 = num1 + num1;	//재할당 (변수 선언할 필요 없음)  
		System.out.println("변수 num2 의 값 : " + num2);
		
		num2 = num2 + num1;	//재할당
		System.out.println("변수 num2 의 값 : " + num2);
		
		//복합대입 연산자 : R_Value 에서 사용되는 변수 L_Value에 대입되는 변수가 동일할 때 사용 
		num2 += num1;		// num2 = num2 + num1
		System.out.println("변수 num2 의 값 : " + num2);
		
		num2 -= num1;		// num2 = num2 - num1
		System.out.println("변수 num2 의 값 : " + num2);
	}//main()
}//class