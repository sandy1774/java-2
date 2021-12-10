package com.training1;

import java.util.Scanner;

public class TestCurencyConvertor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double r=sc.nextDouble();
		CurrencyConvertor curcon=new CurrencyConvertor();
		System.out.println(curcon.dollorToInr(r));
		sc.close();
	}

}
