import java.util.Scanner;

public class findODDorEvenNumbers {

	public static void main(String[] args)
	{
		Scanner readinput = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int input = readinput.nextInt();
		
		if (input%2==0)
		{
			System.out.println("Given number " + input + " is Even");
		}
		else
		{
			System.out.println("Given number " + input + " is ODD");
		}
		
		
		// TODO Auto-generated method stub

	}

}
