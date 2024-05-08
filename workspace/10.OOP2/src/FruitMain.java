import com.hanul.fruit.FruitDAO;
import com.hanul.fruit.FruitDTO;

public class FruitMain {
	public static void main(String[] args) {
		
		 FruitDTO[] fruit = new FruitDTO[5];
		 fruit[0] = new FruitDTO("수박",9000, 4);
		 fruit[1] = new FruitDTO("포도",8500, 7);
		 fruit[2] = new FruitDTO("멜론",5000, 10);
		 fruit[3] = new FruitDTO("복숭아",2000, 15);
		 fruit[4] = new FruitDTO("사과",1000,8);
		
		
		 FruitDAO dao = new FruitDAO(fruit);
		 dao.getPrice();
		 dao.priceDescSort();
		 dao.display();
	
		
	}//main(
}//class
