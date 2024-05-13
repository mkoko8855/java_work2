package com.kosta.sample.json;

import java.util.HashMap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTest {

	public static void main(String[] args) {
		
		//API -> https://javadoc.io/doc/com.fasterxml.jackson.core/jackson-databind/latest/index.html
		
		
		//보면서해볼래? -> https://github.com/FasterXML/jackson-databind/
		
		
		//EmpVO(버전1) 스트링을 EmpVO로.
		String jsonStr = "{\"ename\":\"smith\", \"empno\":\"7733\", \"sal\":\"600\"}";
		
		
		
		
		//HashMap(버전2) 스트링을 해쉬맵으로.
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("ename", "smith");
		map.put("empno", "7733");
		map.put("sal", "600");
		
		ObjectMapper objectMapper = new ObjectMapper();                
		String studentJson = null;
		try {
			studentJson = objectMapper.writeValueAsString(map);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}         
		System.out.println(studentJson); 
		
		/*
		try {

            Map<String, String> map = mapper.readValue(json, Map.class);

            //Map<String, String> map = mapper.readValue(json, new TypeReference<Map<String, String>>() {});

            System.out.println(map);

        } catch (IOException e) {
            e.printStackTrace();
        }
		*/
		
		
//      또는
//		try {
//			System.out.println(objectMapper.writeValueAsString(map));
//		} catch (JsonProcessingException e) {
//			e.printStackTrace();
//		}
		
		
		
		
		//바뀐 맵을 다시 String으로 바꾸기.
		ObjectMapper objectMapper1 = new ObjectMapper();                
		HashMap<String, String> map1 = new HashMap<String, String>();
		String str = "{\"ename\":\"smith\", \"empno\":\"7733\", \"sal\":\"600\"}";
		
		try {
			map1 = objectMapper1.readValue(str, HashMap.class);
			System.out.println(map1);
			//{ename=smith, empno=7733, sal=600}
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
