import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.hanul.member.MemberDTO;

public class Ex16 {
	//객체(상태정보, DTO)를 byte 형으로 변환하여 입출력하는 스트림
	//ObjectInputStream, ObjectOutputStream
	//객체구현(DTO Class 설계) : 객체의 직렬화 ▶ implements Serializable
	//객체의 직렬화 : 객체가 가지고 있는 모든 멤버변수들이 바이트형으로 변환되는 것
	//객체의 역직렬화 : 직렬화된 객체가 다시 원래의 상태로 복원되는 것
	public static void main(String[] args) {
		try {
			//MemberDTO dto = new MemberDTO(777, "한울", 29, "광주시 서구 경열로 3", "062-362-7797");
			MemberDTO dto = new MemberDTO();
			dto.setNum(777);
			dto.setName("한울");
			dto.setAge(29);
			dto.setAddr("광주시 서구 경열로 3");
			dto.setTel("062-362-7797");
			
			//위의 회원 1명의 정보를 파일에 저장하시오 : member.ser
			FileOutputStream fos = new FileOutputStream("member.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(dto);
			oos.close();
			fos.close();
			System.out.println("member.ser 파일이 생성되었습니다.");
			
			//member.ser 파일의 내용을 읽어서 화면에 출력하시오.
			FileInputStream fis = new FileInputStream("member.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			MemberDTO readDto = (MemberDTO) ois.readObject();	//객체의 역직렬화
			ois.close();
			fis.close();
			
			System.out.println(readDto.getNum());
			System.out.println(readDto.getName());
			System.out.println(readDto.getAge());
			System.out.println(readDto.getAddr());
			System.out.println(readDto.getTel());
		} catch (Exception e) {
			e.printStackTrace();
		}//try
	}//main()
}//class
