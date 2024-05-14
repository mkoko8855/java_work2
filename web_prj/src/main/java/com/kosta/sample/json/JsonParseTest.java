package com.kosta.sample.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

//강사님 코드 전문 -> 3가지 방식
public class JsonParseTest {
	
	
	String jsonStr = "{"
            + "\r\n"
            + "  \"elements\":"
            
            + "[\r\n"
            + "    {\"profile_nickname\":\"사랑하는 아내♥️\",\r\n"
            + "    \"profile_thumbnail_image\":\"\",\r\n"
            + "    \"id\":\"149xxxx378\",\r\n"
            + "    \"uuid\":\"Q3JAcUxxxxxUp6T3sd\",\r\n"
            + "    \"favorite\":true}\r\n"
            + "],\r\n"
            
            + "\r\n"
            + "  \"total_count\":1,\r\n"
            + "  \"after_url\":null,\r\n"
            + "  \"result_id\":\"zbnYtNxxxxxpdPgCA\",\r\n"
            + "  \"favorite_count\":1\r\n"
            + "}";
	
	public static void main(String[] args) {
		
		
		
		
		String jsonStr = "{\"elements\":[{\"profile_nickname\":\"사랑하는 아내♥\",\"profile_thumbnail_image\":\"\",\"id\":\"149..xxx...378\",\"uuid\":\"Q3JAcU..xxxxxx.Up6T3sd\",\"favorite\":true}],\"total_count\":1,\"after_url\":null,\"result_id\":\"zbnYtN-...xxxxx...pdPgCA\",\"favorite_count\":1}";
		
		
		
		
		//SIMPLE JSON은 너무 심플해서 쓰기엔 드물다. 기능적으로는 절대 좋지 않음.
		JSONObject obj = new JSONObject();
		JSONParser p = new JSONParser(); 
		try {
			HashMap<String,String> map2 = new HashMap<String,String>();
			p.parse(jsonStr);
		  //map2 = (HashMap<String,String>)p.parse(jsonStr); 원랜 이렇게도 담았는데, 위에 Array라는 배열안에 있기 때문에..제일큰 타입인 JsonObject으로 올라가자 그래서 해쉬맵이 아닌 JsonObejct 로하자
			obj = (JSONObject)p.parse(jsonStr); 
			JSONArray elementsArray = (JSONArray) obj.get("elements"); // []가꺼내짐 -> 이 한줄 코드가 중요함
            JSONObject elementObject = (JSONObject) elementsArray.get(0); // {}가꺼내짐
            String nick = (String) elementObject.get("profile_nickname");
            String id = (String) elementObject.get("id");
            String uuid = (String) elementObject.get("uuid");
            Long total  = (Long)obj.get("total_count");
            //타입궁금하면 ("total_count").getClass(); 하면됨
            System.out.println(nick + "\t" + id + "\t" + uuid + "\t" + total);
              
		} catch (ParseException e) {
			System.err.println("str --> map convert 에러");
			e.printStackTrace();
		}
		
		
		
		
		
		
		//HashMap : str --> HashMap
		//JACKSON을 쓰는 방식이다.
		//jackson-databind-2.1x.jar 
		ObjectMapper mapper = new ObjectMapper(); 
		try {
			HashMap map = mapper.readValue(jsonStr, HashMap.class); //글자를 맵으로 읽어줘 -> 맵으로 뱉어준다
			//System.out.println("jackson:" + map);
			ArrayList<HashMap<String, Object>> elementsList = (ArrayList<HashMap<String, Object>>) map.get("elements"); //map.get으로 맵에서 꺼내와! -> elements라는 arraylist가 뱉어진다. -> 그 뱉은놈을 arraylist 안에 {} 라는 map 들어있으니 arraylist안에 제네릭으로 map을 써줬다. 그 안에 ture라는 불리언도 있어서, 키밸류를 String, Object로 썼다.
			String nick = (String)elementsList.get(0).get("profile_nickname");
			String id = (String)elementsList.get(0).get("id");
			String uuid = (String)elementsList.get(0).get("uuid");
			Integer total = (Integer)map.get("total_count");
			System.out.println(nick + "\t" + id + "\t" + uuid + "\t" + total);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		//HashMap : str --> HashMap
		//class DataVO
		mapper = new ObjectMapper(); 
		try {
			DataVO dvo = mapper.readValue(jsonStr, DataVO.class);
			Element[] elements = dvo.getElements();
			for(Element e : elements) {
				String nick = e.getProfile_nickname();
				String uuid = e.getUuid();
				String id   = e.getId();
				int total   = dvo.getTotal_count();
				System.out.println(nick + "\t" + id + "\t" + uuid + "\t" + total);
			}
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
}
			
//          향상for문말고 일반포문으로 이런식도가능
//			for(int i=0; i<elements.length; i++) {
//				String nick = elements[i].getProfile_nickname();
//			}




// --------------------------------------------------------------
class DataVO {
    private Element[] elements;
    private int total_count;
    private String after_url;
    private String result_id;
    private int favorite_count;

    public Element[] getElements() {
        return elements;
    }

    public void setElements(Element[] elements) {
        this.elements = elements;
    }

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public String getAfter_url() {
        return after_url;
    }

    public void setAfter_url(String after_url) {
        this.after_url = after_url;
    }

    public String getResult_id() {
        return result_id;
    }

    public void setResult_id(String result_id) {
        this.result_id = result_id;
    }

    public int getFavorite_count() {
        return favorite_count;
    }

    public void setFavorite_count(int favorite_count) {
        this.favorite_count = favorite_count;
    }

}
//--------------------------------------------------------------
class Element {
    private String profile_nickname;
    private String profile_thumbnail_image;
    private String id;
    private String uuid;
    private boolean favorite;

    public String getProfile_nickname() {
        return profile_nickname;
    }

    public void setProfile_nickname(String profile_nickname) {
        this.profile_nickname = profile_nickname;
    }

    public String getProfile_thumbnail_image() {
        return profile_thumbnail_image;
    }

    public void setProfile_thumbnail_image(String profile_thumbnail_image) {
        this.profile_thumbnail_image = profile_thumbnail_image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}


