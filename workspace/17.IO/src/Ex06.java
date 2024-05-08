import java.io.InputStreamReader;

public class Ex06 {
	//키보드에서 여러 문자를 입력받아 출력하시오.
	//단, 입력한 글자중에 'q'라는 문자가 입력되면 종료하시오.
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);	//문자 단위 입력 스트림
		System.out.print("여러 문자를 입력하세요 : ");
		try {
			int data;
			while((data = isr.read()) != 'q') {
				System.out.println("입력하신 문자는 " + (char)data + "입니다.");
			}//while
			System.out.println("종료되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}//try
	}//main()
}//class
