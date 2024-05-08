import java.util.ArrayList;

//interface ?
//WEB - 대규모 프로젝트에서 개발설계도 목적으로 만듦
// 안드 ☆★ - 감시자 역할 버튼을 누르거나 화면에 어떤처리를 했을때 감시하다가 
//개발자에게 어떤 이벤트가 발생했는지를 다시 넘겨줌  보고함 

public interface Ex06_TestInterFace {
	//미리 메소드를 정의 
	//그 메소드를 상속받아 어려 개발자가 개발을 함 
	// SELECT 검색이나 어떤 데이터를 조회할 때 사용함 
	//구글 검색 - int 와 Integer 차이
	//SELECT * from TABLE Where col Like'%int와Integer차이%'
	
	public ArrayList<String> select();   //정의
	
	
	public boolean insert();
	
	public boolean update();
	
	public boolean delete();
	
	
	
	
	
}
