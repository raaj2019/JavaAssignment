import java.util.Random;
import java.util.Scanner;

public class createTicket {
	 String status;
	 String ttype;
	 String tdesc;
	 String resolution;
	 
	 public String getStatus() {
		 
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTtype() {
		return ttype;
	}

	public void setTtype(String ttype) {
		this.ttype = ttype;
	}

	public String getTdesc() {
		return tdesc;
	}

	public void setTdesc(String tdesc) {
		this.tdesc = tdesc;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public int getTick() {
		return tick;
	}

	public void setTick(int tick) {
		this.tick = tick;
	}

	Random rand = new Random();
	 int tick = rand.nextInt(1000);
	 
	public  void ticke()
	{
		Scanner tictype = new Scanner(System.in);
		Scanner ticdesc = new Scanner(System.in);
		
		System.out.println(" Enter Ticket Type ");
		String ttype = tictype.next();
		this.setTtype(ttype);
		System.out.println("Enter the Description of the ticket");
		String tdesc = ticdesc.next();	
		this.setTdesc(tdesc);
		System.out.println("Ticket Number is:="+tick);

	
	}
	public void printt()
	{
		System.out.println("Status is:"+status);
		System.out.println("Ticket Type is:"+ttype);
		System.out.println("Descrption is:"+tdesc);
		//System.out.println("Resolution is:"+resolution);
		
	}
}
