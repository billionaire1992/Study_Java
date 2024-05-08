import java.util.HashMap;

public class ThirdPhone extends SecondPhone{
	String internet;
	String webtoon;

	public ThirdPhone(String color, String model, HashMap<String, Boolean> states, int channel) {
		super(color, model, states, channel);
		this.states.put("internet", false);
		this.states.put("webtoon", false);
		
	}
	public void internetOn() {
		if(states.get("power") && !states.get("internet")) {
			System.out.println("인터넷을 켰음");
			states.put("internet", true);
		}else {
			System.out.println("인터넷 사용중");
		}
	}
	public void internetOff() {
		if(states.get("internet")) {
			System.out.println("인터넷종료 ");
			states.put("internet", false);
		}else {
			System.out.println("인터넷 사용중이 아님");
		}
	}
	public void webtoonOn() {
		if(!states.get("internet") && states.get(webtoon)) {
			System.out.println("웹툰 앱을 켰음");
			states.put("webtoon", true);
		}else {
			System.out.println("웹툰 앱 사용중");
		}
	}
	
	
	
}
