package com.hanul.game;

public class Pikachu extends Character{			//extends(상속)  : Pikachu → Character 
	//디폴트 생성자 메소드 : 객체가 생성될 때 동작(초기화)되는 메소드
	//경험치, 에너지, 레벨을 초기화 하고 생성된 캐릭터의 정보를 출력 
	public Pikachu() {
		exp = 30;
		energy = 50;
		level = 0;
		System.out.println("피카츄 캐릭터가 생성 되었습니다.");
		printInfo();
	}	
	
	
	@Override
	public void eat() {
		energy += 10;
		
	}

	@Override
	public void sleep() {
		energy += 5;
		
	}

	@Override
	public boolean play() {
		energy -= 20;
		exp += 5;
		levelUp();
		return checkEnergy();
	}

	@Override
	public boolean train() {
		energy -= 10;
		exp += 15;
		levelUp();
		return checkEnergy();
	}

	@Override
	public void levelUp() {
		if(exp >= 40) {
			level++;
			exp -= 40;
			System.out.println(level + "단계로 레벨업 되었습니다.");
		}//if
	}	
	
}//class
