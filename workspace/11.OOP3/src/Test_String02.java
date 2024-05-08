import java.util.Arrays;


public class Test_String02 {
	//TAB을 기준으로 문자열을 분리하고 리턴하는 메소드를 호출  : getSplit()	
	//리턴 받은 배열 (String[] fruit)을 출력하는 메소드를 호출  : display()
	//과일명의 내림차순으로 정렬한 후 출력하는 메소드를 호출 : nameDescSort(), display()
	
	public static void main(String[] args) {
		String str = "바나나\t오렌지\t청포도\t복숭아\t딸기";
		//String[] fruit = str.split("\t");
		//System.out.println("과일명 : "+ Arrays.toString(fruit));
		
		Test_String02 test = new Test_String02();
		String[] fruit = test.getSplit(str);
		test.display(fruit);
		test.display(test.getSplit(str));	
		test.nameDescSort(fruit);
		test.display(fruit);
	}//main()
	
	
	//문자열을 분리하고 리턴하는 메소드를 정의
	public String[] getSplit(String str) {
		//String[] fruit  = str.split("\t");
		//return fruit;
		return str.split("\t");
	}//getSplit()
	
	//출력 메소드를 정의
	public void display(String[] fruit) {
		System.out.println("과일명 : "+ Arrays.toString(fruit));
	}//display
	
	//과일명의 내림차순으로 정렬하는 메소드 정의  
	public void nameDescSort(String[] fruit) {
		for (int i = 0; i < fruit.length; i++) {
			for (int j = i + 1; j < fruit.length; j++) {
				//if(fruit [i] < fruit[j]) {	▶오류 : 문자열은 비교 연산자를 사용 할 수 없음 
					if(fruit[i].compareTo(fruit[j]) < 0) {
						String temp = fruit[i];
						fruit[i] = fruit[j];
						fruit[j] = temp;
					}//if
			}//for j
		}//for i
	}//nameDescSort()
	
	
	
	
	
	
	
	
	
	
}//class
