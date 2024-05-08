import java.util.Scanner;

public class SumMachineReturn {
	//시작 값(startNum)과 종료 값(endNum)을 입력받은 후 
	//startNum 과 endNum을 매개변수로 전달하는 makeSum() 메소드를 호출
	//결과 값(sum)을 리턴받아 출력하시오 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("시작 값 을 입력하세요  :" );
		int startNum = Integer.parseInt(scanner.nextLine());
		System.out.print("종료 값 을 입력하세요  :" );
		int endNum = Integer.parseInt(scanner.nextLine());
		scanner.close();
		
		System.out.println("시작값 : " + startNum);
		System.out.println("종료값 : " + endNum);
		//System.out.println("누적합 : " + makeSum(startNum , endNum));
		
	 SumMachineReturn smr = new SumMachineReturn();
	 System.out.println("누적합 : "+ smr.makeSum(startNum, endNum));
		
		
	}//main()
	
	//시작값부터 종료값까지 누적합 (sum)을 계산하고 리턴 하는 메소드 makeSum();를 정의 
	public  int makeSum(int startNum, int endNum) {
		int sum = 0;
		for (int i =startNum; i <= endNum; i++) {
			sum += i;
		}//for
		return sum;
	}//makeSum	
}//class
