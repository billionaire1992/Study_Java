package dato;

import java.util.Scanner;

import dato.MemberDAO;
import dato.MemberDTO;

public class MemberInput {
	private Scanner scanner;

	public MemberInput(Scanner scanner) {
		this.scanner = scanner;
	}

	// 회원정보를 수정하는 서브화면
	public void updateInput() {
		while (true) {
			try {
				System.out.print("수정할 회원의 아이디를 입력하세요 : ");
				String id = scanner.nextLine();
				MemberDAO dao = new MemberDAO();
				boolean result = dao.checkNum(id);

				if (result) {
					MemberDTO dto = dao.getMember(id);
					if (id.trim().equals("")) { // 수정하고자 하는 값을 입력하지 않고 Pass 했을 경우
						id = dto.getId(); // 기본값으로 설정
					}

					String pw;
					try {
						System.out.print("수정할 회원의 비밀번호를 입력하세요 : ");
						pw = (scanner.nextLine());

					} catch (Exception e) {
						pw = dto.getPw();
					}
					System.out.print("이름을 입력하세요 : ");
					String name = scanner.nextLine();

					System.out.print("이메일를 입력하세요 : ");
					String email = scanner.nextLine();
					System.out.print("돈을 입력하세요 : ");
					int money = Integer.parseInt(scanner.nextLine());

					dto = new MemberDTO(id, pw, name, email, money); // 수정할 회원정보
					int succ = dao.updateMember(dto);
					if (succ > 0) {
						System.out.println(id + " 회원님의 정보가 수정되었습니다.");
					} else {
						System.out.println(id + " 회원님의 정보가 수정실패하였습니다.");

					}
				} else { // 회원번호가 미존재
					System.out.println(id + " 회원정보가 존재하지 않습니다 .");
					continue;
				} // if
				break;
			} catch (Exception e) {
				// e.printStackTrace();
				System.out.println("번호를 잘못 입력하셨습니다.");
			} // try
		}
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
				System.out.print("이메일을 입력하세요  :");
				String email = (scanner.nextLine());
				System.out.print("돈을 입력하세요 : ");
				int money = Integer.parseInt(scanner.nextLine());

				System.out.println(id + "님의 정보가 입력완료 되었습니다.");

				MemberDTO dto = new MemberDTO(id, pw, name, email, money);

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
