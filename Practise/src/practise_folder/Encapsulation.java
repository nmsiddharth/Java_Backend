package practise_folder;


class Employee{
	private int EmployeeId;
	private String EmployeeName;
	
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	@Override
	public String toString() {
		return "Employee = [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName +"]";
	}
	
	
}
public class Encapsulation {
	
	public static Employee getId(Employee [] arr, int id) {
//		
		for(int i=0;i<arr.length;i++) {
			if(id==arr[i].getEmployeeId()) {
				return arr[i];
			}
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.setEmployeeId(105);
		e1.setEmployeeName("SId");
		
		Employee e2 = new Employee();
		e2.setEmployeeId(106);
		e2.setEmployeeName("Siddu");
		
		Employee [] arr = new Employee[2];
		arr[0] = e1;
		arr[1]=e2;
		
		Employee obj = getId(arr,105);
		if(obj!=null) {
			//System.out.println(obj.getEmployeeId());
			System.out.println(obj);
		}else {
			System.out.println("Obj not found");
		}
		
		

	}

}
