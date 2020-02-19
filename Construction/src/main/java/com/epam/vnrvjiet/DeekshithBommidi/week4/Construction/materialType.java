package com.epam.vnrvjiet.DeekshithBommidi.week4.Construction;

import java.util.*;
public class materialType {

	public int materialTypeFormats()
	{
		
		int d;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Standard Material : 1200 Rupees only");
		System.out.println("2.Above Standard Material : 1500 Rupees only");
		System.out.println("3.High Standard Material : 1800 Rupees only");
		System.out.println("4.High Standard Material and Fully Automated Home : 2500 Rupees only");
		System.out.print("Choose One of the Material Standard:");
		d=sc.nextInt();
		System.out.println();
		sc.close();
		return d;

	}
}
