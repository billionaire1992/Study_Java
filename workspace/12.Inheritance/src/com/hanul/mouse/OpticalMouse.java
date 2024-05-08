package com.hanul.mouse;
	
//상위 클래스인 WheelMouse Class 를 하위클래스인 OpticalMouse가 상속
//Override : 하위클래스에서 상위클래스로부터 상속받은 메소드를 재정의(수정)
public class OpticalMouse extends WheelMouse {
	
	@Override			//직접입력
	public void clickLeft() {
		System.out.println("광마우스 왼쪽 클릭");
	}//clickLeft()

	@Override			//Source MenuBar > Override/Implement Methods
	public void clickRight() {
		System.out.println("광마우스 오른쪽 클릭");
	}//clickRight()
	
	@Override
	public void scroll() {		//Ctrl + SpaceBar : 자동완성
		System.out.println("광마우스 스크롤 기능");
	}
}//class
