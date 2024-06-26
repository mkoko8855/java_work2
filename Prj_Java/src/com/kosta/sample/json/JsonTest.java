package com.kosta.sample.json;



public class JsonTest {

	public static void main(String[] args) {
			    //맵의 간단한 꺼내는 연습
		
				//String str = "";
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
				(위 방식X 아래 새로운 방식있음!!!!!!!!!!!!!!)
				*/
						
				
				//파일들을 IT 안의 새로운 파일 하나 etc-jar 같은거 만들어주고 집어넣자
			    //Prj_Java 우클릭, 프로퍼티스 빌스 패쓰 -> 클래스 패쓰에 2개 다운받은거 추가해줘.
				//simple json api doc 검색 후,
		        //https://javadoc.io/doc/org.bspfsystems/simple-json/latest/index.html
		        //이거 들어와서 좌측에 JSONObejct들어가서 찾아보면서 해도 됨.
		
				
				//다음은 Jackson 방법이다
		        //java jackson doc 검색 후,
		        //https://github.com/FasterXML/jackson-docs 깃에 있긴하네!
		        
		
				//우리 잘못준비했다.
		        //etc-jar 파일에 json-provider로 준비했는데..
		        //json-binder를 써야한다.
		        //https://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.1.4/ 에서 jar다운받자
		        //그리고 https://mvnrepository.com/artifact/org.json/json 와서
		        //JSON.simple이 아닌 그냥 JSON In Java 들어가서 20131013 클릭 후, 뷰올 클릭 후, jar 다운받자
		        //json-20231013-javadoc.jar 이것도 같이 클릭해주자.
		        //3개를 다운받고, 다시 etc-jar에 집어넣고 Prj_Java 클릭 후, 프로퍼티즈에서 원래 있던거 삭제 후 새로운 3개를 외부add 해주자.
		        //그리고 simple-1.1.1 까지는 기본적인걸로 연습할꺼니까 이것도 넣어주자!
		
				
				//simper json doc으로 연습해보자
				//이제 남의꺼 API쓸 수 있는데,
				//근데 임포트가 안되네..? 하지말자..
				//VO클래스 만들어서 다른거하러가자
				
				
		
		
		
		
		
		
		
				
				//HashMap<String, String> emp = new HashMap<String, String>();
	
				
				
				
	
	}

}
