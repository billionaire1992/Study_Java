package com.hanul.game;

public class Raichu extends Character{			//extends(상속)  : Raichu → Character 
	//디폴트 생성자 메소드 : 객체가 생성될 때 동작(초기화)되는 메소드
	//경험치, 에너지, 레벨을 초기화 하고 생성된 캐릭터의 정보를 출력 
	public Raichu() {
		exp = 50;
		energy = 50;
		level = 0;
		System.out.println("라이츄 캐릭터가 생성 되었습니다.");
		printInfo();
	}	
	
	
	@Override
	public void eat() {
		energy += 30;
		
	}

	@Override
	public void sleep() {
		energy += 40;
		
	}

	@Override
	public boolean play() {
		energy -= 40;
		exp += 30;
		levelUp();
		return checkEnergy();
	}

	@Override
	public boolean train() {
		energy -= 50;
		exp += 50;
		levelUp();
		return checkEnergy();
	}

	@Override
	public void levelUp() {
		if(exp >= 70) {
			level ++;
			exp -= 70;
			System.out.println(level + "단계로 레벨업 되었습니다.");
		}//if
	}	
	
}//class
