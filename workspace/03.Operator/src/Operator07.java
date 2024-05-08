public class Operator07 {
	public static void main(String[] args) {
		int num1 = 10;
		String result = num1 == 10 ? "결과 : 같다 " : "결과 : 다르다";
		System.out.println(result);
		
		int num2 = 10;
		if(num2 == 10) {
			System.out.println("결과 : 같다");
		}else {
			System.out.println("결과 : 다르다");
					
		}//if
	}//main()
}//class


/*
  ○ 삼항 연산자
  	- 3개의 항으로 구성된다.
  	- 조건식 ? true : false; 
  		1		2		3
  	- 간단한 조건문을 작성할 때 편리하다. ▶ if ~~ else
  */
 