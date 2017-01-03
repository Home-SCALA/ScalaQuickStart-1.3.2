package com.learning.java.classobj;

/* Java: перегрузка (overloaded) конструктора */

public class CashFlow {
	private final Double amt;
	private final String curr;

	public CashFlow(Double amt, String curr) {
		this.amt = amt;
		this.curr = curr;
	}
	
	public CashFlow(Double amt) {
		this(amt, "INR");
	}
	
	public CashFlow(String curr) {
		this(0.0, curr);
	}

	public Double getAmount() {
		return amt;
	}
	
	public String getCurrency() {
		return curr;
	}

	public static void main(String[] args) {
		CashFlow cf = new CashFlow(500.0);

		System.out.println( "Amount = " + cf.getAmount() );
		System.out.println( "Currency: " + cf.getCurrency() );
	}
}
