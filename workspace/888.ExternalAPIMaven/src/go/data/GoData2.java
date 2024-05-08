package go.data;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.jsoup.Jsoup;

public class GoData2 {
	//https://api.odcloud.kr/api/15052408/v1/uddi:611c5470-ad94-49e8-8f72-973732c56304?page=1&perPage=10&serviceKey=IyZSWlpRs00%2Bv9Do6EvMIRvAE9EQdYoTFkVwEf0bkIWWyq5h3PrIfDOjk90a3BaZnsAfvoKvB6Zhx6WCT2UVoA%3D%3D
	public static void main(String[] args) {
		String url="https://api.odcloud.kr/api/15052408/v1/uddi:611c5470-ad94-49e8-8f72-973732c56304";
				
		try {
			String data = Jsoup.connect(url).data("page", "1").data("perPage", "10")
					.data("serviceKey", "IyZSWlpRs00+v9Do6EvMIRvAE9EQdYoTFkVwEf0bkIWWyq5h3PrIfDOjk90a3BaZnsAfvoKvB6Zhx6WCT2UVoA==")
					.timeout(10 * 1000)
					.userAgent("Chrome")
					.ignoreContentType(true)
					.execute()
					.body();
				System.out.println(data);
				JSONParser parser = new JSONParser();
				
				
				
				JSONObject jsonObj = (JSONObject) parser.parse(data);
				System.out.println("오브젝트" + jsonObj);
				JSONArray arr = (JSONArray) jsonObj.get("data");
				System.out.println(arr);
				System.out.println();
				//JsonArray의 모든 index에 접근 (모든 데이터 접근) 
				for (int i = 0; i < arr.size(); i++) {
					JSONObject dataObj = (JSONObject) arr.get(i);
					System.out.printf("%-11s\t%26s\t%10s\t%10s\t%10s\t%15s\n",dataObj.get("업소명"),dataObj.get("소재지(도로명)"),
					dataObj.get("경도"),dataObj.get("주취급음식"),dataObj.get("위도"),dataObj.get("전화번호"));					
					//System.out.printf(dataObj.get("업소명") +"\t");
					//System.out.printf(dataObj.get("소재지(도로명)") +"\t");
					//System.out.printf(dataObj.get("경도") +"\t");
					//System.out.printf(dataObj.get("주취급음식") +"\t");
					//System.out.printf(dataObj.get("위도") +"\t");
					//System.out.printf(dataObj.get("전화번호") +"\n");	
				}
 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//main
}//class
