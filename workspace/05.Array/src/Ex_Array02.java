public class Ex_Array02 {
	//정수 3개를 저장할 배열(arr[])을 선언하고, 
	//동시에 모든 요소에 10을 할당하시오. ▶ 배열의 선언 및 초기화 
	//배열 (arr[])의 모든 요소의 합(sum) 을구하여 출력하시오 .
	public static void main(String[] args) {
		int [] arr = {10, 10, 10};		//정수형 배열(arr[])을 선언하고 동시에 값을 할당 ▶배열의 초기화 
		
		int[] arr1;						//배열의 선언
		//arr1 = {10, 10, 10};			//오류 : 배열의 생성 단계의 부재 
		arr1 = new int[] {10, 10, 10};  //배열의 선언 및 초기화 
		
		//배열(arr[])의 모든 요소의 합 (sum)을 구하여 출력하시오.
		int sum = arr [0]+ arr[1]+ arr[2];
		System.out.println("배열 (arr[])의 총합 : " + sum);
		System.out.println("배열 (arr[])의 크기(길이) : " + arr.length);
	
		//배열(arr1[])의 모든 요소의 합 (total)을 구하여 출력하시오. ★★★★★★
		int total = 0;
		for (int i = 0; i < arr1.length; i++) {
			total += arr1[i];			//total = total + arr1[i];
		}//for
		System.out.println("배열 (arr[])의 총합 : " + total);
	
	
	}//main()
}//class
