import java.util.ArrayList;

import com.hanul.member.MemberDTO;

public class ForEachMain02 {
	public static void main(String[] args) {
		//회원정보(이름, 나이, 주소, 전화번호) ▶ MemberDTO.java 
		//ArrayList<> 컬렉션 배열(member<>)에 저장하시오.
		ArrayList<MemberDTO> member = new ArrayList<MemberDTO>();
	    member.add(new MemberDTO("홍길동", 27, "광주시 서구 농성동", "010-1111-1111"));
	    member.add(new MemberDTO("김길동", 29, "광주시 남구 봉선동", "010-2222-2222"));
	    member.add(new MemberDTO("나길동", 25, "광주시 북구 용봉동", "010-3333-3333"));
		
	    //member<>의 내용을 출력하시오 : 단순 for문
	    
	    for (int i = 0; i < member.size(); i++) {
			System.out.print(member.get(i).getName() +"\t");
			System.out.print(member.get(i).getAge() +"\t");
			System.out.print(member.get(i).getAddr() +"\t");
			System.out.print(member.get(i).getTel() +"\n");
		}//for
		System.out.println("=====================================================");
	
		//member<>의 내용을 출력하시오 : 단순 for문
		for (int i = 0; i < member.size(); i++) {
			MemberDTO dto = member.get(i);
			System.out.print(dto.getName()+"\t");
			System.out.print(dto.getAge()+"\t");
			System.out.print(dto.getAddr()+"\t");
			System.out.print(dto.getTel()+"\n");
		}//for
		System.out.println("=====================================================");
		
		//member<>의 내용을 출력하시오 : 향상 된 for문
		for(MemberDTO dto : member) {			
			System.out.print(dto.getName()+"\t");
			System.out.print(dto.getAge()+"\t");
			System.out.print(dto.getAddr()+"\t");
			System.out.print(dto.getTel()+"\n");
		}//for
	}//main()
}//class
