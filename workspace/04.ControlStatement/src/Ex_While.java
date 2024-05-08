public class Ex_While {
	public static void main(String[] args) {
		//1부터 100까지의 누적합 (sum)을 구하시오 : for 
		int forSum = 0;		//결과가 저장될 변수를 초기화
		for(int i = 1; i <= 100; i++) {			//1부터 100까지 1씩 증가하면서 반복
			forSum = forSum + i;				//누적합 계산 ▶ forSum += i;
		}//for
		System.out.println("for 누적합 : " + forSum);
		
		//1부터 100까지의 누적합 (sum)을 구하시오 : while
		int whileSum = 0;		//결과가 저장될 변수를 초기화
		int i = 1;				//초기값
		while (i <= 100) {		//조건식
			whileSum += i;		//실행문(반복문) : 누적합계산 
			i++;				//증감값
		}//while
		System.out.println("while 누적합 : " + whileSum);
	}//main
}//class



/* 
 *  While문 : 반복횟수를 모를 경우 사용 (선조건 → 후처리)
  
 	초기값 설정; 
 ★ While (조건식){
  		실행문;
  		증감값;
}

 */