import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcClient {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			//Socket 생성 : 서버 IP 주소 + Port 번호 
			socket = new Socket("192.168.0.137", 9999);
			
			//num1, num2, opcode 입력받는다 : Scanner
			Scanner scanner = new Scanner(System.in);
			System.out.print("첫 번째 정수를 입력하세요 : ");
			int num1 = Integer.parseInt(scanner.nextLine());
			System.out.print("두 번째 정수를 입력하세요 : ");
			int num2 = Integer.parseInt(scanner.nextLine());
			System.out.print("연산자를 입력하세요 : ");
			String opcode = scanner.nextLine();
			
			//CalcDTO 객체를 생성하고, 서버로 송신(출력) : 출력 스트림  ▶ ObjectOutputStream
			//OutputStream → OutputStreamWriter → BufferedWriter 
							//PrintWriter ▶ ObjectOutputStream : 객체 출력 ( 객체의 직렬화 ) 
			
			CalcDTO dto = new CalcDTO(num1, num2, opcode);
			OutputStream os = socket.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject(dto);
			
			//서버에서 전달된 연산의 결과값을 수신(입력) : 입력스트림 ▶ BufferedReader 
			//InputStream → InputStreamReader → BufferedReader 
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			double result = Double.parseDouble(br.readLine()); 
			
		    //결과를 화면에 출력
			System.out.println("첫 번째 정수 : " + num1);
			System.out.println("두 번째 정수 : " + num2);
			System.out.println("연산자 : " + opcode);
			if(opcode.equals("/")) {
				DecimalFormat df = new DecimalFormat("0.00");
				System.out.println("결과 : " + df.format(result));
			}else {
				System.out.println("결과 : " + (int)result);
			}//if
			
			//스트림 종료
			br.close();
			oos.close();
			scanner.close();
		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Calc Client Exception");
		}finally {
			try {
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}//try
		}//try
	}//main()
}//class
