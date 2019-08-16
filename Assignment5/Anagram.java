import java.util.Scanner;


public class Anagram {

	public static void main(String arg[]){

		Scanner sc =new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		int i,j;

		boolean Flag=true;
		i=str1.length();
		j=str2.length();


		if(i==j){
		for(int m=0;m<i;m++){
		    for(int n=0;n<i;n++){
		        if(str1.charAt(m)==str2.charAt(n)){
		           Flag=true;
		           break;
		          }
		          else
		          Flag=false;
		    }
		}
		}
		else{
		Flag=false;
		}

		if(Flag)
		System.out.println("String is Anagram");
		else
		System.out.println("String is not Anagram");
		}

}

