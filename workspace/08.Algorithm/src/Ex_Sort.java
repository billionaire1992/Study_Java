import java.util.Arrays;

public class Ex_Sort {
	//정수형 배열 (arr[])의 원소값을 오름차순으로 정렬하는 메소드를 호출하고 : ascSort()	
	//정수형 배열 (arr[])의 원소값을 내림차순으로 정렬하는 메소드를 호출하고 : descSort()	
	public static void main(String[] args) {
		int[] arr = {3, 2, 4, 1, 5};			//정수형 배열arr[]을 선언하고 값을 할당	
		System.out.println("배열의 원소값 : " + Arrays.toString(arr));
		
		Ex_Sort ex = new Ex_Sort();
		int[] ascArr = ex.ascSort(arr);			//오름차순으로 정렬하는 메소드 호출
		System.out.println("오름차순으로 정렬 : " + Arrays.toString(ascArr));
		
	    int[] descArr = ex.descSort(arr);		//내림차순으로 정렬하는 메소드 호출
	    System.out.println("내림차순으로 정렬 : " + Arrays.toString(descArr));
		
	    Arrays.sort(arr);  //배열을 (arr[]) 오름차순으로 정렬  
	    System.out.println("배열의 원소값 : " + Arrays.toString(arr));
	}//main()
	
	//오름차순으로 정렬하고 리턴하는  메소드를 정의 
	public int[] ascSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {		//선택정렬
			for (int j = i + 1; j < arr.length; j++) {
				if(arr [i] > arr [j]) {			//오름 차순 부등호 방향에 따라 내림차순 오름차순 결정
					int temp = arr[i];
					arr[i] = arr[j];			//스왑 
					arr[j] = temp;
				}//if
			}//for j
		}//for i 
		return arr;
	}//ascSort()

	//내림차순으로 정렬하고 리턴하는  메소드를 정의 
	public int[]  descSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {		//선택정렬
			for (int j = i + 1; j < arr.length; j++) {
				if(arr [i] < arr [j]) {			//오름 차순 부등호 방향에 따라 내림차순 오름차순 결정
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}//if
			}//for j
		}//for i 
		return arr;
	}//descSort()

}//class
