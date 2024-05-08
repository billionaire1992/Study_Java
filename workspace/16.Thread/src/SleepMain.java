public class SleepMain {
	public static void main(String[] args) {
		Thread thread0 = new Sleep(1);
		Thread thread1 = new Sleep(2);
		Thread thread2 = new Sleep(3);
		
		thread0.start();
		thread1.start();
		thread2.start();
		
	}//main
}//class
