public class Ex_Array04 {
	public static void main(String[] args) {
		//비정방형(가변길이) 배열 : 각 행마다 열의 개수가 다른 배열
		int[][] arr = new int[3][];		//배열 생성 시 열의 개수는 생략
		arr[0] = new int[1];			//index 0번째 행에 1열을 생성
		arr[1] = new int[2];			//index 1번째 행에 2열을 생성
		arr[2] = new int[3];			//index 2번째 행에 3열을 생성
		
		for (int i = 0; i < arr.length; i++) {			//arr.length : 3 ▶ row
			for (int j = 0; j < arr[i].length; j++) {	//arr[i].length : ? ▶ column
				arr[i][j] = 10;
				System.out.print("arr[" + i + "][" + j + "]의 값 : " + arr[i][j] + "\t");
			}//for j
			System.out.println();
		}//for i
		
		//비정방형 배열을 이용한 별찍기
		char[][] star = new char[5][];
		for (int i = 0; i < star.length; i++) {
			star[i] = new char[i + 1];
			for (int j = 0; j < star[i].length; j++) {
				star[i][j] = '★';
				System.out.print(star[i][j]);
			}//for j
			System.out.println();
		}//for i
	}//main()
}//class
