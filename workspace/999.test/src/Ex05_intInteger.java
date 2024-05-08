
public class Ex05_intInteger {
	public static void main(String[] args) {
		//기본형 데이터 타입 : 소문자로 시작 , null을 담을 수 없는 : int
		//참조형 데이터 타입 : 대문자로 시작 , null을 담을 수 있는 : Integer
		//Wrapper Class : 기본형 데이터타입의 형태로 바꿀 수 있게 도와주는 클래스 
		//모든 기본형 데이터 타입은 Wrapper Class를 가지고 있음 .
		
		String pie ="3.14";// + 10 더하고싶음 
		// String + 다른 변수 = String (문자열의 연결, 결합) 
		// "3.14" + 10 = "3.1410"
		System.out.println(pie+10); 				//	"3.1410"
		double dPie = Double.parseDouble(pie);		//	boxing
		System.out.println(dPie+10);				// 	13.14
		// 기본형 타입은 전체가 Wrapper Class를 하나씩 가지고 있음 
		// 해당하는 기본형 타입으로 다시바꾸기 위해서 (String) : 산술연산을 하기 위해서 
		
		
	}//main()
}//class
