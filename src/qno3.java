import java.util.Scanner;
public class qno3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of the cricle");
		double pi=3.14;
		double radius =input.nextDouble();
		double perimeter_of_circle=2*pi*radius;
		System.out.println("The perimeter of the cricle is "+perimeter_of_circle);
	}

}
