import java.util.Scanner;

import com.hanul.game.Character;
import com.hanul.game.Gobook;
import com.hanul.game.Lee;
import com.hanul.game.Pikachu;
import com.hanul.game.Raichu;
import com.hanul.game.SubMenu;

public class GameMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("원하는 포켓몬을 선택하세요");
		System.out.print("1. 피카츄 \t2. 이상해씨\t3. 꼬부기\t4. 라이츄 ▶");
		
		Character character = null;
		
		int menu = Integer.parseInt(scanner.nextLine());
		if (menu == 1) {
			character = new Pikachu();	
		}else if(menu == 2 ){
			character = new Lee();
		}else if (menu == 3){
			character = new Gobook();
		}else if(menu ==4){
			character = new Raichu();
		}else {
			
			System.out.println("잘못 선택하셨습니다");
		}
		
		SubMenu sm = new SubMenu(scanner);
		sm.play(character);
		
		
	}//main()
}//class
