import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex14 {
	//기본 데이터 타입(PDT), 문자열(String)을 byte 형으로 변환하여 입출력
	//DataInputStream, DataOutputStream ▶ 암호화 한 것처럼 표현하는 스트림
	//사용자가 입력한 내용을 파일로 저장 : 변수 초기화 → 파일 출력(FileOutputStream) → byte 변환(DataOutputStream)
	//파일에 저장된 내용을 읽어서 화면에 출력 : FileInputStream → DataInputStream → 변수에 할당 후 화면 출력
	public static void main(String[] args) {
		try {
			int num1 = 12345;
			double num2 = 3.14;
			String str1 = "hanul";
			String str2 = "홍길동";
			
			FileOutputStream fos = new FileOutputStream("data.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeInt(num1);		//int → byte
			dos.writeDouble(num2);	//double → byte
			dos.writeUTF(str1);		//String → byte
			dos.writeUTF(str2);
			dos.close();
			fos.close();
			System.out.println("data.txt 파일이 생성되었습니다.");
			
			FileInputStream fis = new FileInputStream("data.txt");
			DataInputStream dis = new DataInputStream(fis);
			int num3 = dis.readInt();		//byte → int
			double num4 = dis.readDouble();	//byte → double
			String str3 = dis.readUTF();	//byte → String
			String str4 = dis.readUTF();
			dis.close();
			fis.close();
			
			System.out.println(num3);
			System.out.println(num4);
			System.out.println(str3);
			System.out.println(str4);
		} catch (Exception e) {
			e.printStackTrace();
		}//try
	}//main()
}//class
