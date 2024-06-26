package com.kosta.sample.json;

import java.util.HashMap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class JacksonTest {

	public static void main(String[] args) {
		/*
		   JSON <--> JAVA객체 변환 API
		   jackson-databind-2.1.x.jar (Apache2.0)
		 */

		
		//API -> https://javadoc.io/doc/com.fasterxml.jackson.core/jackson-databind/latest/index.html
		
		
		//보면서해볼래? -> https://github.com/FasterXML/jackson-databind/
		
		
		//구글API가 너도나도 쓸 수 있는 것이다.
		//외부API쓸땐, 프로젝트 우클릭 -> 프로퍼티즈 -> 자바빌드패쓰 -> 외부add -> 추가해주자!
		
		
		
		
		
		
		
		
		
		//EmpVO(버전1) 스트링을 EmpVO로.
		String jsonStr = "{\"ename\":\"smith\", \"empno\":\"7733\", \"sal\":\"600\"}";
		
		
		try {
            // JSON 문자열을 EmpVO 객체로 변환
            ObjectMapper mapper = new ObjectMapper();
            EmpVO emp = mapper.readValue(jsonStr, EmpVO.class);

            // 변환된 EmpVO 객체 출력
            System.out.println(emp.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		
		
		
		


		
		
		
		
		
		//HashMap(버전2) 스트링을 해쉬맵으로.
		
		ObjectMapper mapper = new ObjectMapper();
		EmpVO vo = null;
		try {
			vo = mapper.readValue(jsonStr, EmpVO.class);
			//확인해보자
			System.out.println(vo.getEname());
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		
		
		
		//또는
		/*
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
		*/
		
		
		//또는
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
		//위에 vo로 객체만들어놨지?
		
		//확인부터
		System.out.println(vo.toString());
		
		try {
			String jsonString = mapper.writeValueAsString(vo);
			System.out.println(jsonString);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		//또는
		/*
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
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//jackson Factory config .......JavaType
		//readValue(jsonStr, 제네릭효과);
		mapper = new ObjectMapper();
		try {
			//VO없으니 MAP으로.
			//컨버팅해서 HashMap에 넣어주자
			//HashMap<String, Object> map = mapper.readValue(jsonStr, HashMap.class); //VO없으니 해쉬맵쓰자 -> readvalue니 맵으로 준비하자
			HashMap<String, Object> map = mapper.readValue(jsonStr, new TypeReference<HashMap<String, Object>>(){});
			System.out.println(map.get("ENAME"));
		} catch(JsonMappingException e) {
			e.printStackTrace();
		} catch(JsonProcessingException e) {
			e.printStackTrace();
		}
		
		
		TypeFactory fact = mapper.getTypeFactory(); //해당하는 타입을 관리하기 위한 객체를 만들었고, 타입레퍼런스가 동작하면서 컨버팅 할 것이다.
		//변수 타입에 뭘 적더라도 타입레퍼런스가 컨버팅으로 자동변환해줄 것이다.
		//new TypeReference 부분이 제네릭이라고 생각해도된다.
		
		
		//HashMap<String, Object> map = mapper.readValue(jsonStr, new TypeReference<HashMap<String, Object>>(){});
		JavaType javaType = fact.constructType(EmpVO.class); //JavaType은 JSON의 최고 오브젝트다. -> VO클래스로 인스턴스를 만들고 중앙관리자가 EmpVO에 겟셋 할 수있는 객체를 뱉는다. 그걸 담아놓는 것이 JavaType이다.

		try {
			mapper.readValue(jsonStr, javaType);
			//동작이잘되는지 확인하려면?
			//EmpVO vo2 = mapper.readValue(jsonStr, javaType);
			//System.out.println(vo2.getEname());

		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

}
