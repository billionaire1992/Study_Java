public class Ex_if_if {
	public static void main(String[] args) {
		//점수 (score)가 0이상이고 100 이하이면 , 학점을 구하여 출력 
		//그 외의 점수가 입력되면 오류메세지를 출력
		int score = 78;
		
		if(score > 0 && score <= 100) {
			//학점구하기
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
		} else {
			//오류메세지 출력
			System.out.println("점수를 잘못 입력하셨습니다 !");
		}//if
		
		if(score < 0 || score > 100) {		
			System.out.println("점수를 잘못 입력하셨습니다 !");
			//오류메세지
			} else {
			//학점구하기
			} if(score >= 90) {			
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
★ 중첩 if문 : if 문 안에 다른 if 문이 있는 문장 ▶ 전제조건을 설정

if(조건식A){
	조건식A가 참일때 실행되는 문장;
	if(조건식 1){
		조건식 A를 만족한 상태에서 조건식 1이 참일경우 실행되는 문장;
	} else if (조건식 2){
		조건식 A를 만족한 상태에서 조건식 2가 참일경우 실행되는문장;
	}//if
} else if(조건식B){
	조건식B가 참일때 실행되는 문장;
}else {
	거짓일 때 실행되는 문장 ;	
}//if
*/