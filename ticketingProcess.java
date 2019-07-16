import java.util.Scanner;

public class ticketingProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		System.out.println("Press 1 to Enter ticketing system" );
		System.out.println("Press 2 to close application" );
		int type = a.nextInt();
		
		
		if(type == 1)
		{
			
			Scanner b =  new Scanner(System.in);
			System.out.println("Press 1 to Create New Ticket: ");
			int ticket = b.nextInt();			

			switch(ticket)
			{
			case 1: 
				
				createTicket c = new createTicket();
				c.ticke();
				c.setStatus("New");
				String sta = c.getStatus();
				System.out.println("Status is: "+sta);
				
				Scanner ent = new Scanner(System.in);
				
				System.out.println("Enter the 1 to approve or 2 to Reject the ticket");
				int ticket1 = ent.nextInt();
					
				if(ticket1==1)
				{
				//createTicket ct = new createTicket();
				c.setTick(c.tick);
				int gt =c.getTick();
				System.out.println("Ticket Number is "+ gt);
				c.setStatus("Approved");
				c.printt();
				
				Scanner cls = new Scanner(System.in);
				System.out.println("Press 1 to close 2 to cancel");
				int close = cls.nextInt();
				
				if(close==1)
				{
					c.setTick(c.tick);
					int gt1 =c.getTick();
					System.out.println("Ticket Number is "+ gt1);
					c.setStatus("Closed");
					c.printt();
					c.setResolution("Closing the ticket after fixing the code");
					String res=c.getResolution();
					System.out.println("Resolution is :"+res);
				}
				else if(close==2)
				{
					System.out.println("Canceling the Ticket");
				}
				}
				else if(ticket1==2)
				{
					System.out.println("Ticket is Rejected");
				}
			
							
			}
		}
		else
		{
			System.out.println("Exit From the system");
			System.exit(0);
		}
		}

}
