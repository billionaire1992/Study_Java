public class Ex_if_else_if {
	public static void main(String[] args) {
		//점수 (score)가 90이상이면 'A'학점, 점수가 90미만이면서 80 이상이면 'B'학점
		//점수가 70이상이면 'C'학점, 60이상이면 'D'학점 60 미만이면 'F'학점
		
		int score = 79;
		
		if(score >= 90) {			
			System.out.println("A학점");
		} else if(score >= 80) {
			System.out.println("B학점");
		} else if(score >= 70) {
			System.out.println("C학점");
		} else if(score >= 60) {
			System.out.println("D학점");			
		} else {
			System.out.println("F학점");
		}//if
	}//main()
}//class



/*
★ 다중  if문 : 여러개의 조건을 판단하여,  해당 조건을 만족할경우 실행
if(조건식1){
	조건식 1이 참일 때 실행되는 문장;
} else if(조건식 2) {
	조건식 2가 참일 때 실행되는 문장;
} else if (조건식N){
	조건식 N이 참일 때 실행되는 문장;
} else {
	거짓일 때 실행되는 문장 ; 
}//if

*/