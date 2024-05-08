import com.hanul.poly03.Radio;
import com.hanul.poly03.RemoCon;
import com.hanul.poly03.TV;

public class Poly03Main01 {
	//tv,radio 소리를 올리고 내린 후에 인터넷에 접속
	
	public static void main(String[] args) {
	//① UpCasting 
	RemoCon remoCon = new TV();
	remoCon.VolUp();
	remoCon.VolDown();
	remoCon.internet();
	
	remoCon= new Radio();
	remoCon.VolUp();
	remoCon.VolDown();
	remoCon.internet();
	System.out.println("====================");
	
	//② 다형성 인수 : 일반적인 방식으로 객체 생성
	TV tv = new TV();
	Radio radio = new Radio();
	
	Poly03Main01 poly = new Poly03Main01();
	poly.play(tv);
	poly.play(radio);
	System.out.println("====================");
	
	//③ 다형성 배열 : 일반적인 방식으로 객체 생성
	RemoCon[] remoCons = {tv, radio};
	for (int i = 0; i < remoCons.length; i++) {
		remoCons[i].VolUp();
		remoCons[i].VolDown();
		remoCons[i].internet();
	}//for
	
	}//main()

	public void play(RemoCon remoCon) {
		remoCon.VolUp();
		remoCon.VolDown();
		remoCon.internet();
	}//play()
}//class




















