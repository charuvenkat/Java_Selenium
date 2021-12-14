package week3.day1;

public class AxisBank extends BankInfo  {


	public void deposit() {
	
	System.out.println("Deposit overidden");
	}
	
	public static void main(String[] args) {
		AxisBank bi=new AxisBank();
		bi.deposit();
		bi.saving();
		bi.fixed();
	}
	

}
