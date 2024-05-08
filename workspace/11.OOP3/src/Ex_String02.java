public class Ex_String02 {
	//문자열의 대소관계 비교 : compareTo(), compareToIgnoreCase() 
	//문자열의 동등관계 비교 : equals(), equalsIgnoreCase()
	public static void main(String[] args) {
		String str1 = "APPLE";
		String str2 = "ORANGE";
		String str3 = "APPLE";
		String str4 = "apple";
		
		//if(str1 > str2) ▶ 오류 : 문자열은 비교연산자를 사용할 수 없다.
		//문자열의 비교는 compareTo() 메소드를 활용 :  유니코드 값으로 비교 
		//compareTo(),compareToIgnoreCase() 결과 : 양수, 0, 음수
		int result = str1.compareTo(str2);
		System.out.println("결과 : " + result);				 		//-14(음수) : str2 가 더 크다 
		
		result = str1.compareTo(str3);
		System.out.println("결과 : " + result); 					//0 : str1 과 str3 은 같다. 
		
		result =str4.compareTo(str1);
		System.out.println("결과 : " + result);				 		//32 : str4 가 더 크다 
		
		result = str4.compareToIgnoreCase(str1);					//대소문자 구분없이 비교
		System.out.println("결과 : " + result);						//0 : str4 와  str1은 같다
		System.out.println("==========");
	 
		//문자열이 같은지 다른지 (동등관계) 를 비교 
		if(str1.compareTo(str3) == 0) {								//동등관계 : equals() → true, false
			System.out.println(str1 + "과 " + str3 + "은 같다");
		}else {
			System.out.println(str1 + "과 " + str3 + "은 같지않다");			
		}//if
		
		if(str1.equals(str3)) {
			System.out.println(str1 + "과 " + str3 + "은 같다");
		}else {
			System.out.println(str1 + "과 " + str3 + "은 같지않다");						
		}//if
		
		if(str1.equalsIgnoreCase(str4)) {							//대소문자 구분없이 비교
			System.out.println(str1 + "과 " + str4 + "은 같다");			
		}else {			
			System.out.println(str1 + "과 " + str4 + "은 같지않다");						
		}//if
	}//main()	
}//class


















