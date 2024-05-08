import java.util.HashMap;

public class SecondPhone extends FirstPhone{
	//2세대 폰 (1세대 폰의 상태정보 +  channel 정보 ) 
	int channel;

	public SecondPhone(String color, String model, HashMap<String, Boolean> states, int channel) {
		super(color, model, states);	//부모 클래스의 기능을 사용하려면 부모클래스를 생성할 수 있어야함 
		this.channel = channel;
		this.states.put("dmb", false); //DMB 가 꺼진 상태로 생성이 됨 2세대 폰 
	}

	//DMB 켜고싶음 :  티비
	//핸드폰 켜져 있어야함 , 통화중 상태가  x DMB 가 이미꺼져있음 
	public void dmbOn() {
		if(states.get("power") && !states.get("call") && !states.get("dmb")) {
			System.out.println("dmb 를 켰음");
			System.out.println("현재 채널 " + channel);
			states.put("dmb", true);
		}else {
			System.out.println("dmb 사용불가");
		}
	}
	public void dmbOff() {
		if(states.get("power") && !states.get("call") && states.get("dmb")) {
			System.out.println("dmb 종료");
			states.put("dmb", false);
		}else {
			System.out.println("dmb 사용중이 아님");
		}
	}
	
	public void changeChannel(int channel) {
		if(states.get("dmb")) {
			System.out.println("현재 채널" + this.channel);
			System.out.println("변경된 채널 " + channel);
			this.channel = channel;
		}else {
			System.out.println("DMB가 실행중이 아님");
		}
	}
	
}




