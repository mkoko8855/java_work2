package com.kosta.sample.json;

import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;



class MyJsonParseTest {
    public String profile_nickname;
    public String id;
    public String uuid;
    public int total_count;

    
    public MyJsonParseTest(String profile_nickname, String id, String uuid, int total_count) {
        this.profile_nickname = profile_nickname;
        this.id = id;
        this.uuid = uuid;
        this.total_count = total_count;
    }
}


public class JsonParseTest1 {

	public static void main(String[] args) {
		
		/*
		     {
  "elements":[
    {"profile_nickname":"사랑하는 아내♥️",
    "profile_thumbnail_image":"",
    "id":149..xxx...378,
    "uuid":"Q3JAcU..xxxxxx.Up6T3sd",
    "favorite":true}
  ],

  "total_count":1,
  "after_url":null,"result_id":"zbnYtN-...xxxxx...pdPgCA","favorite_count":1  
		  
		  /*
		  
		   */
		 
		String jsonStr = "{"
	            + "\r\n"
	            + "  \"elements\":"
	            + "[\r\n"
	            + "    {\"profile_nickname\":\"사랑하는 아내♥️\",\r\n"
	            + "    \"profile_thumbnail_image\":\"\",\r\n"
	            + "    \"id\":\"149xxxx378\",\r\n"
	            + "    \"uuid\":\"Q3JAcUxxxxxUp6T3sd\",\r\n"
	            + "    \"favorite\":true}\r\n"
	            + "  ],\r\n"
	            + "\r\n"
	            + "  \"total_count\":1,\r\n"
	            + "  \"after_url\":null,\r\n"
	            + "  \"result_id\":\"zbnYtNxxxxxpdPgCA\",\r\n"
	            + "  \"favorite_count\":1\r\n"
	            + "}";
		  
		
		try {
            JSONObject jsonObject = new JSONObject(jsonStr);

            JSONArray elementsArray = jsonObject.getJSONArray("elements");
            JSONObject elementObject = elementsArray.getJSONObject(0);

            String profile_nickname = elementObject.getString("profile_nickname");
            String id = elementObject.getString("id");
            String uuid = elementObject.getString("uuid");
            int total_count = jsonObject.getInt("total_count");
            System.out.println(elementObject.toString());
            
            System.out.println("1111111111111111111111111");
//            MyJsonParseTest myJsonParseTest = new MyJsonParseTest(profile_nickname, id, uuid, total_count);
//            
//            System.out.println("profile_nickname" + ":" + myJsonParseTest.profile_nickname);
//            System.out.println("id" + ":" + myJsonParseTest.id);
//            System.out.println(myJsonParseTest.uuid);
//            System.out.println(total_count);
//            
            JSONObject Jsonover = new JSONObject();
            Jsonover.put("profile_nickname", profile_nickname);
            Jsonover.put("id", id);
            Jsonover.put("uuid", uuid);
            Jsonover.put("total_count", total_count);

            System.out.println(Jsonover.toString());
            
            
            
//            MyJsonParseTest myJsonParseTest = new MyJsonParseTest(profile_nickname, id, uuid, total_count);
//
//            System.out.println(myJsonParseTest.profile_nickname);
//            System.out.println(myJsonParseTest.id);
//            System.out.println(myJsonParseTest.uuid);
//            System.out.println(myJsonParseTest.total_count);

        } catch (JSONException e) {
            e.printStackTrace();
        }
		  //profile_nickname, id, uuid, total_count 뽑기
//		try {
//			
//			JSONParser jsonParser = new JSONParser();
//			JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonStr);
//			JSONArray Array = (JSONArray) jsonObject.get("elements"); //엘리먼츠 배열 추출할것
			
//			ObjectMapper mapper = new ObjectMapper();
//			
//            JSONObject jsonObject = new JSONObject(jsonStr);
//            JSONParser parser = new JSONParser();
//            list = map.get("elements”);
//            JSONArray jsonObject1 = jsonObject1.get("elements");
//            String id = elementObject.getString("id");
//        } catch (JSONException e) {
 //           e.printStackTrace();
 //       } catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		  
		  
		
		  
		
	}

}
