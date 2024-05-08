import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MultiChatSenderThread extends Thread{
	//생성자 메소드 구현 
	private Socket socket;
	private String name;
	private Scanner scanner;
	
	public MultiChatSenderThread(Socket socket, String name, Scanner scanner) {
		this.socket = socket;
		this.name = name;
		this.scanner = scanner;
	}

	@Override
	public void run() {
		try {
			//출력스트림 생성하고, 대화명을 송신(출력)
			OutputStream os = socket.getOutputStream();
			PrintWriter out = new PrintWriter(os);
			out.println(name);
			out.flush();
			
			//메세지를 입력받아 송신(출력)
			while(true) {
				String msg = scanner.nextLine();
				out.println(msg);
				out.flush();
				if(msg.equals("bye")) {
					break;
				}//if
			}//while			
			
			//스트림 종료
			out.close();
			scanner.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("MultiChatSenderThread Exception");
		}finally {
			try {
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}//try
		}//try 
	}//run()
}//class
