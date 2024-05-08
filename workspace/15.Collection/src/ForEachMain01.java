import java.util.Arrays;

public class ForEachMain01 {
	public static void main(String[] args) {
		int[] score = {95, 80, 72, 83, 66};
		System.out.println("배열의 원소값 : " + Arrays.toString(score));
		
		//배열의 총합(sum) : 단순 for문 
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}//for
		
		System.out.println("배열의 총합 : " + sum);
		
		//배열의 총합(result) : 향상된 for문
		
		int result = 0;
		for (int i : score) {
			result += i;
		}
		System.out.println("배열의 총합 : " + result);
		
	}//main()
}//class

/*
○ 단순 for 문 : index 필요 
	for(초기값(시작값); 조건식(최종값); 증감값 ) {
		~~ body 반복변수 ~~;
	
	}
	for(int i = 0; i < arr.length; i++){
		arr[i] = 10;
	}

○ 향상된 for 문 : 단순 for 문을 간소화 → index 불필요 
	for( Type 식별자 : 배열명){
	~~ body (식별자) ~~;
	}
	
	for(int i : arr){
		syso(i);
	}

*/