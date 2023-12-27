package com.javaLearning;

class Employee{
	int empId;
	String empName;
	String companyName;
	
	public Employee(int id, String name, String cmpName) {
		empId = id;
		empName = name;
		companyName = cmpName;
	}
	
	public String toString() {
		return "Id : "+empId+" Name: "+empName+" Company Name: "+companyName; 
	}
}
public class Constructor_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee s1 = new Employee(101,"Siddu","AUDI");
		System.out.println(s1);
		Employee s2 = new Employee(102,"Virat","Benz");
		System.out.println(s2);
		Employee s3 = new Employee(103,"DHoni","BMW");
		System.out.println(s3);
		

	}

}
