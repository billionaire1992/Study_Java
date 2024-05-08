import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

//Client : 정보 요청(Request , 질의) 
public class EchoClient {
	public static void main(String[] args) {
		Socket socket = null;
		//서버에 접속을 시도하여 접속에 성공하면 Socket 생성 
		//Client Socket : 서버의  IP주소와 서버에서 할당한 Port 번호 
		//192.168.0.137
		try {							//일반적인(정상적인) 코드 
			socket = new Socket("192.168.0.137",9999);
			//서버로 전송할 메세지를 입력받자 : Scanner
			
			Scanner scanner =  new Scanner(System.in);
			System.out.print("서버로 보낼 메세지를 입력하세요 : ");
			String msg = scanner.nextLine();
			
			//입력받은 메세지를 서버로 송신(출력) 하기 위한 준비 : 출력 스트림 ▶ PrintWriter  
			OutputStream os = socket.getOutputStream();				//socket 으로 부터 기본 출력스트림을 가져온다 
			//OutputStreamWriter osw = new OutputStreamWriter(os);	//문자 단위 (유니코드) 를 출력하는 스트림
			//BufferedWriter bw = new BufferedWriter(osw);			//속도향상을 위해 
			PrintWriter out = new PrintWriter(os);					//PrintWriter : OutputStreamWriter + BufferedWriter
			
			//메세지를 서버로 송신 (출력) 
			out.println(msg);
			out.flush();
			
			//서버에서 보낸 메세지를 수신(입력)받아 화면에 출력 : 입력 스트림 
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String echoMsg = br.readLine();
			System.out.println("서버로부터 받은 메세지 : " + echoMsg);
			
			
			//스트림 종료
			br.close();
			out.close();
			scanner.close();
			
			
		} catch (Exception e) {			//예외 처리 코드 구현
			e.printStackTrace();		//원인을 추적하여 상세하게 출력 
			System.out.println("EchoClient Exception");
		} finally {						//무조건 실행되는 코드 구현 
			try {
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}//try
		}//try
	}//main()
}//class