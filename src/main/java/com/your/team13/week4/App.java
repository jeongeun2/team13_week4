package com.your.team13.week4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		String input_plan;
		int calltime;
		int line_number;
		
		Plan plan = null;
		Calculate calculate;
		Customer customer;

		Scanner sc = new Scanner(System.in);

		System.out.print("Plan : ");
		input_plan = sc.next().toLowerCase();

		if (input_plan.equals("gold")) {
			plan = new Gold();
		} else if (input_plan.equals("silver")) {
			plan = new Silver();
		}

		System.out.print("총사용시간 : ");
		calltime = sc.nextInt();

		System.out.print("사용회선 : ");
		line_number = sc.nextInt();

		sc.close();
		
		customer = new Customer(plan, calltime, line_number);
		calculate = new Calculate(customer);

		System.out.println("금액 : " + calculate.total_rate());
	}
}
