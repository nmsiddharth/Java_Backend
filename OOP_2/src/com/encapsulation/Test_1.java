package com.encapsulation;

class Student{                           // Model Class or Entity Class or POJO Class
	private int studentId;
	private String studentName;
	private int studentAge;
	private String courseEnrolled;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getCourseEnrolled() {
		return courseEnrolled;
	}
	public void setCourseEnrolled(String courseEnrolled) {
		this.courseEnrolled = courseEnrolled;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", courseEnrolled=" + courseEnrolled + ", getStudentId()=" + getStudentId() + ", getStudentName()="
				+ getStudentName() + ", getStudentAge()=" + getStudentAge() + ", getCourseEnrolled()="
				+ getCourseEnrolled() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
public class Test_1 {

	public static Student getStudentById(Student[] arr, int id) {
		for(int i=0;i<arr.length;i++) {
			if(id == arr[i].getStudentId()) {
				return arr[i];
			}
		}
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.setStudentId(107);
		s1.setStudentName("Siddu");
		s1.setStudentAge(23);
		s1.setCourseEnrolled("Java");
		
		Student s2 = new Student();
		s2.setStudentId(106);
		s2.setStudentName("Virat");
		s2.setStudentAge(25);
		s2.setCourseEnrolled("Python");
		
		Student s3 = new Student();
		s3.setStudentId(105);
		s3.setStudentName("Cristiano");
		s3.setStudentAge(30);
		s3.setCourseEnrolled("Ucl");
		
		Student[] arr = new Student[3];
		arr[0]= s1;
		arr[1]= s2;
		arr[2]= s3;
		
		Student obj = getStudentById(arr, 107);
		if(obj!=null) {
//			System.out.println(obj.getStudentId());
//			System.out.println(obj.getStudentName());
//			System.out.println(obj.getStudentAge());
//			System.out.println(obj.getCourseEnrolled());
			System.out.println(obj);
		}else {
			System.out.println("Student Not found");
		}
		

	}

}
