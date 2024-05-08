
public class MemberService {

	public boolean login(String userId, String userPw) {
		
		if(userId.equals("hong") && userPw.equals("12345")) {
			return true;
		}else {
			return false;
		}
	}

	public void logout(String userId) {
		System.out.println(userId + "님이 로그아웃 하셨습니다");
		
	}

}
