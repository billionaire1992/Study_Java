package function;

import java.util.Scanner;

public class GenerationDAO {
	Scanner scanner = new Scanner(System.in);
	public boolean Power_check(boolean power){
		Display dp = new Display();
				
		while(true) {
			dp.display_start();
			int power_check = Integer.parseInt(scanner.nextLine());
			if (power_check == 1) {
				power = true;
				System.out.println("상태 : 전원 켜짐");
				break;
			} else{
				power = false;
				System.out.println("상태 : 전원 꺼짐");
				continue;
			}//if_else
		}//while
		
		return power;
	}// power check()
	
	public boolean call_on(boolean call) {
			while(true) {
				if (call==true) {
					System.out.println("이미 통화중입니다.");
					return call;
				} else {
					 System.out.println("상태  : 통화중");
					 call = true;
					 return call;
				}//if_else
			}
	}//call()
	
	public boolean call_off(boolean call) {
		if(call==false) {
			System.out.println("통화중이 아닙니다");
		} else {
			System.out.println("통화종료");
		}
		 call = false;
		return call;
	}//call_off
	
	public void send_voice(boolean call){
		while(true) {
			if (call) {
				System.out.print("전송할 내용을 입력하세요 : ");
				String mes = scanner.nextLine();
				System.out.println("\"" + mes + "\" 전송 완료");
			} else {
				System.out.println("이 기능은 통화중에만 가능합니다");
			}
			break;
		}
	}// send_voice()
	
	
	public void receive_voice(boolean call) {
		if(call) {
			System.out.print("받을 문자열 : ");
			String mes = scanner.nextLine();
			System.out.println("받은 문자 : " + mes);
		}else {
			System.out.println("이 기능은 통화중에만 가능합니다");
		}//if_else
	}//receive_voice()

	//인터넷 사용 
	public boolean Internet_on(boolean internet){
		while(true) {
			if (internet == true) {
				System.out.println("인터넷을 이미 사용중 입니다.");
				return internet;
			} else{
				System.out.println("상태 : 인터넷 켜짐");
				internet = true;
				return internet;
			}//if
		}//while		
	
	}// Internet on()
	
	//인터넷 사용중지 
	public boolean Internet_off(boolean internet){
			if (internet == false) {
				System.out.println("인터넷 사용중이 아닙니다.");
				
			} else{
				System.out.println("상태 : 인터넷 사용종료");
			}//if
			internet = false;
			return internet;
			
	}// Internet_off()
	
	//인터넷 여부 확인 메소드
	/*
	 * public boolean internetCheck(boolean internetCheck) {
	 * if(Internet_on(internetCheck)) { internetCheck = true; return internetCheck;
	 * }else if(Internet_off(false)) { internetCheck = false; return internetCheck;
	 * } return internetCheck; }
	 */
	
	//웹툰 앱 켜기  
	public boolean webtoon_on(boolean webtoon){
		while(true) {
			if (webtoon == true) {
				System.out.println("웹툰 앱을 이미 사용중 입니다.");
				return webtoon;
			} else{
				
					System.out.println("웹툰 앱을 실행합니다.");
					webtoon = true;
					return webtoon;						
				
			}//if
		}//while		
	}//webtoon_on()
	
	//웹툰 앱 끄기
	public boolean webtoon_off(boolean webtoon){
		if (webtoon == false) {
			System.out.println("웹툰 앱 사용중이 아닙니다.");
		} else{
			System.out.println("상태 : 웹툰 앱 사용종료");
		}//if
		webtoon = false;
		return webtoon;
	}//webtoon_off()
}//class
