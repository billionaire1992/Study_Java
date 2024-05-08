import java.util.Scanner;

import function.Display;
import function.GenerationDAO;

public class Third_generation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GenerationDAO dao = new GenerationDAO();
		Display dp = new Display();
		boolean power = false;
		dao.Power_check(power);
		System.out.println();
		boolean call = false;
		boolean internet = false;
		boolean webtoon = false;
			while (true) {
				dp.display_main();
				int menu = Integer.parseInt(scanner.nextLine());

				if (menu == 1) {
					dao.call_on(call);
					call = true;
				} else if (menu == 2) {
					dao.call_off(call);
					call=false;
				} else if (menu == 3) {
					dao.send_voice(call);
				} else if (menu == 4) {
					dao.receive_voice(call);
				}else if (menu == 5) {
				System.out.println("전원 종료");
						break;
				}else if (menu == 6){
					dao.Internet_on(internet);
					internet = true;
				}else if(menu == 7){
					dao.Internet_off(internet);
					internet = false;
				} else if(menu == 8){
					dao.webtoon_on(webtoon);
					webtoon = true;
				} else if(menu == 9){
				dao.webtoon_off(webtoon);
					webtoon = false;
				}
			} // while
	}// main()
}// class


