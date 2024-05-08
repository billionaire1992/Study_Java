package com.hanul.game;

public abstract class Character {		//abstract 추상 클래스
	//멤버 변수 선언 ▶ 접근제어자 : protected → 같은 패키지와 상속받은 하위 클래스에서 접근 허용 
	protected int exp;
	protected int energy;
	protected int level;
	
	//추상메소드 : 상속받은 하위 클래스에서 반드시 재정의(Override)를 강제	
	
	public abstract void eat();					//먹이를 준다	
	public abstract void sleep();				//잠을 재운다
	public abstract boolean play();				//놀아준다
	public abstract boolean train();			//운동을 시킨다
	public abstract void levelUp();				//레벨을 올린다 
	
	//에너지를 체크
	public boolean checkEnergy() {
		if(energy >= 0) {
			return true;
		}else {
			return false;
		}//if
	}//checkEnergy
	
	//캐릭터의 현재 상태를 출력
	public void printInfo() {
		System.out.println("===============================");
		System.out.println("현재 캐릭터의 정보를 출력합니다.");
		System.out.println("경험치 : " + exp);
		System.out.println("에너지 : " + energy);
		System.out.println("레벨 : " + level);
		System.out.println("===============================");
	
	}//printInfo()
}//class
