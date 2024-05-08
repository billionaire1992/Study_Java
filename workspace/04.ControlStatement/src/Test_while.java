public class Test_while {
	public static void main(String[] args) {
		// 1부터 100까지의 정수 중에서 짝수의 합 (forEvenSum) 을 출력 :  for (반복), if (짝수판단)
		int forEvenSum = 0;			//결과가 저장될 변수를 초기화 
		for(int i = 1; i <= 100; i++) {		//1부터 100까지 1씩 증가하면서 반복
			if(i % 2 == 0) {		//짝수이면
				forEvenSum += i;	//누적합 계산	
				
			
			}//if
		}//for
		System.out.println("for 짝수의 합 : "+ forEvenSum);
		
		
		// 1부터 100까지의 정수 중에서 짝수의 합 (whileEvenSum) 을 출력 : while(반복), if (짝수판단)
		int whileEvenSum = 0;
		
		int i = 1;
		while(i <= 100) {	//조건식
			if(i % 2 == 0) {	
				whileEvenSum += i;					
			}//if		//실행문	              1 은 2로 나눠서 거짓이면 멈추니까 처음에 끊고 실행문 밑에 증감값을 넣어서 다시 반복 
			i++;		//증감값
		}//while
		
		
		System.out.println("while 짝수의 합 : "+ whileEvenSum);
		
	}//main
}//class