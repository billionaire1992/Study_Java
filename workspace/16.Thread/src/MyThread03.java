public class MyThread03 extends Thread {		//Thread 상속
	
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++){
		System.out.println(getName() + "["+i+"]"); 			//getName() : 현재 실행중인 Thread Name 
		}//for
	}//run()
}//class
