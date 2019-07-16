import java.util.Scanner;

public class printDayusingSwitch {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the day : ");
		int day = input.nextInt();
		switch (day)
		{
		case 1:
			System.out.println("Day one is Monday");
			break;
		case 2:
			System.out.println("Day two is Tuesday");
			break;
		case 3: 
			System.out.println("Day three is Wednesday");
			break;
		case 4: 
			System.out.println("Day four is Thursday");
			break;
		case 5:
			System.out.println("Day five is Friday");
			break;
		case 6:
			System.out.println("Day six is Saturday");
			break;
		case 7:
			System.out.println("Day seven is Sunday");
			break;
		default:
			System.out.println("Day you entered you is out of range");
		}
	
		
	}

}
