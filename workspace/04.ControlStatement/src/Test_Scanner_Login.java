import java.util.Scanner;

public class Test_Scanner_Login {
	//사용자로부터 ID와  PW를 입력받는다 ▶Scanner 
	//입력받은 ID값이 'admin' 이고, PW값이 'java1234^^' 이면 '로그인 성공' 메세지를 출력하고 
	//ID값 또는 PW값이 잘못입력되면 '로그인실패' 메세지를 출력하고 재입력받는다. 	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("ID를 입력하세요 : ");
			String id = scanner.nextLine();		
			System.out.print("PW를 입력하세요 : ");
			String pw = scanner.nextLine();		
			
			if(id.equals("admin")  && pw.equals("java1234^^")) { //비교 연산은 숫자만 문자형은 X . 문자열의 동등관계 비교는 equals()메소드를 활용
				System.out.println("로그인 성공");
				break;
			} else {
				System.out.println("로그인 실패");
				continue;
			}//if				
		}//while
		scanner.close();
	}//main()
}//class
