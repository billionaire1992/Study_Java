import java.net.Socket;
import java.util.Scanner;

public class MultiChatClient {
	public static void main(String[] args) {
		Socket socket = null;
		String name = null;
		try {
			socket = new Socket("192.168.0.52",9999);
			//클라이언트 프로그램 실행 시 대화명을 입력받는다.
			Scanner scanner = new Scanner(System.in);
			while(true) {
				System.out.print("대화명을 입력하세요 : ");
				name = scanner.nextLine();
				if(name == null || name.trim().length() == 0) {		//대화명을 미입력, 대화명에 공백문자만 입력
					System.out.println("대화명을 입력하시길 바랍니다.");
					continue;
				}//if
				break;
			}//while
			
			//메세지를 입력받아 서버로 보내는 작업 (송신,출력) : PrintWriter ▶ MultiChatSenderThread
			Thread st = new MultiChatSenderThread(socket, name, scanner);
			st.start();
			//메세지를 수신받아 화며에 출력하는 작업(입력) : BufferedReader ▶ MultiChatReciverThread 
			Thread rt = new MultiChatReciverThread(socket);
			rt.start();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("MultiChatClient Exception");
		}/* finally {
			try {
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}//try
		}//try */
	}//main()
}//class