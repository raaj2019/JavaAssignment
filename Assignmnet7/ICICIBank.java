
public class ICICIBank extends Bank {
	int serviceCharge=12;	;
	public int getServiceCharge() {
		return serviceCharge;
	}
	public void setServiceCharge(int serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	public void getInterest() {
		System.out.println("interest rate is 7% for ICICI Bank");
	}
}