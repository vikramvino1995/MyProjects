package org.read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonRead {
	
	public static void main(String[] args) throws IOException, ParseException {
		
		// Json File 1
		
		FileReader read = new FileReader("C:\\Users\\hp\\eclipse-workspace\\API_Basics\\src\\test\\resources\\Req_Res\\MyJson.json");
		
		JSONParser jsonParse = new JSONParser();
		
		Object parse = jsonParse.parse(read);
		
		JSONObject o1 = (JSONObject)parse;
		
		Object data = o1.get("data");
		
		JSONArray o2 = (JSONArray)data;
		
		Object fourth = o2.get(3);
		
		JSONObject o3= (JSONObject)fourth;
		
		String fname = o3.get("first_name").toString();
		
		String id = o3.get("id").toString();
		
		System.out.println("Json File 1: FirstName: "+fname);
		
		System.out.println("Json File 1: Id: "+id);
		
		
		//Json File 2
		
		FileReader read2 = new FileReader("C:\\Users\\hp\\eclipse-workspace\\API_Basics\\src\\test\\resources\\Req_Res\\MyJson2.json");
		
		Object parse2 = jsonParse.parse(read2);
		
		JSONArray array = (JSONArray)parse2;
		
		Object first = array.get(0);
		
		JSONObject object1 =(JSONObject)first;
		
		Object array2 = object1.get("elements");
		
		JSONArray object3 =(JSONArray)array2;
		
		Object second = object3.get(0);
		
		JSONObject object4 =(JSONObject)second;
		
		Object array3 = object4.get("before");
		
		JSONArray object5 = (JSONArray)array3;
		
		Object object6 = object5.get(0);
		
		JSONObject object7 =(JSONObject)object6;
		
		Object object8 = object7.get("result");
		
		JSONObject object9 = (JSONObject)object8;
		
		String duration = object9.get("duration").toString();
		
		String status = object9.get("status").toString();
		
		System.out.println("Json File 2: Duration: "+duration);
		
		System.out.println("Json File 2: Status: "+status);
		
		
		
		
	}
}
