public class MyThreadMain04 {
	public static void main(String[] args) {
		//객체 생성 : UpCasting
		Runnable run01 = new MyThread04();
		Runnable run02 = new MyThread05();		
		
		//Runnable Interface 상속받아 구현한 Thread 는 진짜  Thread 가 아님
		//Thread 객체를 생성하고, Runnable Interface 를 상속받은 클래스를 매개변수로 전당한다.
		//run01.start();		//오류 : ㅈ ㅣㄴ짜 쓰레드가 아님 
		Thread thread01 = new Thread(run01);
		Thread thread02 = new Thread(run02);
		//Thread thread = new Thread(new MyThread04());	//연쇄
		
		//Thread 의 실행은 start() 메소드 호출
		thread01.start();		//1 ~ 30 출력
		thread02.start();		//a ~ z	 출력
		
	}//main()
}//class
