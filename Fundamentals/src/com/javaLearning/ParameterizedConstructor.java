package com.javaLearning;


class Student{
	 int studentId ;
	 String studentName;
	
	public Student(int id, String name) {
		studentId = id;
		studentName = name;
	}
	
//	public void getStudentDetails() {
//		System.out.println(studentId + studentName);
//	}
	
	public String toString() {
		return "Id : "+studentId+ " Name :"+studentName;
	}
}
public class ParameterizedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj1 = new Student(101,"Siddu");
//		obj1.getStudentDetails();
		System.out.println(obj1);
		
		Student obj2 = new Student(102,"Virat");
		//obj2.getStudentDetails();
		System.out.println(obj2);
		
	}

}
