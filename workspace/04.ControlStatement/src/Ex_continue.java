public class Ex_continue {
	public static void main(String[] args) {
		//continue : 반복문에서 continue문 아래의 실행문은 실행하지않고, 
		//제어권을 반복문의 첫머리로 이동하는 명령
	
		//1부터 10까지의 정수 중에서 홀수의 누적합(oddSum) 을 구하시오 : for문(반복), if (홀수판단)
		int oddSum = 0;
		for (int i = 1; i <= 10; i++) {
			if( i % 2 != 0) {
				oddSum += i;
			}//if
		}//for		
		System.out.println("홀수의 누적합 : " + oddSum);
	
		//1부터 10까지의 정수 중에서 홀수의 누적합(oddSum) 을 구하시오 : for문(반복), if (홀수판단), continue
		oddSum = 0;
		for(int i = 1; i <=10; i++) {
			if(i % 2 == 0) {	//짝수이면
				continue;		//반복문의 처음으로 되돌림					
			}else {
				oddSum += i;
			}//if
		}//for
		System.out.println("홀수의 누적합 : " + oddSum);		
	}//main()
}//class