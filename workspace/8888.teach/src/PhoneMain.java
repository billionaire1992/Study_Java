import java.util.HashMap;

public class PhoneMain {
	public static void main(String[] args) {
		//1세대 폰 
		ThirdPhone fp = new ThirdPhone("검정", "1세대",new HashMap<String, Boolean>(), 0);	//대문자로 시작 new 로 시작
		
		
		fp.dmbOn();
		  fp.powerOn(); 
		  fp.powerOn();
		  fp.powerOff(); 
		  fp.powerOff();
		  fp.powerOn();
		  fp.callOn();
		  fp.callOn();
		  fp.sendVoice("여보세요",true );
		  fp.sendVoice("네",false );		  
		  fp.callOff();
		  fp.callOff();
		  fp.sendVoice("네",false );
		  
		  fp.dmbOn();
		  
		  fp.dmbOff();
		  fp.dmbOff();
		  fp.dmbOn();
		  fp.changeChannel(1);
		  fp.changeChannel(40);
		  fp.dmbOff();
		  fp.dmbOn();
		  fp.internetOn();
		  fp.internetOn();
		  fp.internetOff();
		  fp.internetOff();
		  fp.internetOn();
		  fp.internetOff();
		  fp.webtoonOn();
		  fp.webtoonOn();
		  
	}//main()
}//class
