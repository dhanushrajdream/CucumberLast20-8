package com.Api;

import java.io.File;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json_Parser_Example {
	
	public static void main(String[] args) throws IOException, ParseException {
		
		
		//file reader connect
		
		File f = new File("C:\\Users\\Admin\\eclipse second\\Maven_Cucumber\\src\\test\\java\\com\\Api\\Body.json");
		
		FileReader fr = new FileReader(f);
		
		//file read over
		
		JSONParser json = new JSONParser();
		
		Object obj = json.parse(fr);   //liking json parse and filreader
		
		JSONObject jsonobj = (JSONObject) obj; //narrow type casting
		
		Object value = jsonobj.get("job");
		
		System.out.println(value);
	
	}

}
