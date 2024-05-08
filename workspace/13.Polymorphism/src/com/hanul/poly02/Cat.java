package com.hanul.poly02;

public class Cat extends Animal {

	
	
	@Override				//상위 클래스에서 선언만 한 추상 메소드를 반드시 재정의(Override)
	
	public void cry() {
		System.out.println("야옹");
	}//cry()
	
	//Cat Class 만 가지고 있는 고유한 메소드 : 알파상태 
		public void night() {
			System.out.println("고양이는 야행성이다. ");
		}//night()
}//class
