import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

//보내는 Thread : 메세지를 송신(출력스트림) 
public class ChatSenderThread extends Thread {	//Thread Class 상속 
	
	//생성자 메소드 구현 
	private Socket socket;
	public ChatSenderThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			//출력스트림 : PrintWriter
			OutputStream os = socket.getOutputStream();
			PrintWriter out = new PrintWriter(os);
			
			//메세지를 입력받아 송신(출력)
			Scanner scanner = new Scanner(System.in);
			while(true) {
				//System.out.print("메세지를 입력하세요 : ");
				String msg = scanner.nextLine();
				out.println(msg);
				out.flush();
				if(msg.equals("bye")) {
					System.out.println("종료 되었습니다.");
					break;
				}//if
			}//while
			
			//스트림 종료
			scanner.close();
			out.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ChatSenderThread Exception");
		}finally {
			try {
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}//try
		}//try
	}//run()
}//class
