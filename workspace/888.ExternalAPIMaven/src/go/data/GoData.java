package go.data;




import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import org.jsoup.Jsoup;


public class GoData {
	public static void main(String[] args) {
		//https://api.odcloud.kr/api/3082925/v1/uddi:eeb6164d-1dd7-4382-8a96-a6888185864a
		//?=&=&=
		String url ="https://api.odcloud.kr/api/3082925/v1/uddi:eeb6164d-1dd7-4382-8a96-a6888185864a?";
		try {
			String data = Jsoup.connect(url).data("page", "1").data("perPage", "10")
			.data("serviceKey", "IyZSWlpRs00+v9Do6EvMIRvAE9EQdYoTFkVwEf0bkIWWyq5h3PrIfDOjk90a3BaZnsAfvoKvB6Zhx6WCT2UVoA==")
			.timeout(10 * 1000)
			.userAgent("Chrome")
			.ignoreContentType(true)
			.execute()
			.body();
			System.out.println(data);
			// json  : key , value 가 중괄호 { , } ,  대괄호  [ , ] 
			// 중괄호 : Object ( Class ) 
			// 대괄호 : Array (여러 데이터를 표현 ) 
			// {  [  {}  ]  }
			
					
			JSONParser parser = new JSONParser();
			
			
			
			JSONObject jsonObj = (JSONObject) parser.parse(data);
			System.out.println("오브젝트" + jsonObj);
			JSONArray arr = (JSONArray) jsonObj.get("data");
			System.out.println(arr);
			System.out.println();
			//JsonArray의 모든 index에 접근 (모든 데이터 접근) 
			for (int i = 0; i < arr.size(); i++) {
				JSONObject dataObj = (JSONObject) arr.get(i);
				System.out.print(dataObj.get("연번") +"\t");
				System.out.print(dataObj.get("상 호") +"\t");
				System.out.print(dataObj.get("소재지") +"\n");
				
			}
			

			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//main()
	
	
}//class
