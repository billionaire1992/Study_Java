import java.io.BufferedReader;
import java.io.FileReader;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class GwangjuBusJsonMain {
	public static void main(String[] args) {
		GwangjuBusJsonMain main = new GwangjuBusJsonMain();
		String jsonData = main.getJsonData();
		//System.out.println(jsonData);
		
		JSONArray array = JSONArray.fromObject(jsonData);
		for(int i = 0; i < array.size(); i++) {
			JSONObject object = array.getJSONObject(i);
			GwangjuBusDTO dto = (GwangjuBusDTO) JSONObject.toBean(object,GwangjuBusDTO.class);
			System.out.println("노선번호 : " + dto.getLINE_NUM());
			System.out.println("출발지 : " + dto.getDIR_UP_NAME());
			System.out.println("도착지 : " + dto.getDIR_DOWN_NAME());
			System.out.println("=======================================");
		}
	}//main()
	
	//gjBus.json 파일의 내용을 읽어서 JSON 구조 형태로 만드는 메소드
	public String getJsonData() {
		String jsonData = "";
		try {
			FileReader fr = new FileReader("gjBus.json");
			BufferedReader br = new BufferedReader(fr);
			
			while(true) {
				String line = br.readLine();			
				if(line == null) {
					break;
				}//if
				jsonData += line;
			}//while
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jsonData;
	}//getJsonData()
	
	
	
	
}//class
