package com.epam.vnrvjiet.DeekshithBommidi.week4.Interests;

import java.util.Scanner;

//import java.util.Scanner;

public class SimpleInterest {

			public void calculateSimpleInterest()
			{
				Scanner sc = new Scanner(System.in);
				double totalAmount,initialAmount,rateOfInterest;
				double noOfMonths;
				YearsFunction calcYears=new YearsFunction();
				System.out.println("Enter the Amount:");
				initialAmount=sc.nextDouble();
				System.out.println("Enter the Rate Of Interest(in percentage):");
				rateOfInterest=sc.nextDouble();
				System.out.println("Enter the Number Of Months:");
				noOfMonths=sc.nextInt();
				double Years=calcYears.noOfYears(noOfMonths,12);
				totalAmount=((initialAmount*rateOfInterest*Years)/100);
				System.out.println("Interest Amount after Simple Interest  for " +noOfMonths+ " months is:"+totalAmount);
				double result=totalAmount+initialAmount;
				System.out.println("Total Amount after Simple Interest for " +noOfMonths+ " months is:"+result);
				sc.close();
			}
}
