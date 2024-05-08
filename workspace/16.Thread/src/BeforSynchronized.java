//동기화 전
public class BeforSynchronized {
	public static void main(String[] args) {
		//공유 객체 생성
		MyData myData = new MyData();
		
		//Thread 객체 생성
		Thread thread01 = new PlusThread(myData);
		Thread thread02 = new PlusThread(myData);
		
		//실행
		
		thread01.start();
		thread02.start();
		
	}//main()
}//class

//쓰레드 
class PlusThread extends Thread{
	private MyData myData;
	public PlusThread(MyData myData) {
		this.myData = myData;
	}
	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName() + " 실행결과 : " + myData.data);
	}
	
	
	
}//class

//공유객체 
class MyData {
	int data = 3;
	
	public void plusData() {
		int myData = data;
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		data = myData  + 1;
	}//plusData()
}//class