import java.util.Random;
import java.util.Scanner;
public class qno5 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i=1;
		while (i<=5)
		{
		Random rand =new Random();
		Scanner input=new Scanner(System.in);
		int a= rand.nextInt(3);
		System.out.println("Enter 0 for rock ,1 for paper and 2 for scissor");
		int b=input.nextInt();
		
		if (a==0)
		{
			if (b==0)
			{
				System.out.println("Draw comptuer chose rock");
			}
			else if(b==1)
			{
				System.out.println("Computer loss computer chose rock");
			}
			else
			{
				System.out.println("Computer won computer chose rock");
			}
		}
		else if (a==1)
		{
			if (b==0)
			{
				System.out.println("comptuer won chose paper");
			}
			else if(b==1)
			{
				System.out.println("Draw computer chose paper");
			}
			else
			{
				System.out.println("Computer loss computer chose paper");
			}
		}
		else
		{
			if (b==0)
			{
				System.out.println("comptuer won chose scissors");
			}
			else if(b==1)
			{
				System.out.println("Computer loss computer chose scissors");
			}
			else
			{
				System.out.println("draw computer chose scissors");
			}
		}	
		i++;
		}
	}
}
			
