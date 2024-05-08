import java.util.Scanner;

import dato.MemberDAO;
import dato.MemberMovement;
import dato.login;

public class MemberMain {
	public static void main(String[] args) {
		MemberMovement mm = new MemberMovement();
		MemberDAO dao = new MemberDAO();
		MemberMain m = new MemberMain();
		Scanner sc =  new Scanner(System.in);
		login lg = new login();
	
		while(true) {
			System.out.println("********************프로그램 실행**********************");
			lg.display();
			System.out.print("메뉴를 입력하세요:");
			int menu = Integer.parseInt(sc.nextLine());
			if(menu == 1) {
				System.out.println("로그인");
				//로그인
				//db인적조회 성공시 logdisplay()
				boolean log = m.login(sc);
				if(log) {
					System.out.println("로그인 성공");
					lg.display();
					mm.insertInput();
					
					
				}else {
					System.out.println("아이디나 비밀번호가 틀림.");
					break;
				}
				
				
			}else if (menu == 2) {
				System.out.println("회원가입");
				mm.insertInput();
	
				
			}else if (menu == 3) {
				System.out.print("정말 종료 하시겠습니까?(Y/N) : ");
				String exit = sc.nextLine();
				if(exit.equalsIgnoreCase("y")) {
					System.out.println("회원관리 프로그램을 종료합니다!");
					sc.close();
					System.exit(0);	//프로그램을 종료하고 메모리에서 관련 프로세스를 제거
					break;
				}else if(exit.equalsIgnoreCase("n")) {
					System.out.println("회원관리 프로그램을 계속 진행합니다.");
					continue;
				}else {
					System.out.println("잘못 입력하셨습니다!");
					continue;
				}//if
			}else {
				System.out.println("잘못입력하셨습니다");
				continue;
			}
		}
		
	}//main
	
	boolean login (Scanner sc) {
		MemberDAO dao = new MemberDAO();
		
		System.out.println("아이디를 입력하세요:");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요:");
		String pw = sc.nextLine();
		//int oo = dao.login(id, pw);
		boolean oo = dao.checkpw(id, pw);
		return oo;
		
		
		
		
	}
	
	
}//class
