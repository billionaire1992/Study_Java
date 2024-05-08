import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableMain {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();		//HashTable 객체 생성 : 다형성
		//Hashtable<String, String> map = new Hashtable<String, String>();
		
		map.put("홍길동", "1234");				//map에 값을 저장  : put()
		map.put("김길동", "12345");	
		map.put("나길동", "123456");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = scanner.nextLine();
		System.out.print("비밀번호를 입력하세요 : ");
		String pw = scanner.nextLine();
		scanner.close();
	
		if(map.containsKey(name)) {				//Key(이름)의 존재 여부	: constainsKey()
			if(map.get(name).equals(pw)) {		//Value(비밀번호)의 일치여부 : 
				System.out.println("본인인증이 완료 되었습니다.");
			}else {
				System.out.println("비밀번호가 일치하지않습니다.");
			}//if	
		}else {
			System.out.println("해당 회원 정보가 존재하지 않습니다.");
		}//if	
	}//main()
}//class
