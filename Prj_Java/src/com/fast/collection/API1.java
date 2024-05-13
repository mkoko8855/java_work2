package com.fast.collection;

import java.util.HashMap;

public class API1 {

	public static void main(String[] args) {
		
		//맵의 간단한 꺼내는 연습
		
		String str = "";
		//{"mykey", "111"}
		//String str = "{\"mykey\", \"111\"}"; 중간을 다음표로 인식해라
		//API를 부르고나면 JSON(MAP)모양의 String이 나한테 온다.
		//str.get("mykey"); 안된다. String으로 선언했으니
		//String으로 Map으로 캐스팅해야한다.
		
		//자바에서 String을 JSON으로 변환은 어떻게해?
		//흔한데 자바 자체에서는 없기에..간단한 방법은 다음과 같다.
		//라이브러리 MAVEN에서 해결하던가,
		
		//JSONObject jsonObejct = (JSONObject) parser.parse(str);
		//이렇게 문자열 파싱해도되고,
		
		//JSONParser jsonParser = new JSONParser();
		//JSONObject map = (JSONObejct) jsonParser.parse(strJson);
        //이렇게 쓰거나, 풀어서 쓰면
		
		//Object obj = jsonParser.parse(strJson);
		//JSONObject jsonObj = (JSONObejct) obj;
		//System.out.println();
		//이렇게 캐스팅 해도 된다.
		
		
		//또는 JackSon 방법인데, 스프링에서 가장 많이 쓴다.
		//ObjectMapper mapper = new ObjectMapper();
		//ParsingDto dto = mapper.readValue("UTF-8", HashMap.class);
		//이렇게 해도 됨
		
		
		/*
		이런류들의 API를 어떻게 구할까?
				
		구글에 mvnrepository 검색(메이븐 레파지토리) 들어가자.
		맨 위에 JSON 검색 후, 조회 수 많은 순으로 이용하자
		Jackson JAXRS: JSON(잭슨방식) 으로 클릭하여 들어가자
		2.15x에서 2.15.2를 클릭하자.
		스프링에선 Maven코드를 복붙하면 되는데 지금은 어떻게 할까?
		알아서 jar를 다운받아야 한다.
		View All 클릭 후, jackson-jaxrs-json-provider-2.15.2.jar 다운받자.
		
		그리고, java.simpler 들어가서 1.1.1 클릭 후, 
		View All 클릭 후, json-simple-1.1.1.jar 다운받자
		*/
				
				
				
				
				
		
		
		
		
		//HashMap<String, String> emp = new HashMap<String, String>();
		
		
		
		
		
	}

}
