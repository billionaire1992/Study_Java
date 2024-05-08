import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;

public class MultiChatPersonThread extends Thread {
	//접속된 다수의 클라이언트를 제어하기 위한 쓰레드 
	//모든 클라이언트의 접속정보를 저장하고
	//접속된 클라이언트에게 메세지를 전송(출력 : PrintWriter) 
	//클라이언트의 목록을 저장할 컬렉션 배열을 만들자 : ArrayList<>
	//MultiChatServer Class의 main() 메소드와 같이 동작 : static
	static ArrayList<PrintWriter> list = new ArrayList<PrintWriter>();
	private PrintWriter out;
	//생성자 메소드 구현 
	private Socket socket;
	public MultiChatPersonThread(Socket socket) {
		this.socket = socket;
		try {
			OutputStream os = socket.getOutputStream();
			out = new PrintWriter(os);
			list.add(out);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	@Override
	public void run() {
		String name = null;
		String comName = null;
		try {
			//입력스트림 생성 
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			//클라이언트에서 처음에 보내준 메세지 (대화명)를 받아서 
			//접속된 다른 클라이언트 화면에 출력 : sendAll() 메소드 
			name = br.readLine();			//대화명 입력
			InetAddress addr = socket.getInetAddress(); 				//클라이언트의 접속정보 
			comName = addr.getHostName();						//컴퓨터 이름 (302-00)
			sendAll("#"+ name +"("+ comName +")님이 입장하셨습니다");
			
			//클라이언트에서 입력한 메세지 (대화내용)를 받아서 
			//접속된 다른 클라이언트 화면에 출력  : sendAll()메소드 
			while(true) {
				String msg = br.readLine();
				if(msg.equals("bye")) {
					break;
				}//if
				sendAll(name + "("+ comName + ") :" + msg);
			}//while
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("MultiChatPersonThread Exception");
		}finally {
			try {
				//접속된 클라이언트의 목록이 저장된 컬렉션 배열에서 해당 클라이언트의 정보를 삭제
				list.remove(out);
				sendAll("#"+ name +"("+ comName +")님이 퇴장하셨습니다");
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}//try
		}//try
	}//run()
	
	//접속된 클라이언트 화면에 메세지 출력 
	public void sendAll(String msg) {
		for (PrintWriter out : list) {
			out.println(msg);
			out.flush();
		}//for
	}//sendAll
}//class