package com.epam.vnrvjiet.DeekshithBommidi.week4.Construction;
import java.util.*;
public class constructionCostMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		materialType materialTypeObject = new materialType();
		CostCalculation costCalculationObject = new CostCalculation();
		long landSize;
		System.out.print("Enter the size of Land in square meters:");
		landSize=sc.nextLong();
		System.out.println();
		
		System.out.println("Select Material Type:");
		int material=materialTypeObject.materialTypeFormats();
		long totalCost=costCalculationObject.calculateCostOfLand(landSize, material);
		System.out.println("The Total Cost Of Your Land according to Your Specification is : "+totalCost+" Rupees Only");
		sc.close();
	}

}
