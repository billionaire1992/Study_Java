public class Test_Array01 {
	public static void main(String[] args) {
		//정수 3개를 저장할 배열(arr1[])을 선언 및 생성하고 
		//모든 요소(index)에 10을 할당하고 출력하시오 ▶ for문
		int[] arr1 = new int[3];		//정수형 배열(arr1[])을 선언하고 생성
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]= 10;				//배열 arr1[i] 번지(index)에 10을 할당
			System.out.println("arr1[" + i + "]의 값 : " + arr1[i]);
				
			
		}//for
		//정수 5개를 저장할 배열 (arr2[])을 선언 및 생성하고,
		//각각의 요소(index)에 10, 20 ,30 ,40 ,50 을 할당하고 출력하시오 ▶for문 활용
		System.out.println();
		
		
		int[] arr2 = new int[5];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = (i + 1) * 10;   
			System.out.println("arr2[" + i + "]의 값 : "  + arr2[i]);
	
		}//for		
	}//main()
}//class

