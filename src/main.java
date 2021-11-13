
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee("jungey",36);
		department d=new department("envio",e);
		System.out.println(d.getDepartment_name()+" Emplyoee is "+d.gete().getName());
	}

}
