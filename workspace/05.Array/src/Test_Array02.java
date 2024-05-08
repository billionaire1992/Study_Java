public class Test_Array02 {
	public static void main(String[] args) {
		//초기화 된 배열 (arr[])에서 홀수의 합(oddSum)과 짝수의 합 (evenSum)을 구하여 출력 선언과 동시에 할당
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
			int oddSum = 0;
			int evenSum = 0;
				for (int i = 0; i < arr.length; i++) {		
					if(arr[i] % 2 != 0) {				//index 따라가야함
						oddSum += arr[i];
					} else {
						evenSum += arr[i];	
					}//if
				}//for
			System.out.println("홀수의 합 : " + oddSum);
			System.out.println("짝수의 합 : " + evenSum);
		
		
	}//main()
}//class
