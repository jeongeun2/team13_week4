package com.your.team13.week4;
public class Calculate { // 계산 !
	Customer customer;

	public Calculate(Customer customer) {
		this.customer = customer;
	}

	public double total_rate() {
		double sum = 0;
		
		if(this.isFamliy_discount()) {
			sum += customer.plan.getBasic_monthly_rate() + (customer.plan.additional_line_rate * 2) + ((customer.getLine_number() - 3) * 5);
		}
		else {
			sum += customer.plan.getBasic_monthly_rate() + (customer.plan.additional_line_rate * (customer.getLine_number() - 1));
		}
		
		if(this.isOverCalltime()) {
			sum += (customer.getCallTime() - customer.plan.getIncluded_minutes()) * customer.plan.getRate_per_excess_minutes();					
		}
		
		return sum;
	}
	
	public boolean isFamliy_discount(){
		if(customer.getLine_number() >= 4) {
			return true;
		}
		
		return false;
	}
	
	public boolean isOverCalltime(){
		if(customer.getCallTime() - customer.plan.getIncluded_minutes() > 0 ) {
			return true;
		}
		
		return false;
	}

}