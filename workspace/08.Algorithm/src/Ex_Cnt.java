import java.util.Scanner;

public class Ex_Cnt {

	//두 개의 정수를 입력받아 (num1, num2 ) 두 수 사이의 정수의 개수를 구하고 출력 
	public static void main(String[] args) {
		//두개의 정수를 입력 
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1= Integer.parseInt(scanner.nextLine());
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2= Integer.parseInt(scanner.nextLine());
		scanner.close();
		
		Ex_Cnt ex = new Ex_Cnt();			//객체 생성
		int cnt =ex.getCnt(num1, num2);		//개수를 구하는 메소드를 호출		//int 생각 
		ex.display(num1,num2, cnt);
	}//main()	
	//두 수 사이의 정수의 개수를 구하고 리턴하는 메소드를 정의
	public int getCnt(int num1, int num2) {
		int cnt = 0;
		for(int i = num1; i <= num2; i++) {
			cnt++;		
		}//for
		return cnt;
	}//getCnt	
	
	//출력하는 메소드를 정의
	public void display (int num1,int num2,int cnt) {
		System.out.println("첫 번째 정수는  : "+ num1 );
		System.out.println("두 번째 정수는  : "+ num2 );
		System.out.println("두 수 사이의 정수의 개수 : " + cnt);
		
		
	}//display
}//class



/*
 * 	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1= Integer.parseInt(scanner.nextLine());
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2= Integer.parseInt(scanner.nextLine());
		scanner.close();
		
	
		
		int cnt = 0;
		for(int i = num1; i <= num2; i++) {
			cnt++;
			//cnt += 1;
			
		}//for
		System.out.println("첫 번째 정수는  : "+ num1 );
		System.out.println("두 번째 정수는  : "+ num2 );
		System.out.println("두 수 사이의 정수의 개수 : " + cnt);
 * 	}//main()
 * 
 * 
 * 
 * 
 * */
 