public class Ex_if_else {
	public static void main(String[] args) {
		int num = 9;		//정수형 변수  num을 선언하고 값을 할당 ▶초기화 
		if(num % 2 == 0) {		//num을 2로 나눈 나머지 값이 0과 같다 → 짝수
			System.out.println("짝수입니다.");
			
		} else {				//조건식이 false → 홀수
			System.out.println("홀수입니다.");
		}//if
				
		
	}//main()
}//class


/*
★ 블럭  if문 : 조건을 판단하여 참일 때 또는 거짓일 때의 명령을 실행

if (조건식) {
	참일 때 실행되는 문장;
} else{
	거짓일 때 실행되는 문장;
}//if



*/