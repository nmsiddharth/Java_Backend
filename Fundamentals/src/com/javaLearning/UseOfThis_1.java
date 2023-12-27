package com.javaLearning;


class StudentInfo{
	int studentId; 
	String studentName;
	
	public StudentInfo(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public String toString() {
		return "Student ID : "+studentId+ "\nStudent Name : "+studentName;
	}
}

public class UseOfThis_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo obj = new StudentInfo(101,"Siddu");
		System.out.println(obj);

	}

}
