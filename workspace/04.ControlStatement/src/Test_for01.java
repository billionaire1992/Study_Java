public class Test_for01 {
	public static void main(String[] args) {
		//1부터 10까지의 정수중에서 홀수만 출력 : for (반복), if (홀수판단)
		//단, 한줄로 출력하시오 : println() → ln삭제  13579 → \t 삽입  1 3 5 7 9 
		for (int i = 1; i <= 10; i++ ) {
			if( i % 2 != 0) {
				System.out.print(i + "\t");			 
			}//if
		}//for
	}//main()
}//class
