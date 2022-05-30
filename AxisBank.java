package week3.day1;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		
		System.out.println("Money 70000 diposit");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AxisBank AB = new AxisBank();
		
		AB.saving();
		
		AB.fixed();
		
		AB.deposit();
		
		BankInfo BI = new BankInfo();
		
		BI.deposit();
		
		

	}

}
