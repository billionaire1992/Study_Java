public class Test_String01 {
	//주어진 문자형 숫자(str)의 각 자릿수를 분리하여 합계(sum)을 구하시오.
	// 예 : "12345" → 1 + 2 + 3 + 4 + 5 = 15
	public static void main(String[] args) {
		String str = "12345";	
		
		//split(), for, Integer.parseInt()
		int sum = 0;
		String[] sp = str.split("");
		
		for (int i = 0; i < sp.length; i++) {	
			sum += Integer.parseInt(sp[i]);
		}//for
		
		//charAt(), for,length()
		
		int result = 0;
		for(int i = 0; i <str.length();i++) {
			result += str.charAt(i) -'0';			//UniCode 참조 
		}//for
		
		System.out.println("문자열 : "+ str);
		System.out.println("자릿 수 합계 : " + sum );
		System.out.println("자릿 수 합계 :" + result);
	}//main()
}//class
