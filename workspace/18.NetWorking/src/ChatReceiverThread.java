import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

//받는 Thread : 메세지를 수신 (입력 스트림) ▶ BufferedReader 
public class ChatReceiverThread extends Thread {
	//생성자 메소드 구현 
	private Socket socket;
	public ChatReceiverThread(Socket socket) {
		this.socket = socket;
	}
	
	
	
	@Override
	public void run() {
		try {
			//입력 스트림 
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			//전송한 메세지를 수신 (입력) 화면에 출력
			while(true) {
				String msg = br.readLine();
				if(msg.equals("bye")) {
					System.out.println("종료 되었습니다.");
					break;
				}//if
				System.out.println("받은메세지 >" + msg);
			}//while
			
			//스트림 종료
			br.close();
			
		} catch (Exception e) {
			//e.printStackTrace(); 
			//System.out.println("ChatReceiverThread Exception");
			if(e.getMessage().equals("Socket Closed")) {
				System.out.println("종료되었습니다.");
			}//if
		}finally {
			try {
				socket.close();
				System.exit(0); //프로그램 종료 
			} catch (Exception e) {
				e.printStackTrace();
			}//try
		}//try
	}//run()
}//class
