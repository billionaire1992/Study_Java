public class Test_for02 {
	public static void main(String[] args) {
		//1부터 10까지의 정수 중에서 홀수의 누적합(oddSum)을 구하여 출력 :  for문 (반복) , if (홀수판단)
		int oddSum = 0;
		
		for (int i = 1; i <= 10; i++) {
			if(i %2 != 0) {
				oddSum += i;				
			}//if
		}//for
		System.out.println(" 홀수의 누적합 : " + oddSum);
	}//main()
}//class