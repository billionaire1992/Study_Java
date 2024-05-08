
import java.util.HashMap;

public class FirstPhone {
	//DTO, DAO
	//상태정보 (속성) , 기능
	// DTO : 키, 몸무게, 이름, 혈액형 등의 상태정보
	// DAO : 달린다 기능 등등
	
	//FirstPhone : DTO + DAO  기능과 정보가 한 클래스에 있는 형태
	
	private String color, model;
	//어떤 정보를 key, value로 나눠서 저장할 수 있는 collection Hash Map <key, Value> 
	protected HashMap<String, Boolean> states;
	
	public FirstPhone(String color, String model, HashMap<String, Boolean> states) {
		this.color = color;
		this.model = model;
		this.states = states;
		//HashMap<String, Boolean> states1 = new HashMap<String, Boolean>() ;
		System.out.println("색상 : " + color+ " 모델 : "+ model);
		this.states.put("power", false); //hash 맵을 통해서 get(key) 안에 있는 boolean 값 리턴
		this.states.put("call", false);
	}
	/*
	 * HashMap<StateEnum,Boolean> enumMap; public enum StateEnum{ power, call }
	 */
	
	
	
	public void powerOn() {
		if(states.get("power")) {  		//put 입력 get 가져오기 
			System.out.println("전원이 이미 켜져있습니다.");
		}else {
			states.put("power", true); 		//기존에 있던 key 를 이용해서 value는 덮어쓰여진다 
			System.out.println("전원이 켜졌습니다.");
		}
	}
	
	public void powerOff() {
		if(states.get("power")) {
			System.out.println("전원이 꺼졌습니다.");
			states.put("power", false);
		}else {
			System.out.println("전원이 이미 꺼져있습니다.");
		}
			
	}
	
	//전화가 왔을 때 받고 끊고의 기능을 수행할 수 있는 메소드를 1개이상 활용해서 만들기 
	public void callOn() {//true %% false  => ! 사용해서 true 로 만ㄷ름
		if(states.get("power") && !states.get("call")) {
			System.out.println("전화받음");
			states.put("call", true);
		}else {
			System.out.println("통화중 이거나 전원상태로 인해 수신 불가능");
		}
	}//callOn
	public void callOff() {
		if(states.get("power") && states.get("call")) {
			System.out.println("통화종료");
			states.put("call", false);
		}else {
			System.out.println("통화중이 아님");
		}
	}//callOff
	
	public void sendVoice(String data, boolean isFlag) {
		if(isFlag && states.get("call")) {
			System.out.println(" 나 : " + data);
		}else if(!isFlag && states.get("call")){
			System.out.println("상대방 : " + data);
		}else {
			System.out.println("통화중이 아님");			
		}
	}//sendVoice
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//class
