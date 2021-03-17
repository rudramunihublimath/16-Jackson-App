package com.io.convertors;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.io.domain.Student;

public class JsonSerializer {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		
		Student s= new Student();
		s.setStuId(1);
		s.setStuName("Rudra");
		s.setStuAge(34);
		
		// Converting java obj to json data 
		ObjectMapper mapper =new ObjectMapper();
		String s1 = mapper.writeValueAsString(s); 
		System.out.println(s1);
		
		 

	}

}
