package com.besant.studentManagement;

public class Student {
	private int stdId;
	private String stdNames;
	private int marks;
	
	public Student(int stdId, String stdNames, int marks) {
		super();
		this.stdId = stdId;
		this.stdNames = stdNames;
		this.marks = marks;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdNames() {
		return stdNames;
	}

	public void setStdNames(String stdNames) {
		this.stdNames = stdNames;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
}
