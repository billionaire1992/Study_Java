
import java.util.Random;
import java.util.Scanner;

public class arraygame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		while (true) {
			System.out.print("난이도를 입력 해주세요 : ");
			int in = Integer.parseInt(scanner.nextLine());
			if (in == 0) {
				System.out.println("다시 입력하세요");
				continue;
			} else {
				int[] arr = new int[in];
				System.out.println("게임을 시작합니다");
				System.out.println("랜덤 값이 설정됩니다");
				Random random = new Random();
				int ran = random.nextInt(in);

				while (true) {
					System.out.print("값을 입력하세요  : ");

					int answer = Integer.parseInt(scanner.nextLine());
					boolean isAnswer = false;

					count++;
					for (int i = 0; i <= in; i++) {
						if (i == ran) {
							arr[i] = ran;
							if (arr[i] == answer) {
								System.out.println("정답입니다");
								isAnswer = true;
								// scanner.close();
								System.out.println("시도 횟수는 " + count + "입니다.");
							} else {
								System.out.println("다시 입력하세요");
								continue;
							}//if
						}//if
					}//for
					if (isAnswer) {
						break;
					}//if ans
				}//while

			}//if
		}//while
	}//main
}//class
