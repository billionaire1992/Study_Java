public class Test_for03 {
	public static void main(String[] args) {
		//1부터 100까지의 정수 중에서 3의 배수의 누적합 (sum)과 
		//3의 배수의 개수(cnt)를 출력하시오 .
		int sum = 0;		//3의 배수의 누적합이 저장될 변수를 초기화 
		int cnt = 0;		//3의 배수의 개수가 저장 될 변수를 초기화 
		
		for(int i = 1; i <= 100; i++) {			//1부터 100까지 1씩증가하면서 반복
			if(i % 3 == 0) {					//3의 배수이면 
				sum += i;						//누적합 계산  ▶ sum += i;
				cnt += 1;						//cnt = cnt + 1;  개수를 계산 1씩 증가시켜라  + 1  // cnt++ 1씩 증감
				//cnt++
			}//if
			cnt = i / 3;
		}//for
		System.out.println("3의 배수의 누적합 : " + sum);
		System.out.println("3의 배수의 개수 : " + cnt);
	}//main()
}//class