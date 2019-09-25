import java.util.LinkedHashMap;
import java.util.Map;

public class CardDetails {
	
	private String cardNum;
	private String name;
	private String bankName;
	private Double balance;
	
	
	
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	@Override
	public String toString() {
		return "CardDetails [cardNum=" + cardNum + ", name=" + name + ", bankName=" + bankName + ", balance=" + balance
				+ "]";
	}
	
	

}
