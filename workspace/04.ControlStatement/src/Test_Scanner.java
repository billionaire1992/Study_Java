import java.util.Scanner;

public class Test_Scanner {
	//키보드로부터 점수(score)를 입력받은 후 , 학점을 출력 ▶ Scanner 사용 , 다중 if (학점)
	//단, 입력받은 점수의 범위는 0부터 100까지 이며, 
	//그외의 점수가 입력되면 오류메세지를 출력하고  ▶ if (점수의 범위를 설정)
	//재입력 받는다. ▶언제 잘못입력할지 모름 while문 사용 . 제대로 입력 하면 break ,continue 	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("점수를 입력하세요 : ");
			int score = scanner.nextInt();

			System.out.println("입력하신 점수는 " + score + " 점 입니다.");
					
			if(score >= 0 && score <=100) {
				if(score >= 90) {
					System.out.println("당신은 A학점 입니다.");
				} else if(score >= 80) {
					System.out.println("당신은 B학점 입니다.");
				} else if(score >= 70) {
					System.out.println("당신은 C학점 입니다.");
				} else if(score >= 60) {
					System.out.println("당신은 D학점 입니다.");
				} else {
					System.out.println("당신은 F학점 입니다.");
				}//if
				break;		//제대로 구하면 break 
			}else {
				System.out.println("점수를 잘못 입력하셨습니다.");
				continue; 		//못구했으니까 다시 
			}//if
		}//while
			scanner.close();
	}//main()
}//class