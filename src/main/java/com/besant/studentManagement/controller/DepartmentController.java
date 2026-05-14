package com.besant.studentManagement.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.besant.studentManagement.Department;

@RestController
public class DepartmentController {
	
	@GetMapping("/getDept")
	public List<Department> getDept(){
		List<Department> lists = new ArrayList<>();
		lists.add(new Department(101, "CS", "CS101", "Chandan"));
		lists.add(new Department(103, "IS", "IS102", "Irfan"));
		lists.add(new Department(105, "EC", "EC103", "Meena"));
		lists.add(new Department(102, "EEE", "EEE104", "Sanju"));
		lists.add(new Department(104, "Civil", "Cv105", "Sam"));
		return lists;
	}
	
	@GetMapping("/getDeptList")
	public Map<Integer, Department> getDeptList(){
		Map<Integer, Department> dept = new HashMap<>();
		dept.put(1, new Department(201, "AI", "AI201", "Adi"));
		dept.put(2, new Department(202, "Bio", "B202", "BHoomi"));
		dept.put(3, new Department(203, "Robotics", "R203", "Ram"));
		return dept;	
	}
	
	@GetMapping("/getStd")
	public int[] getStd() {
		return new int[] {15,25,35,45,50};
		
	}
}
