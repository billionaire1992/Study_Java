import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception01 {
	public static void main(String[] args) {
		// 3개의 길이(크기)를 갖는 정수형 배열  (arr[]) 을 선언 및 생성한 후 
		// 임의의 값을 할당하고 출력하시오.
		int[] arr = new int [3];							//배열의 선언 및 생성
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		//arr[3] = 40;													//ArrayIndexOutOfBoundsException : 미확인 예외 
		
		System.out.println("arr[0]의 값 : " + arr[0]);
		System.out.println("arr[1]의 값 : " + arr[1]);
		System.out.println("arr[2]의 값 : " + arr[2]);
		//System.out.println("arr[3]의 값 : " + arr[3]);
		
		// String str1 = 100; 											//에러
		 String str1 = "100";											//숫자 100이 아닌 문자 100
		 System.out.println( "Str1의 값 : " + str1);
		 int pstr1 = Integer.parseInt(str1);							// 문자 100을 정수타입으로 변환.
		 System.out.println("pstr1의 값 : " + pstr1);					//숫자 100
		 
		 
		 String str2 = "100a";
		 System.out.println("str2의 값 : " + str2 );
		 //int pstr2 = Integer.parseInt(str2);
		 //System.out.println("pstr2의 값 : " + pstr2);					//NumberFormatException : 미확인 예외 
		 
		 int num1 = 10;
		 int num2 = 0;
		 System.out.println("num2 / num1 : " + (num2 / num1 )); 		//출력값 : 0
		 //System.out.println("num1 / num2 : " + (num1 / num2 )); 		//출력값 : ArithmeticException 
		 
		 //"ABC.TXT" 파일을 읽어들이시오 : FileInputStream Class  ▶확인예외 → 반드시 예외 처리할 것 ! try/catch
		 try {
			FileInputStream fis = new FileInputStream("abc.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();										//예외가 발생한 시점을 메모리에서 추적하여 상세하게 출력
			System.out.println(e.getMessage()); 						//예외 메세지만 간략하게 출력 
			System.out.println("해당 파일이 존재하지 않습니다 !");		//예외메세지를 직접 작성
		}			 

		 
		 
		 /*
		 	try {
		 	예외가 발생할 가능성이 있는 코드 (정상코드)
		 } catch (Exception e ){
		 	예외가 발생할 시 처리할 코드 (대안코드) 
		 } finally {	▶생략 가능
		 	무조건 실행되어야 할 코드 
		 }
		 
		 */
	}//main()
}//class
