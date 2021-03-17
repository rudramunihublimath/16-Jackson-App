package com.io.domain;

public class Student {
	private Integer StuId;
	private String StuName;
	private Integer StuAge;
	
	
	
	public Student() {
		
	}
	public Student(Integer stuId, String stuName, Integer stuAge) {
		super();
		StuId = stuId;
		StuName = stuName;
		StuAge = stuAge;
	}
	public Integer getStuId() {
		return StuId;
	}
	public void setStuId(Integer stuId) {
		StuId = stuId;
	}
	public String getStuName() {
		return StuName;
	}
	public void setStuName(String stuName) {
		StuName = stuName;
	}
	public Integer getStuAge() {
		return StuAge;
	}
	public void setStuAge(Integer stuAge) {
		StuAge = stuAge;
	}
	@Override
	public String toString() {
		return "Student [StuId=" + StuId + ", StuName=" + StuName + ", StuAge=" + StuAge + "]";
	}
	
	

}
