import java.util.ArrayList;

import com.hanul.member.MemberDAO;
import com.hanul.member.MemberDTO;

public class MemberMain {
	public static void main(String[] args) {
		// 회원 정보(이름, 나이, 주소, 전화번호 ▶ memberDTO.java 를
		//ArrayList<> 컬렉션 배열(member<>)에 저장하시오,
		
		ArrayList<MemberDTO> member = new ArrayList<MemberDTO>();
		member.add(new MemberDTO("홍길동", 27, "광주시 서구 농성동", "010-1111-1111"));
		member.add(new MemberDTO("김길동", 29, "광주시 남구 봉선동", "010-2222-2222"));
		member.add(new MemberDTO("나길동", 25, "광주시 북구 용봉동", "010-3333-3333"));
		
		//회원 정보 출력 :display() ▶ MemberDAO.java : com.hanul.member package
		MemberDAO dao = new MemberDAO();
		dao.display(member);
		
		//나이의 오름차순으로 정렬 후 출력 : ageAscSort()
		dao.ageAscSort(member);
		dao.display(member);
		
		//이름의 내림차순으로 정렬 후 출력 : nameDescSort() 
		dao.nameDescSort(member);
		dao.display(member);
		
	}//main()
}//class
