import java.util.Random;
import java.util.Scanner;

public class HighLowGame {
	public static void main(String[] args) {
		
		
		//1부터 100사이의 임의의 정수값을 comNumber에 저장 ▶Random 객체 
		
		Random random = new Random();		
		int comNumber = random.nextInt(100)+1; 			// 0~99 까지 나오기때문에 +1 해서 1~100사이의 임의의 정수가 나오도록 할당
		//사용자로부터 숫자를 입력받기 위한 준비 단계 ▶Scanner 객체
		Scanner scanner = new Scanner(System.in);
		int userNumber = 0 ;		//사용자가 입력한 값을 저장할 변수를 초기화
		int count = 0;				//시도횟수를 저장할 변수를 초기화 
		
		
		
		
		//게임 시작 		
		do {
			System.out.print("1부터 100사이의 정수 값을 입력하세요 : ");
			userNumber = Integer.parseInt(scanner.nextLine());
			count++;
			
			if(userNumber < comNumber) {
				System.out.println("더 큰 수를 입력하세요 !\n");
				continue;
			}else if(userNumber > comNumber) {
				System.out.println("더 작은 수를 입력하세요 !\n");
			}else {
				System.out.println("맞췄습니다 !\n");
				System.out.println("시도 횟수는 " + count + "번 입니다.");
				break;
			}
		} while(true);
		scanner.close();
	}//main()
}//class



