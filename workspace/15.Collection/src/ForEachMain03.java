import java.util.ArrayList;

import com.hanul.member.MemberDTO;

public class ForEachMain03 {
	public static void main(String[] args) {
		ArrayList<MemberDTO> member = new ArrayList<MemberDTO>();
	    member.add(new MemberDTO("홍길동", 27, "광주시 서구 농성동", "010-1111-1111"));
	    member.add(new MemberDTO("김길동", 29, "광주시 남구 봉선동", "010-2222-2222"));
		
		//member<> 값을 출력 : 교환 전 
	    for(MemberDTO dto : member) {			
			System.out.print(dto.getName()+"\t");
			System.out.print(dto.getAge()+"\t");
			System.out.print(dto.getAddr()+"\t");
			System.out.print(dto.getTel()+"\n");
		}//for
	    System.out.println("=====================================================");		
		//swap : 교환 → 임시변수(temp), 수정 (set())
	    MemberDTO temp = member.get(0);
		member.set(0, member.get(1));
		member.set(1, temp);
		
		//member<> 값을 출력 : 교환 후
		for(MemberDTO dto : member) {			
			System.out.print(dto.getName()+"\t");
			System.out.print(dto.getAge()+"\t");
			System.out.print(dto.getAddr()+"\t");
			System.out.print(dto.getTel()+"\n");
		}//for
	}//main()
}//class
