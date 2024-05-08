import java.util.ArrayList;

import com.hanul.fruit.FruitDAO;
import com.hanul.fruit.FruitDTO;

public class FruitMain {
	public static void main(String[] args) {
		ArrayList<FruitDTO> fruit = new ArrayList<FruitDTO>();
		fruit.add(new FruitDTO("참다래", 2000, 26));	
		fruit.add(new FruitDTO("망고", 1000, 10));	
		fruit.add(new FruitDTO("체리", 8000, 15));	
		fruit.add(new FruitDTO("포도", 18000, 2));	
		fruit.add(new FruitDTO("토마토",900, 30));	
		fruit.add(new FruitDTO("파인애플", 7000, 5));	
		
		FruitDAO dao = new FruitDAO(fruit);
			
		dao.getPrice();
		dao.priceDescSort();
		dao.display();	
		dao.displayPrintf();
	}//main()
}//class
