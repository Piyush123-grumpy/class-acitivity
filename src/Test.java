import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter the base:");
    	float base=input.nextFloat();
    	System.out.println("Enter the height:");
    	float height=input.nextFloat();
    	float area_of_triangle=(base*height)/2;
    	System.out.println("The area of the triangle is "+area_of_triangle);
    	
    }
}