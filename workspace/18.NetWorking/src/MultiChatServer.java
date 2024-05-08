import java.net.ServerSocket;
import java.net.Socket;

public class MultiChatServer {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket socket = null;
		try {
			ss = new ServerSocket(9999);
			System.out.println("서버가 구동중입니다.");
			//socket = ss.accept();
			
			//다수의 클라이언트가 서버에 접속 → 클라이언트의 개수 만큼 socket 생성 
			while(true) {
				socket = ss.accept();
				Thread pt = new MultiChatPersonThread(socket); 		//다수의 클라이언트를 제어하는 Thread
				pt.start();
			}//while

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("MulitChatServer Exception");
		} /* finally {
			try {
				socket.close();
				ss.close();
			} catch (Exception e) {
				e.printStackTrace();
			}//try
		}//try */
		
	}//main()
}//class