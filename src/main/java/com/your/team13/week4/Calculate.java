package com.your.team13.week4;
public class Calculate { // ��길!
	Customer customer;

	public Calculate() {
		this.customer = new Customer("������", "����", "3/20", new Gold(), 3, 480);
	}

	public double total_rate() {
		double sum = 0;
		// sum = sum + c.plan.getBasic_monthly_rate();
		if (customer.plan instanceof Gold) {

		} else if (customer.plan instanceof Silver) {

		}

		return sum;
	}
	
	public double famliy_discount(){
		return 0;
	}

}