public class Exception05 {
	// 1부터 100까지의 누적 합(sum)을 구하여 출력하시오 : for (반복)
	// 단 누적합이 713 이상이 되면 , 계산을 중지하고 결과를 출력 	: if 조건 break 중지
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <=100 ;i++) {
			sum += i;
			if(sum >= 713) {
				System.out.println("누적합이 713 이상이 되었습니다.\n종료합니다. ");
				break;
			}//if			
		}//for
		System.out.println("누적합 : " + sum);
		
		//try ~~catch 블럭을 이용하여 예외 처리하시오  ▶throw 
		//throw : 강제로 예외를 발생시켜 catch 블럭으로 예외를 던진다(넘긴다).
		try {
			int total = 0;
			for (int i = 1; i <= 100; i++) {
				total += i ;
				if (total >= 713) {
					throw new Exception("누적합이 713 이상이 되었습니다.\n종료합니다 .");
				}//if
			}//for
		} catch (Exception e) {
			e.printStackTrace(); 				//예외를 상세하게 출력한다.
			
		} 
	}//main()
}//class
