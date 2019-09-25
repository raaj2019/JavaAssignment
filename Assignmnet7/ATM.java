import java.io.IOException;
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the ATM Card Number");
		String n1=s.nextLine();
		ATMValidation atm = new ATMValidation();
		atm.loadFileInMap();
		if(atm.validateATM(n1)){
		System.out.println("Please choose the action you want to do..");
		System.out.println("Press 1 to View Balance " );
		System.out.println("Press 2 to Withdraw " );
		System.out.println("Press 3 to Deposit " );
		System.out.println("Press 4 to Exit " );
		
		Scanner trans = new Scanner(System.in);
		int procs = trans.nextInt();
		
		switch(procs)
		{
		case 1:
			atm.Viewbalance(n1);
		case 2:
			atm.Withdraw(n1);
		}
	
	}
	else
	{
		System.out.println("INvalid Card");
	}
	}
}
