package com.hanul.mouse;

//extends (상속) : 상위 클래스인 Mouse Class 를 하위클래스인 WheelMouse Class 가 상속 
public class WheelMouse extends Mouse {		//Sub Class , 하위 Class, 자식 Class
	public void scroll() {
		System.out.println("스크롤 기능 추가");
	}
	
	
}//class
