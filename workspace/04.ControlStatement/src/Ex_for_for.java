public class Ex_for_for {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {			//for i : 1부터 5까지 동작 
			for(int j = 1; j <= i; j++) {		//for j : 1부터 i까지 동작
				System.out.println("i 값 : " + i + ", j 값 : " + j); // i가 3일때 j 가 3번 돌고 4번일때 j 가 4번 돌고 
			}//for j	
		}//for i
		
		 System.out.println();
		
		for(int i = 1; i <= 5; i++) {			//for i : 1부터 5까지 동작 
			for(int j = 1; j <= i; j++) {		//for j : 1부터 i까지 동작
				System.out.print("★"); // i가 3일때 j 가 3번 돌고 4번일때 j 가 4번 돌고 
			}//for j	
			System.out.println();
		}//for i		
	}//main	
}//class


/*
   ☆중첩 반복문 : 반복문 내의 다른 반복문이 존재  
    for(초기값 ① ; 최종값 ② ; 증감값 ④; ){
   	for(초기값 ; 최종값; 증감값;){
   			실행문;   ③ 
    	}//안쪽 for j
   }// 바깥쪽 for i  
 */
