import java.util.Arrays;
import java.util.Random;

public class LottoGame {
	//번호를 생성하는 메소드 (getNumber())를 호출하고 결과를 출력
	public static void main(String[] args) {
		LottoGame game = new LottoGame();		//객체생성
		for(int i =1; i <=5; i++) {
			int[] lotto = game.getNumber(); 		//메소드 호출 
			System.out.println("Result" + i + " : " +Arrays.toString(lotto));			
		}//for		
	}//main()
	
	//번호를 생성하고 결과를 리턴하는 메소드 정의
	public int[] getNumber() {
		int [] lotto = new int [6];			//번호가 저장될 배열 선언 및 생성
		Random random = new Random();		//무작위로 번호를 생성하기 위한 객체를 생성
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1;		//1~45 범위 내의 번호를 할당 
			for (int j = 0; j < i; j++) { // 번호의 중복검사
				if(lotto[i] == lotto[j]) {
					i -= 1;
					break;
				}//if
			}//for j
		}//for i
		Arrays.sort(lotto); 	//배열 (lotto[]) 의 원소 값을 오름차순으로  정렬
		return lotto;
	}//getNumber
}//class