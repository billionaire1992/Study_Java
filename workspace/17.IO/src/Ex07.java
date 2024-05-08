import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex07 {
	//키보드에서 여러 글자를 입력받아 출력 : InputStream → InputStreamReader ▶ 버퍼(Buffer)를 활용
	public static void main(String[] args) {
		InputStream is = System.in;							//바이트 단위 입력 스트림
		InputStreamReader isr = new InputStreamReader(is);	//문자 단위 입력 스트림
		BufferedReader br = new BufferedReader(isr);		//버퍼를 활용한 입력 스트림
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//연쇄
		
		System.out.print("여러 글자를 입력하세요 : ");
		try {
			String msg = br.readLine();	//readLine() : Enter(CR/LF) 앞까지의 모든 문자를 한번에 입력
			System.out.println("입력하신 글자는 " + msg + "입니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}//try
	}//main()
}//class

/*
○ 버퍼(Buffer)의 필요성
	- 일반적인 입출력은 여러 글자를 입력한다 하더라도
		실제 처리될 때에는 한 글자씩 입출력된다.
	- 입력한 글자의 개수만큼 접근이 이루어진다 ▶ 속도 저하의 원인
	- 위와 같은 비효율성을 개선하고자 여러 글자를 입력하더라도
		버퍼(Buffer)를 이용하여 입력한 글자를 한번에 입출력할 수 있도록 지원해준다.
	- 버퍼의 기본크기 : 1024Byte
	- 버퍼의 기능을 지원하는 입력 스트림 : BufferedReader Class → readLine() 메소드
*/