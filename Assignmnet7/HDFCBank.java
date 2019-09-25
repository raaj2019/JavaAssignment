
public class HDFCBank extends Bank {
	int serviceCharge=8;	
	
	public int getServiceCharge() {
		return serviceCharge;
	}
	public void setServiceCharge(int serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	int charge= 10;
	public void getInterest() {
		System.out.println(super.i);
		System.out.println(i);
		System.out.println("interest rate is 10% for HDFS Bank ");
	}
}
