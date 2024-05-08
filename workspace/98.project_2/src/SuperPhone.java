import phone.phoneDTO;

//������
public class SuperPhone {
	public static void main(String[] args) {
		
		phoneDTO first1 = new phoneDTO();
		first1.firstGenerationInformation();
		first1.PhoneOn();
		first1.PhoneOff();
		first1.PhoneCallOn();
		first1.PhoneCallOff();
		first1.VoiceTransRecep();
		first1.PhoneOn();
		first1.PhoneCallOn();
		first1.PhoneOff();
		System.out.println("=======2���� test=========");
		generation2 phone2 = new generation2();
		phone2.TwoGenerationInformation();
		phone2.DMBOn();
		phone2.PhoneOn();
		phone2.DMBOn();
		phone2.DMBOff();
		System.out.println("======== 3세대 test===========");
		generation3 phone3 = new generation3();
		phone3.internetOn();
		phone3.internetOff();
		
		phone3.webtoonOn();
		phone3.webtoonOff();
		 
	
		/* phone3.internet_off(); phone3.webtoon_on(); phone3.webtoon_off();
		 */
	}//main
}//Class


