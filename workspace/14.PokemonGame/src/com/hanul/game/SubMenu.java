package com.hanul.game;

import java.util.Scanner;

public class SubMenu {
	//멤버변수와 생성자 메소드 구현 
	private Scanner scanner;
	
	public SubMenu (Scanner scanner) {
		this.scanner = scanner;
		
	}
	
	public void play(Character character) {
		while(true) {
			System.out.println("\n 무엇을 할까요 ? ? ");
			System.out.println("1. 먹이주기\t 2. 잠 재우기\t 3. 놀아주기");
			System.out.print("4. 운동시키기\t 5. 종료하기 ▶");
		
			int menu = Integer.parseInt(scanner.nextLine());
			if(menu == 1) {
				character.eat();
			}else if(menu == 2) {
				character.sleep();
			}else if(menu == 3) {
				boolean result = character.play();
				if(!result) {	// ! : 논리 부정 (true → false, false → true)
					System.out.println("에너지가 부족해서 죽었음. . . ...");
					System.out.println("게임을 종료합니다.");
					break;
				}//if
			}else if(menu == 4) {
				boolean result = character.train();
				if(result) {
					
				}else {	
					System.out.println("에너지가 부족해서 죽었음. . . ...");
					System.out.println("게임을 종료합니다.");
					break;
				}//if
			}else if(menu == 5) {
				System.out.println("\n게임을 종료합니다 !");
				scanner.close();
				break;
			}else {
				System.out.println(" 잘못입력하셨습니다 !");
				continue;
			}//if
			character.printInfo();
		}//while
	}//play
	
}//class
