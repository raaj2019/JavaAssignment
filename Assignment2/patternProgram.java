import java.util.Scanner;

public class patternProgram 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner  tes = new Scanner(System.in);
		System.out.println("Enter the Number");
		int a = tes.nextInt();
		int c=1;int j=1; int f=1;
		for(int i=1;i<=a;i++)
		{
				System.out.print(i+ " ");
				if(c==f)
				{
					System.out.println();
					j=i;
					c++;
					f=0;
				}
				f++;
				if((a-j)<c)
				{
					System.exit(0);
				}
				
		}

	}
}