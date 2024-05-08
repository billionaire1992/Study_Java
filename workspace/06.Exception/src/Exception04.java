import java.util.Scanner;

public class Exception04 {
	//두 개의 실수 * num 1, num2를 입력받아 덧셈을 연산을 수행하고 결과를 출력하시오 .	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("첫 번째 실수를 입력하세요 : ");		
				double num1 = Double.parseDouble(scanner.nextLine());
				System.out.print("두 번째 실수를 입력하세요 : ");				
				double num2 = Double.parseDouble(scanner.nextLine());	
				System.out.println("첫번째 실수 : " + num1 );
				System.out.println("두번째 실수 : " + num2);
				
				System.out.println("덧셈의 결과 : "+ (num1+ num2));
				break;
			} catch (Exception e) {
			System.out.println("입력값이 잘못 되었습니다 !");
				continue;
			}//try	
		}//while				
		scanner.close();
	}//main()
}//class