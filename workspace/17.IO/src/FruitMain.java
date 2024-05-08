import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import com.hanul.fruit.FruitDAO;
import com.hanul.fruit.FruitDTO;

public class FruitMain {
	public static void main(String[] args) {
		try {
			//파일 입력(fruit.txt)을 위한 준비단계
			String inputPath = "D:\\Study_Java\\workspace\\17.IO\\fruit.txt";
			FileReader fr = new FileReader(inputPath);
			BufferedReader br = new BufferedReader(fr);
			
			//열려진 파일의 내용을 읽어서 저장할 변수를 초기화
			//TAB으로 split()한 후, FruitDTO(com.hanul.fruit package) 객체 생성
			//ArrayList<FruitDTO> fruit 컬렉션 배열 저장
			String line = null;
			FruitDTO dto = null;
			ArrayList<FruitDTO> fruit = new ArrayList<FruitDTO>();
			while((line = br.readLine()) != null) {
				String[] sp = line.split("\t");
				String name = sp[0];
				int cost = Integer.parseInt(sp[1]);
				int qty = Integer.parseInt(sp[2]);
				dto = new FruitDTO(name, cost, qty);
				fruit.add(dto);
			}//while
			
			//FruitDAO 객체를 생성(fruit<> 매개변수로 전달)하고 메소드 호출
			FruitDAO dao = new FruitDAO(fruit);
			dao.getPrice();
			dao.priceDescSort();
			dao.display();
			dao.fileSave();
			
			//스트림 종료
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}//try	
	}//main()
}//class
