package com.epam.vnrvjiet.DeekshithBommidi.week4.Interests;

import java.util.Scanner;

public class CompoundInterest {
	public void calculateCompoundInterest()
	{
		Scanner sc = new Scanner(System.in);
		double totalAmount,initialAmount,rateOfInterest;
		double noOfMonths;
		int compoundInterestMethod;
		YearsFunction calcYears=new YearsFunction();
		System.out.println("Enter the Amount:");
		initialAmount=sc.nextDouble();
		System.out.println("Enter the Rate Of Interest(In Percentage):");
		rateOfInterest=sc.nextDouble();
		System.out.println("Enter the Number Of Months:");
		noOfMonths=sc.nextDouble();
		System.out.print("Compound Interest Annually(0)/HalfYearly(1)/Quarterly(2):");
		compoundInterestMethod=sc.nextInt();
		double Years=12;
		switch(compoundInterestMethod)
		{
		case 0:Years=calcYears.noOfYears(noOfMonths,12);break;
		case 1:Years=calcYears.noOfYears(noOfMonths,6);break;
		case 2:Years=calcYears.noOfYears(noOfMonths,3);break;
		default:System.out.println("Enter correct Mode of Interest");
		}
		totalAmount=((initialAmount*Math.pow((1+rateOfInterest/100),Years)))-initialAmount;
		System.out.println("Interest Amount after Compound Interest  for " +noOfMonths+ " months is:"+totalAmount);
		double result=totalAmount+initialAmount;
		System.out.println("Total Amount after Compound Interest  for " +noOfMonths+ " months is:"+result);
		sc.close();
	}
};
