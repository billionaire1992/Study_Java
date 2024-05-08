package com.hanul.poly01;

public class Cat extends Animal {		//서브 클래스 : Animal
	@Override							//슈퍼클래스가 정의한 메소드를 수정 
	public void cry() {
		System.out.println("야옹");
	}//cry()
	
	//Cat Class 만 가지고 있는 고유한 메소드 : 알파상태 
	public void night() {
		System.out.println("고양이는 야행성이다. ");
	}//night()
}//class
