package phone;

import java.util.Random;
import java.util.Scanner;

public class phoneDTO {
	private String color = "검정";
	private String model ="이니셜-1";
	private boolean status;
	private boolean call;
	private boolean power;
	//get & set
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public boolean isCall() {
		return call;
	}
	public void setCall(boolean call) {
		this.call = call;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	
	
	public void firstGenerationInformation() {
		String status= "";
		if(power==false) {
			status = "종료";
		}else {
			status = "실행중";
		}
		System.out.println("1세대 폰 (색상 :"+color+", 모델명: "+model+", 상태:"+status+")가 지급되었습니다.");
	}
	//기능 1 : 전원 켜기 & 끄기 return 이 없는 기능 단순하게 전원이 켜고 꺼짐
	public void PhoneOn() {
		System.out.println(model+" 전원이 켜졌습니다.");
		power= true;
	}
	public void PhoneOff() {
		System.out.println(model+" 전원이 꺼졌습니다.");
		power= false;
	}
	//기능 2 : 전화 받기 & 끄기
	public void PhoneCallOn() {
		if(power==true) {
			System.out.println("전화가 와서 전화를 받았습니다");
			call= true;
			VoiceTransRecep();
		}
		System.out.println("전원이 꺼져있어 전화 받기가 불가능합니다.");
	}
	public void PhoneCallOff() {
		if(power==true) {
			System.out.println("전화를 끊었습니다.");
		}
		System.out.println("전원이 꺼져있어 전화 끊기가 불가능합니다.");
	}
	//기능 3 : 음성 전송 s
	public void VoiceTransRecep() {
		Scanner sc = new Scanner(System.in);
		String voice ="";
		if(call==true) {	//전화중 이라면
		while(true) {
			System.out.print("음성전송(종료q):");
			voice = sc.nextLine();
			System.out.println(RandomSpeak());
			if(voice.equals("q")) {
				System.out.println("전화를 끊습니다.");
				break;
			}
		}//while
		}else {
			System.out.println("통화중 상태가 아닙니다. 음성 전송&수신이 불가 합니다.");
		}
	}
	//기능 3 - 음성전송 부가기능
	String RandomSpeak() {
		int i = 0;
		String arr[] = {"그래","알겠어","응","무슨일이야"};
		i = new Random().nextInt(arr.length-1);
		return arr[i];
	}
	
}
