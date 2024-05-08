public class MyThreadMain01 {
	public static void main(String[] args) {
		//객체 생성 : 다형성 
		//Thread thread01 = new MyThread01();
		//Thread thread02 = new MyThread02();  
		
		MyThread01 thread01 = new MyThread01();
		MyThread02 thread02 = new MyThread02();
		
		//run() 메소드 호출 
		//thread01.run();
		//thread02.run();
		
		//run() 메소드를 동시에 실행 ▶ start() 실행 
		thread01.start();		//1 ~ 30
		thread02.start();		//a ~ z 
	}//main()
}//class
