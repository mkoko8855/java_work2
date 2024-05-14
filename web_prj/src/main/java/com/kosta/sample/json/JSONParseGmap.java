package com.kosta.sample.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//구글GMAP
/*
{
	  "name"       : "KOSTA",
	  "id"         : "u0001",
	  "displayName": {
					  	"desc": "this is kosta",
					  	"code": "g01"
	                },
	  "types"      : ["type1","type2"],
	  "primaryType": "ptype"
	}
	*/

public class JSONParseGmap {

	public static void main(String[] args) {

		String jsonStr = "{\r\n" + "  \"name\": \"KOSTA\",\r\n" + "  \"id\": \"u0001\",\r\n"
				+ "  \"displayName\": {\r\n" + "  	\"desc\": \"this is kosta\",\r\n" + "  	\"code\": \"g01\"\r\n"
				+ "  },\r\n" + "  \"types\": [\"type1\",\"type2\"],\r\n" + "  \"primaryType\": \"ptype\"\r\n" + "}";

		ObjectMapper mapper = new ObjectMapper();
		try {
//				HashMap<String,Object> map = mapper.readValue(jsonStr, HashMap.class);
//				String id = (String)map.get("id");
//				ArrayList<String> types = (ArrayList<String>)map.get("types");
//				
//				HashMap<String,String> subMap = (HashMap<String,String>)map.get("displayName");
//				String code = subMap.get("code");
//				System.out.println("MAP:" + id + "," + code + "," + types);

			GmapVO vo = mapper.readValue(jsonStr, GmapVO.class);
			String id = vo.getId();
			List<String> types = vo.getTypes();

			DisplayNameVO subVO = vo.getDisplayName();
			String code = subVO.getCode();
			System.out.println("VO:" + id + "," + code + "," + types);

		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

	}

}

class GmapVO {
	private String name;
	private String id;
	private DisplayNameVO displayName;
	private List<String> types;
	private String primaryType;

	public GmapVO() {
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public DisplayNameVO getDisplayName() {
		return displayName;
	}

	public List<String> getTypes() {
		return types;
	}

	public String getPrimaryType() {
		return primaryType;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setDisplayName(DisplayNameVO displayName) {
		this.displayName = displayName;
	}

	public void setTypes(List<String> types) {
		this.types = types;
	}

	public void setPrimaryType(String primaryType) {
		this.primaryType = primaryType;
	}

}

class DisplayNameVO {
	private String desc;
	private String code;

	public DisplayNameVO() {
	}

	public String getDesc() {
		return desc;
	}

	public String getCode() {
		return code;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
