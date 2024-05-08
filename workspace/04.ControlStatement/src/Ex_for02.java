public class Ex_for02 {
	public static void main(String[] args) {
		//1부터 10까지의 누적합 (sum) 을 구하시오 : for (반복)
		int sum = 0;		//결과(누적합)가 저장될 변수 sum 을 초기화
		for (int i = 1; i <=10 ; i++) {
			sum = sum + i;		//sum += i;		
			
			System.out.println("i값 : " + i +", sum값 " + sum); // 진행절차
			
			
		}//for
		System.out.println("누적합 : " + sum);
	}//main()
}//class
