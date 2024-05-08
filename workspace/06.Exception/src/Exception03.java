public class Exception03 {
	public static void main(String[] args) {
		try {
			int result = 10 /5 ;
			System.out.println("Result : " + result);   //ArithmeticException : 미확인 예외
			
			int[] arr = new int [3];
			arr[0] = 10;						// ArrayIndexOutOfBoundsException : 미확인 예외  
			System.out.println("배열의 원소값 : " + arr[0]);
			
			String str = "100a";
			int pstr =Integer.parseInt(str);
			System.out.println(pstr);
		} catch (ArithmeticException e) {								// ArithmeticException : 만 처리
			System.out.println("입력 값이 잘못 되었습니다. ");
		} catch (ArrayIndexOutOfBoundsException e) {					// ArrayIndexOutOfBoundsException  : 만 처리
			System.out.println("배열의 Index 값이 잘못되었습니다 !");
		} catch (Exception e) {											// Exception 모든 예외 처리					
			e.printStackTrace();										// 예외를 상세하게 출력	
			System.out.println("예외 발생 ");							// 예외 메세지를 직접 작성하여 출력
		}
			
		
		
		
		
	}//main()
}//class
