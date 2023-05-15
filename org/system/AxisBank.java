package org.system;

public class AxisBank extends BankInfo {
    @Override
    public void deposit() {
    	super.deposit();
    	System.out.println("AxisBank Deposit");
    }
	public static void main(String[] args) {
	AxisBank bank = new AxisBank();
	bank.deposit();
	}

}
