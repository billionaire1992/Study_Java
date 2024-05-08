import java.net.Socket;

public class ChatClient {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket("192.168.0.137",9999);
			
			//메세지를 입력받아 송신(출력)하는 작업 : SenderThread (보내는  Thread)
			Thread st = new ChatSenderThread(socket);		//다형성
			st.start();
			
			//보내준 메세지를 받는 작업(수신) : ChatReceiverThread(받는 Thread)
			Thread rt = new ChatReceiverThread(socket);
			rt.start();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ChatClient Exception");
		}/*finally {
			try {
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}//try
		}//try*/
		
	}//main()
}//class
