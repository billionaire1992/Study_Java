package dato;

import java.util.Scanner;

public class MemberMovement {

	// 멤버 업데이트
	public void updateInput() {
		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
				// 아이디 입력 추후 로그인 아이디랑 확인
				System.out.println("아이디 입력해 : ");
				String id = scanner.nextLine();
				// 입력받은 번호 있는지 체크 checkNum
				MemberDAO dao = new MemberDAO();
				boolean result = dao.checkNum(id);

				String pw = null;
				String admin;

				if (result) { // 회원 존재
					MemberDTO dto = dao.getMember(id); // 수정할 회원정보를 id으로 검색 : 수정되지 않는 항목은 default(기본값으로)설정

					// 비번 수정시 재확인
					while (true) {
						System.out.println("비밀번호 입력");
						pw = scanner.nextLine();
						System.out.println(" 한번 더 입력 ");
						String pw1 = scanner.nextLine();
						if (pw.trim().equals(pw1)) {
							System.out.println("비번 바뀜");
							break;
						} else {
							System.out.println("일치 ㄴ 다시해");
							continue;
						}
					}

					System.out.println("수정할 회원의 이름를 입력하세요");
					String name = scanner.nextLine();
					if (name.trim().equals("")) {
						name = dto.getName();
					}

					System.out.println("수정할 회원의 이메일를 입력하세요");
					String email = scanner.nextLine();
					if (email.trim().equals("")) {
						email = dto.getEmail();
					}

					int money = dto.getMoney();
					// = dto.getPw();
					admin = "n";
					dto = new MemberDTO(); // 수정할 회원정보
					int succ = dao.updateMember(dto);
					if (succ > 0) {
						System.out.println("성공");
					} else {
						System.out.println("실패");
					} // if
				} else { // 회원번호 미존재
					System.out.println(id + "번 회원정보가 존재하지 않습니다");
					continue;
				} // if
				break;
			} catch (Exception e) {
				// e.printStackTrace();
				System.out.println("번호를 잘못 입력하셨습니다");
				continue;
			} // try
		} // while

	}

	// 회원정보를 등록하는 서브화면
	public void insertInput() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String id;
			while (true) {
				try {
					System.out.print("\n등록할 아이디를 입력하세요 ");
					id = (scanner.nextLine());
					break;
				} catch (Exception e) {
					System.out.println("아이디를 잘못 입력하셨습니다.");
					continue;
				} // try
			} // while

			MemberDAO dao = new MemberDAO();
			boolean result = dao.checkNum(id);

			if (result) {
				System.out.println(id + "아이디가 존재합니다.");
				System.out.println("다른 아이디를 입력하시길 바랍니다.");
				continue;
			} else {
				System.out.print("비밀번호를 입력하세요 : ");
				String pw = scanner.nextLine();

				String name;
				while (true) {
					try {
						System.out.print("이름을 입력하세요 : ");
						name = (scanner.nextLine());
						break;
					} catch (Exception e) {
						System.out.println("이름을 잘못 입력하셨습니다");
						continue;
					}
				} // while
				System.out.print("이메일을 입력하세요");
				String email = (scanner.nextLine());
				System.out.print("돈을 입력하세요");
				int money = Integer.parseInt(scanner.nextLine());

				System.out.println(id + "님의 정보가 입력완료 되었습니다.");

				MemberDTO dto = new MemberDTO();

				int succ = dao.insertMember(dto);

				if (succ > 0) {
					System.out.println(id + "번 회원님의 정보가 등록 되었습니다.");
				} else {
					System.out.println(id + "번 회원님의 정보가 등록 실패되었습니다.");
				} // if
				break;
			}
		} // while
	} // insertInput()

}
