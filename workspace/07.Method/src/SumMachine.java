import java.util.Scanner;

public class SumMachine {
	//시작 값(startNum)과 종료 값(endNum)을 입력받은 후 
	//startNum 과 endNum을 매개변수로 전달하는 makeSum() 메소드를 호출
	public static void main(String[] args) {
		//입력 
		Scanner scanner = new Scanner(System.in);
		System.out.print("시작 값 을 입력하세요  :" );
		int startNum = Integer.parseInt(scanner.nextLine());
		System.out.print("종료 값 을 입력하세요  :" );
		int endNum = Integer.parseInt(scanner.nextLine());
		scanner.close();
		
	 
		
		//메소드 호출 
		//makeSum(startNum, endNum);			// 오류  : makeSum() 메소드에 static 없음
		SumMachine sm = new SumMachine();		// SumMachine 객체 생성
		sm.makeSum(startNum, endNum);			//생성된 객체 안에 있는 메소드 호출 
		
	}//main()
	//시작값부터 종료값까지 누적합 (sum)을 계산하고 출력하는 메소드 makeSum();를 정의 
	private void makeSum(int startNum, int endNum) {		//static 제거 			public → private 	메모리에 저장하지 않음 
		int sum = 0;
		for (int i =startNum; i <= endNum; i++) {
			sum += i;
		}//for
		System.out.println("시작값 : " + startNum);
		System.out.println("종료값 : " + endNum);
		System.out.println("누적합 : " + sum);
	}//makeSum()	
}//class
