import java.util.ArrayList;

//설계도 . 인터페이스의 상속 
//extends( 클래스 ) , implements ( 인터페이스 )
//다중 상속 : x 	, 		o
public class Ex06_TestInterMain implements Ex06_TestInterFace{
	
	public static void main(String[] args) {
		
		
		
		
	}//main()

	@Override
	public ArrayList<String> select() {
		// 이 메소드를 호출하면 데이터가 5건이 들어있게 만들어보기 
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("1");
		arr.add("2");
		arr.add("3");
		arr.add("4");
		arr.add("5");
		
		return arr;
	}

	@Override
	public boolean insert() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}
}//class
