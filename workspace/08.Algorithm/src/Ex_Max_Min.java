import java.util.Arrays;

public class Ex_Max_Min {
	//정수형 배열의 원소 값의 최대값(max), 최소값(min)을 구하여 출력
	public static void main(String[] args) {
		int[] arr = {3, 2, 4, 1, 5};			//정수형 배열arr[]을 선언하고 값을 할당
		
		Ex_Max_Min ex = new Ex_Max_Min();		//객체생성
		int max = ex.getMax(arr); 				//최대값을 구하는 메소드를 호출
		int min = ex.getMin(arr);				//최소값을 구하는 메소드 호출 
		ex.display(arr, max, min);				//결과를 출력하는 실행문 호출 

	
		System.out.println("==========================");
		Arrays.sort(arr);		//배열을 오름차순으로 정렬		//원본데이터 상실
		System.out.println("배열의 원소값 : "  + Arrays.toString(arr));					
		System.out.println("배열의 최대값 : " + arr[arr.length-1]);
		System.out.println("배열의 최소값 : " + arr[0]);		
	}//main()
	
	//최대값을 계산하고 리턴하는 메소드를 정의
	public int getMax(int[] arr) {
		int max = arr[0];			// 최대값이 저장 될 변수를 초기화 ▶배열의 첫 번쨰 index 로 할당
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {		//현재의 최대값은 max 과 각각의 배열의 원소값 arr[i]을 비교 
				max = arr[i];		//배열의 원소값 arr[i] 이 더 크다면, 최대값을 변경 (재할당) 
			}//if
		}//for
		return max;
	}//getMax()
	
	//최소값을 계산하고 리턴하는 메소드를 정의
	public int getMin(int[]arr) { 
		int min = arr[0];						//최소값이 저장 될 변수를 초기화 ▶배열의 첫 번쨰 index 로 할당
		for (int i = 0; i < arr.length; i++) {  //현재의 최소값은 min 과 각각의 배열의 원소값 arr[i]을 비교
			if(min > arr[i]) {					//배열의 원소값 arr[i] 이 더 작으면, 최소값을 변경 (재할당)
				min = arr[i];
			}//if
		}//for
		return min ;
	}//getMin()
	
	//결과를 출력하는 메소드를 정의
	public void display(int[] arr , int max, int min) {
		System.out.println("주어진 배열의 원소값 : " + Arrays.toString(arr));
		System.out.println("배열의 최대값 : " + max);
		System.out.println("배열의 최소값 : " + min);
	}//display()
}//class

 
/*
public static void main(String[] args) {
		int[] arr = {3, 2, 4, 1, 5};
		
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				
			}else if(min > arr[i]) {
				min = arr[i];
			}//if
		}//for
		System.out.println("주어진 배열의 원소값 : " + Arrays.toString(arr));
		System.out.println("배열의 최대값 : " + max);
		System.out.println("배열의 최소값 : " + min);
	}//main()

*/