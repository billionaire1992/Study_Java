import java.util.Scanner;

public class Test_Scanner_gugudan {
	//출력하고싶은 구구단의 단수(danNumber)를 입력받은 후, 
	// 입력받은 단수의 구구단 결과 값을 출력하시오 ▶ Scanner (입력), 구구단 for문
	//단 , 입력받는 구구단의 단수는 2단부터 9단까지만 입력받으며, ▶ if (단수의 허용범위)
	//다른 구구단의 단수가 입력되면 오류 메세지를 출력하고 재입력 받아 구구단을 출력▶ while ,continue, break;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("출력 하고싶은 구구단의 단수를 입력하세요 : ");
			int danNumber = scanner.nextInt();
			
			if(danNumber < 2 || danNumber > 9) {
				 System.out.println("입력하신 구구단의 단수가 잘못입력되었습니다 !");//오류메시지
				 System.out.println("2부터 9사이의 단수를 입력하세요!");//오류메시지
				 continue;
			}else {
				//구구단 출력 
				System.out.println(danNumber + "단을 출력합니다.");
				for(int i = 1; i<= 9; i++) {
					if(danNumber * i <10) {
						System.out.print(danNumber + "X" + i + "= 0" + (danNumber * i)+"\t");
					} else {
						System.out.print(danNumber + "X" + i + "=" + (danNumber * i)+"\t");
					}//if
				}//for
			scanner.close();
				break;
			}//if
			
			
		}//while
	}//main()
}//class
