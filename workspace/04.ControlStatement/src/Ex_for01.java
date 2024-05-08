public class Ex_for01 {
	public static void main(String[] args) {
		// 정수 0부터 10까지 출력하시오.
		for (int i = 0; i <= 10; i++) {		//반복변수 i를 0부터 		
			System.out.println(i); 			//i값을 출력
		
		}//for
		
		System.out.println("===========");
		
		//0부터 10까지의 정수중에서 짝수만 출력 :for
		
		for(int i = 0; i <= 10; i = i + 2) {		//i += 2
			System.out.println(i);
			
			
		}//for
		
		System.out.println("========");
		
		//0부터 10까지의 정수 중에서 짝수만 출력 :  for (반복), if (짝수판단)
		for(int i = 0; i <= 10; i++) {
			if( i % 2 == 0) {		//i를 2로 나눈 나머지 값이 0이면 (짝수) 
				System.out.println(i);		//i값을 출력
				
			}//if
		}//for	
	}//main()
}//class



/*
☆ 반복문 (순환문, Loop)
 	-for 문 : 반복횟수를 알고 있을 때, 가장많이 사용
 	-while 문 : 반복횟수를 모를 경우, 선조건 후처리
 	-do-while 문 : 최소 한 번은 반복해야 할 경우 , 선처리 후조건

★  for 문
	for(초기문(시작값); 조건문 (최종값); 반복후 작업(증감값)) {
		반복할 문장(실행문); 
	}//for


*/