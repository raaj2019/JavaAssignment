
public class AXISBank extends Bank{
		
	int serviceCharge=10;	
	public void getInterest() {
			System.out.println("interest rate is 7% for ICICI Bank");
			
		}
	public int getServiceCharge() {
		return serviceCharge;
	}
	public void setServiceCharge(int serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	}

