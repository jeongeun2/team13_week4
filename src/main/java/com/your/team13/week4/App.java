package com.your.team13.week4;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {

		String plan;
		int calltime;
		int line_number;

		Calculate calculate = new Calculate();

		Scanner sc = new Scanner(System.in);

		System.out.println("Plan : ");
		plan = sc.next();

		if (plan.equals("Gold")) {
			Gold gold = new Gold();
		} else if (plan.equals("Silver")) {
			Silver silver = new Silver();
		}

		System.out.println("총사용시간 : ");
		calltime = sc.nextInt();

		System.out.println("사용회선 : ");
		line_number = sc.nextInt();

		sc.close();

		System.out.println("금액 : " + calculate.total_rate());
	}
}
