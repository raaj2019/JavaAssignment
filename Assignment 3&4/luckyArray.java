
public class luckyArray 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int a[] = {1,2,3,4,5,5};
		
		//int len =a.length; 
		int repet=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					repet++;
					}
			}
		
		}
		if (repet>=1)
		{
			System.out.println("Un Lucky");
			}
		else
		{
			System.out.println("Lucky");
		}
	}
}