//동기화 후 
public class AfterSynchronized {
	public static void main(String[] args) {
		
		MyData1 myData = new MyData1();
		
		//Thread 객체 생성
		Thread thread01 = new PlusThread1(myData);
		Thread thread02 = new PlusThread1(myData);
		
		//실행
		thread01.start();
		thread02.start();
	}//main()
}//class
 
//쓰레드
class PlusThread1 extends Thread {
	private MyData1 myData;
	
	public PlusThread1(MyData1 myData) {
		this.myData = myData;
	}
	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName() + " 실행결과 : " + myData.data);
	}
}//class

//공유객체 
class MyData1{
	int data = 3;
	public synchronized void plusData() {		//synchronized
		int myData = data;
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		data = myData  + 1;
	}//plusData()
}