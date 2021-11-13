import java.util.Scanner;
public class qno4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num =input.nextInt();
		if (num<0)
		{
			System.out.println("The number is negative");
		}
		else if(num>0)
		{
			System.out.println("THE Number is positive");
		}
		else
		{
			System.out.println("The number is zero");
		}
	}

}
