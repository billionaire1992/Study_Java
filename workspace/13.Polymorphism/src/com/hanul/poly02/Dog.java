package com.hanul.poly02;

public class Dog extends Animal{
	//추상 클래스를 상속 ▶ 추상 메소드가 재정의(Override)가 필수
	
	@Override				//상위 클래스에서 선언만 한 추상 메소드를 반드시 재정의(Override)
	public void cry() {
		System.out.println("멍멍");	
	}//cry() 
	
	
}//class
