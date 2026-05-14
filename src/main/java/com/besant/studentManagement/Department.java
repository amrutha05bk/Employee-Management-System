package com.besant.studentManagement;

public class Department {
	private int deptId;
	private String deptName;
	private String courseCode;
	private String deptHod;
	
	public Department(int deptId, String deptName, String courseCode, String deptHod) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.courseCode = courseCode;
		this.deptHod = deptHod;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getDeptHod() {
		return deptHod;
	}

	public void setDeptHod(String deptHod) {
		this.deptHod = deptHod;
	}
	
	
}
