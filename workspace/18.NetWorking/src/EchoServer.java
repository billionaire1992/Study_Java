import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//Server : 정보를 응답(Response, 제공) 
public class EchoServer {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket socket = null;
		try {									//정상적인 코드 
			//ServerSocket 생성 : Port 번호 할당
			ss = new ServerSocket(9999);
			System.out.println("서버가 구동중입니다.");
			
			//Socket 생성 : Client의 접속정보가 들어있는 Socket 
			//Socket socket = new Socket();		//Client 측에서 Socket 생성하는 방법
			socket = ss.accept();				//Server 측에서 Socket 생성하는 방법 
			
			//클라이언트에서 보낸 메시지를 수신(입력) 하기 위한 준비 : 입력 스트림 ▶ BufferedReader  
			InputStream is = socket.getInputStream();			//socket 으로부터 기본 입력스트림을 가져온다
			InputStreamReader isr = new InputStreamReader(is);	//유니코드를 입력하는 스트림 
			BufferedReader br = new BufferedReader(isr);		//속도 향상 
			
			//클라이언트의 접속정보를 가져오자
			InetAddress addr= socket.getInetAddress();
			String ip = addr.getHostAddress();  //IP주소
			String name = addr.getHostName();	//컴퓨터 이름 	
			
			
			//클라이언트가 보낸 메세지를 수신받아 화면에 출력 
			String msg = br.readLine();
			System.out.println("클라이언트의 IP주소는  : " + ip + ", 컴퓨터 이름 : " + name);
			System.out.println("클라이언트로 받은 메세지 : " + msg);
			
			//다시 클라이언트에게 받은 메세지를 송신(출력) : 출력 스트림 ▶ 
		 	OutputStream os =  socket.getOutputStream();
		 	PrintWriter out = new PrintWriter(os);
		 	out.println(msg);
		 	out.flush();
		 	
		 	
		 	
			
			//스트림 종료 
			br.close();
			
		} catch (Exception e) {					//예외 처리 코드 
			e.printStackTrace();				//예외 발생 시 원인을 추적하여 상세하게 출력 
			System.out.println("EchoServer Exception ~!");	//예외 메세지를 직접 작성 후 출력
		} finally {								//무조건 실행되는 코드 구현 
			try {
				socket.close();
				ss.close();				
			} catch (Exception e) {
				e.printStackTrace();
			}//try
		}//try 
	}//main()
}//class
