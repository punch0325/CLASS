package test200722;

public class BankDTO {
	
	private int costomerNum;
	private String costomerName;
	private String accountNum;
	private int balance;
	private int pw;
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	
	BankDTO(){
		
	}
	public BankDTO(int costomerNum, String costomerName, String accountNum, int balance, int pw) {
		super();
		this.costomerNum = costomerNum;
		this.costomerName = costomerName;
		this.accountNum = accountNum;
		this.balance = balance;
		this.pw = pw;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public int getCostomerNum() {
		return costomerNum;
	}
	public String getCostomerName() {
		return costomerName;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public int getBalance() {
		return balance;
	}
	public int getPw() {
		return pw;
	}
	public void setCostomerNum(int costomerNum) {
		this.costomerNum = costomerNum;
	}
	public void setCostomerName(String costomerName) {
		this.costomerName = costomerName;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void setPw(int pw) {
		this.pw = pw;
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Override
	public String toString() {
		return "¹øÈ£ " + costomerNum + " [ÀÌ¸§:" + costomerName + ", °èÁÂ:" + accountNum
				+ ", ÀÜ¾×:" + balance + "¿ø]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
