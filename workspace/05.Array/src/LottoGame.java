import java.util.Arrays;
import java.util.Random;

public class LottoGame {
	public static void main(String[] args) {
		int[] lotto = new int [6];		//번호가 저장될 배열 선언 및 생성
		Random random = new Random();	//무작위로 번호를 생성하기 위한 Random객체 생성
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1;	// 1~45 범위 내의 번호를 할당 
			for (int j = 0; j < i; j++) {		//번호 중복검사 실행	
				if(lotto [i] == lotto[j]) {							
					i = i - 1 ; // i -= 1;
					break;
				}//if
			}//for j
		}//for i
		
		
		Arrays.sort(lotto); 		//배열의 (lotto[])의 원소 값을 오름차순으로 정렬
				
			System.out.println("Result : " + Arrays.toString(lotto));
	}//main()
}//class
