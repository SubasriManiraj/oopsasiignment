package assignment5;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("85000");
	}
	public static void main(String[] args) {
		AxisBank details=new AxisBank();
		details.saving();
		details.fixed();
		details.deposit();
		
	}
	

}
