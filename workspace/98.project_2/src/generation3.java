

//3����
public class generation3 extends generation2{
	private boolean internet;
	
	
	public boolean isInternet() {
		return internet;
	}
	public void setInternet(boolean internet) {
		this.internet = internet;
	}
	void internetOn () {
		if(dto.isPower()==false) { 
			System.out.println("인터넷을 사용합니다");
			internet = true;
		}else {
			System.out.println("전원이 꺼져있어 인터넷을 사용할 수가 없습니다.");
		}
	}
	void internetOff () {
		System.out.println("인터넷을 종료합니다.");
	}
	
	void webtoonOn() {
		if(isInternet()==false){
			System.out.println("웹툰 앱을 사용합니다.");
		}else {
			System.out.println("인터넷 연결 되어있지 않아 사용할 수가 없습니다.");
		}
	}
	void webtoonOff() {
		System.out.println("웹툰 앱을 종료합니다.");
	}
	
}		