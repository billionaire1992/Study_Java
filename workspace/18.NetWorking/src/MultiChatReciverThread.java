import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class MultiChatReciverThread  extends Thread {
	//생성자 메소드 구현
	private Socket socket;
	public MultiChatReciverThread(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			//입력스트림
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			//서버에서 보낸 메세지를 수신받아 화면에 출력
			while(true) {
				String msg = br.readLine();
				if(msg.equals("bye")) {
					break;
				}//if
				System.out.println(msg);
			}//while
			
			//스트림 종료
			br.close();
			
		} catch (Exception e) {
			//e.printStackTrace();
			//System.out.println("MultiChatReciverThread Exception");
			System.out.println("종료되었습니다.");
		}finally {
			try {
				socket.close();
				System.exit(0);
			} catch (Exception e) {
				e.printStackTrace();
			}//try
		}//try
	}//run() 
}//class
