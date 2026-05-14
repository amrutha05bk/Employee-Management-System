package com.besant.studentManagement.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.besant.studentManagement.Student;

//controller class is used to control request and response
@RestController // This annotation is used to make the class controller class
public class StudentController {

	//With return type String
	// @RequestMapping("/getMessage")
	@GetMapping("/getMessage")//endpoint name/unique resource identifier
	public String getMessage() {
		return "Hello SpringBoot";
	}
	
	//With return type Int
	@GetMapping("/getvalue")
	public int getvalue() {
		return 100;
	}
	
	//With return type array
		@GetMapping("/getNames")
		public String[] getNames() {
		    return new String[] {"Ramya", "Rahul", "Priya", "Kiran"};
		}
		
		//With return type arrayList
		@GetMapping("/getNum")
		public ArrayList<Integer> getNum() {
			ArrayList<Integer> arr = new ArrayList<Integer>();
			arr.add(50);
			arr.add(70);
			arr.add(90);
			arr.add(10);
			arr.add(30);
			return arr;
		}
	
		//With return type Map
		@GetMapping("/getEmployee")
		public Map<Integer, String> getEmployee(){
			Map<Integer, String> m = new HashMap<Integer, String>();
			m.put(101, "Sarita");
			m.put(102, "Ranju");
			m.put(103, "Raj");
			m.put(104, "Akul");
			m.put(105, "Akash");
			return m;
		}
		
		//With object
		@GetMapping("/getStudent")
		public Student getStudent(){
			Student s = new Student(101, "Sanjana", 75); 
			return s;
			
		}
}
