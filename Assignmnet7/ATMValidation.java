import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ATMValidation {
	
	//LinkedHashMap<Integer,String> map=new LinkedHashMap<>();
	//CardDetails cd = new CardDetails();
	Map<String, CardDetails> carddet = new LinkedHashMap<String, CardDetails>();
	
	
	public void loadFileInMap() throws IOException
	{
		String fileName = "c:/Selenium/atmDetails.txt";
		File file = new File(fileName);
		FileReader fr = new FileReader(file);
						
		 try
	        {
	          BufferedReader br = new BufferedReader(fr);
	          String line;
	          String[] values;
	          //int[] value1=null;
	          line = br.readLine();
	            while(line != null)
	            {
	            	CardDetails cd=new CardDetails();
	                values = line.split(",");
	                cd.setCardNum(values[0]);
	                cd.setName(values[1]);
	                cd.setBankName(values[2]);
	                cd.setBalance(Double.parseDouble(values[3]));
	                carddet.put(values[0] , cd);
	                	                
	                line = br.readLine();
	                
	            }
	            System.out.println(carddet);
	            
	        }
	        catch (FileNotFoundException e)
	        {
	      e.printStackTrace();
	        }
	        catch (IOException e)
	        {
	        e.printStackTrace();
	      }
		
		
	}
	public boolean validateATM(String atmnum){
		return carddet.containsKey(atmnum);
	}
	public void Viewbalance(String atmnum)
	{
		CardDetails cd = carddet.get(atmnum);
		
		//return cd.getBalance();
		System.out.println(
				"\n Balance of ATM Number " + atmnum + " is: Rs." + cd.getBalance() + "\n");
		//break;
	}
	public void Withdraw(String atmnum)
	{
		System.out.println("Enter the amount you want to withdraw: ");
		Scanner amt = new Scanner(System.in);
		double wamount = amt.nextDouble();
		CardDetails cd = carddet.get(atmnum);
		double balance =0;
		int sr =0;
		//double balance = Double.parseDouble(cd.getBalance());
		if(carddet.containsKey(atmnum));
		{
			balance = cd.getBalance();

			switch (cd.getBankName()) 
			{
			case "HDFC":
				sr = new HDFCBank().getServiceCharge();
				break;
			case "ICICI":
				sr = new ICICIBank().getServiceCharge();
				break;
			case "SBI":
				sr = new SBIBank().getServiceCharge();
				break;
			case "AXIS":
				sr = new AXISBank().getServiceCharge();
				break;
				
			default:
				System.out.println("No service charge");
			}
					
		if((wamount+sr)<= balance)
		{
			balance = balance - wamount-sr ;
			cd.setBalance(balance);
			System.out.println("Current Balance is:" + balance);
		}
		else
		{
			System.out.println("Insuficient Fund...!!");
			
		}
		//break;
		}
	}
	
}
