import java.util.Arrays;

public class Ex_Sum {
	//정수형 배열arr[]의 원소값의 누적합(sum)을 구하여 출력 
	public static void main(String[] args) {
		int[] arr = {3, 2, 4, 1, 5};		//정수형 배열 (arr[]) 을 선언하고 값을 할당 : 초기화
		
		Ex_Sum ex = new Ex_Sum();			//객체 생성
		int sum = ex.getSum(arr);			//누적합을 계산하는 메소드 호출
		ex.display(arr,sum);				//결과를 출력하는 메소드 호출 
		
	}//main()
	//누적합 (sum)을 계산하고 결과를 리턴하는 메소드를 정의 
	public int getSum(int[] arr) {
		int sum = 0; 				//결과가 저장될 변수 (sum)을 초기화 
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];					//sum += arr[i];			
		}//for
		return sum;
	}//getSum

	//결과를 출력하는 메소드를 정의 
	public void display(int[] arr, int sum){
		System.out.println("주어진 배열의 원소 값 : " + Arrays.toString(arr) );
		System.out.println("원소의 누적합 : " + sum);
	}//display
	
	
}//class



/*
  public static void main(String[] args) {
		int[] arr = {3, 2, 4, 1, 5};		//정수형 배열 (arr[]) 을 선언하고 값을 할당 : 초기화 		
		
		int sum = 0; 				//결과가 저장될 변수 (sum)을 초기화 
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];					//sum += arr[i];			
		}//for
		
		System.out.println("주어진 배열의 원소 값 : " + Arrays.toString(arr) );
		System.out.println("원소의 누적합 : " + sum);
  */
 