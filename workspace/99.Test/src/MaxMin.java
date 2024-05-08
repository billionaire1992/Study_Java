import java.util.Arrays;

public class MaxMin {
	public static void main(String[] args) {
		int[] arr = {89, 98, 78, 79, 45, 100, -34, 65};
		
		
		MaxMin test = new MaxMin();
		int max = test.getMax(arr);
		int min = test.getMin(arr);
		test.display(arr,max,min);
	}//main()
		public int getMax(int[] arr) {
			int max = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if(max < arr[i]) {
					max = arr[i];
				}//if
			}//for
			return max;
		}//getMax()
		
		public int getMin(int[] arr) {
			int min = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if(min > arr[i]) {
					min = arr[i];
				}//if
			}//for
			return min;
		}//getMin()
		
		public void display(int[] arr, int max, int min) {
			System.out.println("배열의 원소값 : " + Arrays.toString(arr));
			System.out.println("최대값 : " + max);
			System.out.println("최소값 : " + min); 
		}//display()	
}//class
/* Maxminmm mx = new Maxminmm();		

System.out.println("배열의 원소값 : " + Arrays.toString(arr));
System.out.println("최대값 : " + mx.getMax(arr));
System.out.println("최소값 : " + mx.getMin(arr));             */