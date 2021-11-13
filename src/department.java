
public class department {
	private String department_name;
	private Employee e;
	department(String department_name,Employee e){
		this.department_name=department_name;
		this.e=e;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public Employee gete() {
		return e;
	}
	public void sete(Employee e) {
		this.e = e;
	}
	
	
}
