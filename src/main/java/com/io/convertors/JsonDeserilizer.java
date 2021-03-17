package com.io.convertors;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.io.domain.Student;

public class JsonDeserilizer {
	
	// Convertin JSON data to Java obj
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException  {
		ObjectMapper mp= new ObjectMapper();
		Student obj =  mp.readValue(new File("student.json"), Student.class);
		System.out.println(obj);		
		
	}

}
