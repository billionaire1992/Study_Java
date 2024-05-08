public class Operator02 {
	public static void main(String[] args) {
		//증감연산자 : ++ (증가), --(감소) ▶ 반복문에서 많이 사용
		//단항연산 : 결과를 저장할 별도의 변수가 필요 X, 별도의 연산결과를 처리하지 않는 연산자
		//연산자의 위치(변수명의 앞, 뒤)에 따라 결과가 다르다 
		int num1 = 0, num2 = 10;
		System.out.println(++num1);		//출력값 : 1
		System.out.println(num1);		//출력값 : 1
		System.out.println(--num2);		//출력값 : 9
		System.out.println(num2);		//출력값 : 9 

		System.out.println();
		
		int num3 = 0, num4 = 10;
		System.out.println(num3++);		//출력값 : 0
		System.out.println(num3);		//출력값 : 1
		System.out.println(num4--);		//출력값 : 10
		System.out.println(num4);		//출력값 : 9 
		
		// x = 10, y = 5일경우 '++x + x++ + y++ + ++y '의 결과 값은
		//연산이 수행된후 ' x + y '의 결과 값은
		System.out.println();
		
		int x = 10, y = 5;
		int z = ++x + x++ + y++ + ++y;
		System.out.println("++x + x++ + y++ + ++y : " + z);		//출력값 : 34		▶ 11 + 11 + 5 + 7
		System.out.println("x + y 의 값 : " + (x + y));			//출력값 : 19		▶ 12 + 7
		
		/*
		연산 	출력 	메모리		 
		++x		11		11
		x++		11		12	
		y++		5		6			
		++y		7		7	
		 */
				
	}//main()
}//class