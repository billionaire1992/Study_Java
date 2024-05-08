
import java.util.Scanner;

import phone.phoneDTO;

//2세대
public class generation2 extends phoneDTO{
	phoneDTO dto = new phoneDTO(); 
	private String Channel="정보없음";
	
	public String getChannel() {
		return Channel;
	}
	public void setChannel(String channel) {
		Channel = channel;
	}
	
	public void PhoneOn() {
		dto.setModel("이니셜-2");
		System.out.println(dto.getModel()+" 전원이 켜졌습니다.");
		dto.setPower(true);
	}
	public void PhoneOff() {
		System.out.println(dto.getModel()+" 전원이 꺼졌습니다.");
		dto.setPower(false);
	}	
	void TwoGenerationInformation() {
		dto.setModel("이니셜 -2");
		String status= "";
		if(dto.isPower()==false) {
			status = "종료";
		}else {
			status = "실행중";
		}
		System.out.println("2세대 폰 (색상 :"+dto.getColor()+", 모델명:"+dto.getModel()+" 상태:"+status+", 채널:정보없음)가 지급되었습니다.");
	}
//	-기능1: 상태정보가 전원이 켜져있는 상태에서만 DMB방송을 켜는 기능이며 상태정보가 DMB 시청중으로 변경 된다.
//    (전화중 x , 종료상태x)
//
//    -기능2: 채널변경&끄기 상태정보가 DMB시청중일때만 가능하며 채널데이터를 숫자로 입력받아 채널을 변경하고 기존 
//    채널과 변경 된 채널을 콘솔창에 출력한다.

	void DMBOn () {
		if(dto.isPower()==true) { //파워가 켜져있다면
			System.out.println("DMB방송을 켭니다 : 현재 채널 : "+Channel);
			String temp = Channel;
			DMBChannel();
			System.out.println("DMB 방송의 채널을 변경합니다:"+temp+"=>"+Channel+"번으로 변경 됨.");
		}else {
			System.out.println("전원이 꺼져있어 DMB방송을 켤 수가 없습니다.");
		}
	}
	void DMBOff () {
		System.out.println("DBM 방송을 끕니다.");
	}

	void DMBChannel() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("변경하실 채널을 입력해주세요:");
			try {       //while문때문에 nextline으로 받지 않으면 반복문이 계속 실행됨 
					//기본값이 "정보없음" 인 String타입의 채널변수를 숫자로 바꾸기위해서
					//int로 변환 후 String으로 변환 하였음.) 
				Channel = Integer.toString(Integer.parseInt(sc.nextLine())); 
				break;
			} catch (Exception e) {
				System.out.println("숫자로 채널을 변경해주세요!");
				continue;
			}
		}//while
		sc.close();
	}//DMBChannel
}


