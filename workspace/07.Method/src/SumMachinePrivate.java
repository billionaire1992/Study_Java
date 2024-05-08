import java.util.Scanner;

public class SumMachinePrivate {
	//시작 값(startNum)과 종료 값(endNum)을 입력받은 후 
	//startNum 과 endNum을 매개변수로 전달하는 makeSum() 메소드를 호출하고 결과를 출력 
	//단, makeSum()메소드는 SumMachine.java , SumMachineReturn.java를 활용
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("시작 값 을 입력하세요  :" );
		int startNum = Integer.parseInt(scanner.nextLine());
		System.out.print("종료 값 을 입력하세요  :" );
		int endNum = Integer.parseInt(scanner.nextLine());
		scanner.close();
		
		
		//SumMachine.java활용 
		//makeSum()  메소드에 static  있다 : 클래스 명.static메소드명 ();▶SumMachine.makeSum();
		//makeSum()  메소드에 static  없다 : 객체를 생성하여 메소드를 호출 
		//SumMachine.makeSum(startNum, endNum);		//오류 : makeSum() 메소드에 static없다.
		//SumMachine sm = new SumMachine();			//SumMachine 객체 생성
		//sm.makeSum(startNum, endNum);				//makeSum()메소드를 호출 
		//public ~~~ makeSum(){~~~}		: 접근제어자가 public 선언 ▶ 외부에서도 사용이 가능 

		//SumMachineReturn.java활용	
		SumMachineReturn smr = new SumMachineReturn();			//SumMachineReturn 객체 생성
		System.out.println("결과 : " + smr.makeSum(startNum, endNum));	//메소드 호출  오류 → 접근제어자
		// private ~~ makeSum (){~~} : 접근제어자가 private 선언 ▶내부에서만 사용이 가능 		: 정보 은닉
	}//main()
}//class
