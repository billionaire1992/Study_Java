import java.util.ArrayList;

public class Ex04_JavaList {
	public static void main(String[] args) {
		//ArrayList int_list 만들고 1~100까지 저장하기 숫자만 
		//ArrayList<E> // Element 요소 어떤 타입으로 List 구조 (collection)
		ArrayList<Integer> int_list = new ArrayList<>();			
		for(int i = 1; i <= 100; i++) {
			int_list.add(new Integer(i));
		System.out.print(i);	
		}//for
		
		
		ArrayList<String> str_list = new ArrayList<String>();
			str_list.add("1");
		System.out.println(str_list);
		
		
		
	}//main()
}//class
