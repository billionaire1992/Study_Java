public class EX_switch {
	public static void main(String[] args) {
		int score = 78;
		switch (score) {
		case 100 :
			System.out.println("A학점");
			break;
		case 99 :
			System.out.println("B학점");
			break;
		case 98 : 
			System.out.println("C학점");
			break;
		default:
			System.out.println("F학점");
			break;
		}//switch → case 비교값을 일일히 작성해야하는 불편함
		
		switch (score / 10) {
		case 10:
			System.out.println("A학점");
			break;
		case 9 :
			System.out.println("A학점");
			break;
		case 8 :
			System.out.println("B학점");
			break;
		case 7 :
			System.out.println("C학점");
			break;
		case 6 :
			System.out.println("D학점");
			break;
		default:
			System.out.println("F학점");
			break;
		}
	
	
	
	
	}//main()
}//class


/*
○ 선택문 (switch ~~case) : 다중 if문을 간략하게 표현

switch (기준값) {
		case 값 1 :
			값 1이 참일 때 실행되는 문장; 
			break;
		case 값 2 :
			값2가 참일 때 실행되는 문장;
			break;
		case 값 N :
			값 N이 참일 때 실행되는 문장;
			break;
		default :
			거짓일 때 실행되는 문장;
			break;
}
			
- 기준값 , 비교값 (값 1, 값 2, 값 N )은 정수형의 자료이어야 한다.
- 실행문 뒤에는 반드시 break; 입력
- 제한사항(제약조건)으로 인하여 실무에서는 거의 사용 X

*/