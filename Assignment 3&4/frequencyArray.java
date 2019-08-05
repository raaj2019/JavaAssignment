import java.util.Scanner;

public class frequencyArray {

	public static void main(String[] args) {
		System.out.println("Please enter input to check the frequency");
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		
		String charOne = N.substring(0,1);
		int initialFreq=0;
		boolean flag=true;
		
		for (int i = 0;i< N.length(); i++) {
			String char1 = N.substring(i, i+1);	
			int freqTrac=0;
			for (int j = 0;j<N.length();j++) {
				String char2 = N.substring(j,j+1);
				
				if((i==0)&& (charOne.equalsIgnoreCase(char2))) {
							initialFreq++;
				}		
				if (char1.equalsIgnoreCase(char2)) {
					freqTrac++;
				}
			}
			if (initialFreq != freqTrac) {
				flag = false;
				break;
			}


		}
		 String out = (flag) ?  "YES" : "NO";
		 System.out.print(out);
			
		
	}

}
