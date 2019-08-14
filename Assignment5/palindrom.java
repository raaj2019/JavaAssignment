import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner readinput = new Scanner(System.in);
		System.out.println("Enter the String:");
		String input = readinput.next();
		char[] strArray = input.toCharArray();
		int stringCount = input.length();
		String reverse = "";
		for(int i=stringCount-1;i>=0;i--)
		{
		reverse+=strArray[i];
		}
		
		System.out.println("String Reverse is :" + reverse );
		
		if(reverse.equalsIgnoreCase(input))
		{
			System.out.println(reverse +": is Palindrom");
			
		}
		else
		{
			System.out.println(reverse + ": is not a Palindrom");
		}
	}

}
