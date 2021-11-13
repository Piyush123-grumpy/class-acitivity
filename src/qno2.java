import java.util.Scanner;
public class qno2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius :");
		double radius = input.nextDouble();
		double pi=3.14;
		double area_of_circle=pi*radius*radius;
		System.out.println("The area of circle is "+area_of_circle);
	}

}
