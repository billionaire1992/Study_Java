import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		int num = rtnInt(0); 
		
	}//main()
	
	public static int rtnInt(int num) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		System.out.print("입력 : ");
		while(true) {
			if(num == 10) {
				num = Integer.parseInt(scanner.nextLine());
				System.out.println("입력하신 숫자는"+ num +"입니다.");
				break;
			}else {
				System.out.println("다시입력");
				scanner.close();
				continue;
			}//if
		}//while]
		return num;
	}//rtnInt()
}//class
