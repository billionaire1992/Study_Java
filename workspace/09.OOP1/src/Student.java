import java.text.DecimalFormat;

public class Student {
	//멤버 변수 선언
	String name ;
	int kor, eng, mat, sum;
	double avg;
	
	//총점을 계산하는 멤버 메소드를 정의
	public void getSum() {
		sum = kor + eng + mat;
		
	}//getSum
	//평균을 계산하는 멤버 메소드를 정의
	public void getAvg() {
		//avg = sum / 3; 				//정수값만 출력
		//avg = (double) sum /3;			//나눗셈은 double 캐스팅 
		avg = sum / 3.0 ;
	}//getAvg
	//출력하는 멤버 메소드를 정의 : 평균은 소수 둘째 자리까지 표시
	public void display() {
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("총점 : " + sum);
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("평균 : " + df.format(avg));
	}//display
}//class
