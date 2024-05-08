package com.hanul.member;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberInput {//회원관리 프로그램의 서브화면 
	//생성자 메소드 구현 
	private Scanner scanner;
	public MemberInput(Scanner scanner) {
		this.scanner = scanner;
	}
	//회원정보를 등록하는 서브화면 
	public void insertInput() {
		while(true) {
		int num;
		while(true) {
			try {					//숫자를 입력할 경우 정상적으로 진행 
				System.out.print("\n등록할 회원번호를 입력하세요 ");
				num = Integer.parseInt(scanner.nextLine());
				break;
			} catch (Exception e) {	//문자를 입력할 경우 예외 메세지를 출력하고 재입력
				System.out.println("회원번호를 잘못 입력하셨습니다.");
				continue;
			}//try
		}//while
			MemberDAO dao = new MemberDAO();
			boolean result = dao.checkNum(num);			//회원번호의 존재 유무 판단
			
			if(result) {	//회원 번호가 존재한다 → 중복된 회원번호 
				System.out.println(num + "번 회원번호가 존재합니다.");
				System.out.println("다른 회원번호를 입력하시길 바랍니다.");
				continue;
			} else {		//회원 번호가 존재하지않는다 → 회원정보를 입력받는다.
				System.out.print("이름을 입력하세요 : ");
				String name = scanner.nextLine();
				
				int age;
				while(true) {
					try {
						System.out.print("나이를 입력하세요 : ");
						age = Integer.parseInt(scanner.nextLine());
						break;
					} catch (Exception e) {
						System.out.println("나이를 잘못 입력하셨습니다");
						continue;
					}
				}//while  
				
				System.out.print("주소를 입력하세요 : ");
				String addr = scanner.nextLine();
				
				System.out.print("전화번호를 입력하세요 : ");
				String tel = scanner.nextLine();
				
				System.out.println(num + "번 회원님의 정보가 입력완료 되었습니다.");
				
				MemberDTO dto = new MemberDTO(num, name, age, addr, tel); 				//입력 받은 값을 DTO객체로 묶는다
				int succ = dao.insertMember(dto);
				
				if(succ > 0) {
					System.out.println(num +"번 회원님의 정보가 등록 되었습니다.");
				}else {
					System.out.println(num+"번 회원님의 정보가 등록 실패되었습니다.");
				}//if
				break;
			}
		}//while
	}	//insertInput()
	
	//회원정보를 삭제하는 서브화면
	public void deleteInput() {
		while(true) {
			try {
				System.out.print("삭제할 회원번호를 입력하세요 : ");
				int num = Integer.parseInt(scanner.nextLine());
				MemberDAO dao = new MemberDAO();
				boolean result = dao.checkNum(num);		//회원번호의 존재여부 
				
				if(result) {	//회원번호가 존재 : 삭제명령 
					System.out.print("정말 삭제하시겠습니까 ? (Y/N) : ");
					String delete = scanner.nextLine();
					if(delete.equalsIgnoreCase("y")) {
						int succ = dao.deleteMember(num);
						if(succ > 0) {
							System.out.println(num + "번 회원님의 정보가 삭제 되었습니다.");
						}else {
							System.out.println(num + "번 회원님의 정보가 삭제실패 되었습니다.");
						}
					} else if(delete.equalsIgnoreCase("n")) {
						System.out.println("취소 되었습니다.");
					} else {
						System.out.println("잘못 입력하셨습니다.");
					}	
				}else {			//회원번호가 미존재 : 오류메세지 출력 
					System.out.println(num + "번 회원님의 정보가 존재하지않습니다. ");
					continue;
				}
				break;
			} catch (Exception e) {
				//e.printStackTrace(); 	//예외를 상세하게 출력하고 종료 
				System.out.println("번호를 잘못 입력하셨습니다. ");
				continue;
			}//try
		}//while
		
		
	}//deleteInput()
	
	//회원정보를 수정하는 서브화면 
	public void updateInput() {
		while(true) {
			try {
				System.out.print("수정할 회원번호를 입력하세요 : ");
				int num = Integer.parseInt(scanner.nextLine());
				MemberDAO dao = new MemberDAO();
				boolean result = dao.checkNum(num);
				
				if(result) {	//회원번호가 존재 
				MemberDTO dto = dao.getMember(num);		//수정할 회원정보를 검색 : 수정되지 않는 항목은 기본값으로 설정  
				System.out.print("수정할 회원의 이름을 입력하세요 : ");
				String name = scanner.nextLine();
				if(name.trim().equals("")) {	//수정하고자 하는 값을 입력하지 않고 Pass 했을 경우 
					name = dto.getName();		//기본값으로 설정 
				}
				
				int age;
				try {
					System.out.print("수정할 회원의 나이를 입력하세요 : ");
					age = Integer.parseInt(scanner.nextLine());
					
				} catch (Exception e) {
					age = dto.getAge();
				}
				
				System.out.print("수정할 회원의 주소를 입력하세요 : ");
				String addr = scanner.nextLine();
				if(addr.trim().equals("")) {
					addr = dto.getAddr();
				}
				System.out.print("수정할 회원의 전화번호를 입력하세요 : ");
				String tel = scanner.nextLine();
				if(tel.trim().equals("")) {
					tel = dto.getTel();
				}
				
				dto = new MemberDTO(num, name, age, addr, tel);	//수정할 회원정보 
				int succ = dao.updateMember(dto);
					if(succ > 0 ) {
						System.out.println(num +"번 회원님의 정보가 수정되었습니다.");
					}else {
						System.out.println(num + "번 회원님의 정보가 수정실패하였습니다.");
						
					}
				} else {		//회원번호가 미존재 
					System.out.println(num + "번 회원정보가 존재하지 않습니다 .");
					continue;
				}//if
				break;
			} catch (Exception e) {
				//e.printStackTrace();
				System.out.println("번호를 잘못 입력하셨습니다.");
			}//try
		}
		
		
		
		
	}//updateInput()
	
	//전체 회원목록을 검색하는 서브화면 호출 
	public void getAllListMember() {
		while(true) {
			System.out.print("전체 회원 목록을 검색하시겠습니까? (Y/N) : ");
			String menu = scanner.nextLine();
			if(menu.equalsIgnoreCase("y")) {
				//회원 목록을 검색하는 메소드 호출 
				//System.out.println("회원목록 검색 ");
				MemberDAO dao = new MemberDAO();
				ArrayList<MemberDTO> list = dao.searchAllMember();
				dao.display(list);
				
				
				break;
			}else if(menu.equalsIgnoreCase("n")) {
				System.out.println("회원목록 검색을 취소하셨습니다.");
				break;
			}else {
				System.out.println("메뉴를 잘못 입력하셨습니다. ");
				continue;
			}//if
		}//while  
		
	}//getAllListMember()
	
	//이름을 검색하는 서브화면 호출
	public void nameInput() {
		System.out.print("검색할 이름을 입력하세요  : ");
		String searchName = scanner.nextLine();
		MemberDAO dao = new MemberDAO();
		dao.searchNameMember(searchName);
		ArrayList<MemberDTO> list = dao.searchNameMember(searchName);
		dao.display(list);
		
	}//nameInput()
	
	//주소를 검색하는 서브화면 호출 
	public void addrInput() {
		System.out.print("검색할 주소를 입력하세요 : ");
		String searchAddr = scanner.nextLine();
		MemberDAO dao = new MemberDAO();
		dao.serchAddrMember(searchAddr);
		ArrayList<MemberDTO> list = dao.serchAddrMember(searchAddr);
		dao.display(list);
	}//addrInput()
	
	//전화번호를 검색하는 서브화면 호출 
	public void telInput() {
		System.out.print("검색할 전화번호를 입력하세요 : ");
		String searchTel = scanner.nextLine();
		MemberDAO dao = new MemberDAO();
		dao.searchTelMember(searchTel);
		ArrayList<MemberDTO> list = dao.searchTelMember(searchTel);
		dao.display(list);
	}//telInput()

	
	
	
	
	
	
	
}//class
