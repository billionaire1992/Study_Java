public class Casting01 {
	public static void main(String[] args) {
		int num1 = 10;		//정수형 변수 num1을 선언하고, 값(10)을 할당 ▶ 초기화
		double num2;		//실수형 변수 num2를 선언만 한 상태
		num2 = num1;		//변수 num1의 값을 변수 num2에 할당(대입)
		System.out.println("변수 num1의 값 : " + num1);		//출력값 : 10
		System.out.println("변수 num2의 값 : " + num2);		//출력값 : 10.0
		//자동 형 변환 : 작은 타입(int)이 큰 타입(double)으로 자동으로 변환
		// ▶ 묵시적 형 변환, UpCasting, Promotion
		
		int num3;			//정수형 변수 num3을 선언만 한 상태
		double num4 = 3.14;	//실수형 변수 num4를 선언하고, 값(3.14)을 할당 ▶ 초기화
		//num3 = num4;		//오류 : 큰 타입(double)을 작은 타입(int)에 할당
		num3 = (int) num4;	//double 타입의 변수를 강제로 int 타입으로 변환
		System.out.println("변수 num3의 값 : " + num3);		//출력값 : 3 → 0.14의 손실 발생	
		System.out.println("변수 num4의 값 : " + num4);		//출력값 : 3.14
		//강제 형 변환 : 큰 타입(double)이 작은 타입(int)으로 강제로 변환 ▶ Casting 연산자
		// ▶ 명시적 형 변환, DownCasting, 일반적인 의미의 Casting
		
		int x = 128;
		byte y = (byte) x;	//강제 형 변환(int → byte)
		System.out.println("변수 x의 값 : " + x);		//출력값 : 128
		System.out.println("변수 y의 값 : " + y);		//출력값 : -128
	}//main()
}//class
