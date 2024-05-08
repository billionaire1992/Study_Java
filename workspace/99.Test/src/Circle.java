import java.text.DecimalFormat;
import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("반지름을 입력하세요 :");
	int radius = Integer.parseInt(scanner.nextLine());	
	scanner.close();	
		
	CircleExam exam = new CircleExam(radius);
	double result = exam.getArea();
	
	
	DecimalFormat df = new DecimalFormat("0.00");
	
	
	System.out.println("반지름 : " + radius);
	System.out.println("원의 넓이 : " + df.format(result) );
	
	}//main()
}//class
