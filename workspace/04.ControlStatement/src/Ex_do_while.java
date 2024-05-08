public class Ex_do_while {
	public static void main(String[] args) {
		// 1부터 100까지의 정수 중에서 짝수의 합 (whileEvenSum) 을 출력 : while(반복), if (짝수판단)
		int whileEvenSum = 0;		//결과가 저장될 변수를 초기화 
		int i = 1;					//초기값 설정 : 1부터 시작
		while(i <= 100) {			//조건식 : 100까지 구동
			if(i % 2 == 0) {		//실행문 : 반복변수의 값이 짝수이면 
				whileEvenSum += i;	// 짝수의 누적합 계산				
			}//if		//실행문 종료1은 2로 나눠서 거짓이면 멈추니까 처음에 끊고 실행문 밑에 증감값을 넣어서 다시 반복 
			i++;		//증감값
		}//while		//while 반복문 종료
		System.out.println("while 짝수의 합	: "+ whileEvenSum);	//출력

		// 1부터 100까지의 정수 중에서 짝수의 합 (doEvenSum) 을 출력 : do~while(반복), if (짝수판단)
		
		int doEvenSum = 0;			//결과가 저장될 변수를 초기화
		i = 1;						//초기값 설정(재할당) : 1부터 시작
		do{
			if(i % 2 == 0) {		//실행문 : 짝수이면 
				doEvenSum += i;		//짝수의 누적합 계산
			}//if
			i++;					//증감값 : 1씩 증가
		} while(i <= 100);			//조건식 : 100까지 동작
		
		
		
		System.out.println("do ~ while 짝수의 합 : "+ doEvenSum);
		
		
					
	}//main()
}//class



/*
○ do ~ while : 선처리 → 후조건
	▶주어진 조건이 처음부터 거짓이더라도, 실행문 (반복문)은 최소 1번은 실행된다.
	
	
초기값 설정;
do {
	실행문;
	증감값;
} while (조건식);






*/
