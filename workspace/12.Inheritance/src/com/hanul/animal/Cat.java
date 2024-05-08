package com.hanul.animal;

public class Cat extends Animal{		//Animal Class 상속
	//디폴트 생성자 메소드
	public Cat() {}
	
	//생성자 메소드 초기화 
	public Cat (String name, int age) {
		super(name, age);
	}
	
}//class
