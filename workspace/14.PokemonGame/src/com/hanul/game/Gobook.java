package com.hanul.game;

public class Gobook extends Character{			//extends(상속)  : Lee → Character 
	//디폴트 생성자 메소드 : 객체가 생성될 때 동작(초기화)되는 메소드
	//경험치, 에너지, 레벨을 초기화 하고 생성된 캐릭터의 정보를 출력 
	public Gobook() {
		exp = 40;
		energy = 50;
		level = 0;
		System.out.println("꼬부기 캐릭터가 생성 되었습니다.");
		printInfo();
	}	
	
	
	@Override
	public void eat() {
		energy += 15;
		
	}

	@Override
	public void sleep() {
		energy += 10;
		
	}

	@Override
	public boolean play() {
		energy -= 30;
		exp += 15;
		levelUp();
		return checkEnergy();
	}

	@Override
	public boolean train() {
		energy -= 20;
		exp += 30;
		levelUp();
		return checkEnergy();
	}

	@Override
	public void levelUp() {
		if(exp >= 50) {
			level++;
			exp -= 50;
			System.out.println(level + "단계로 레벨업 되었습니다.");
		}//if
	}	
	
}//class
