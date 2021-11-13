
public class arrayrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arra=new String[10];
		reverse(arra);
	}
	public static void reverse(String[] array) {
		if (array==null || array.length<2) {
			return;
		}
		for (int i=0;i<=array.length/2;i++) {
			String temp=array[i];
			array[i]=array[array.length-1-i];
			array[array.length-1-i]=temp;
		}
			
	}
}
