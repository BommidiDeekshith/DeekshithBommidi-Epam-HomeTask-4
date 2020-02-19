package com.epam.vnrvjiet.DeekshithBommidi.week4.Interests;
import java.util.*;
public class InterestsMain {
	public static void main(String[] args)
	{
		SimpleInterest calcSimpleInterest=new SimpleInterest();
		CompoundInterest calcCompoundInterest=new CompoundInterest();
		int d;
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the Operation:Simple(0)/Compound(1)");
			d=sc.nextInt();
			if(d==0)
			{
				calcSimpleInterest.calculateSimpleInterest();
			}
			else if(d==1)
			{
				calcCompoundInterest.calculateCompoundInterest();
			}
			else
			{
				System.out.println("Choose one of the above methods only");
			}
		}
		finally
		{
			
		}
		sc.close();
	}

}
