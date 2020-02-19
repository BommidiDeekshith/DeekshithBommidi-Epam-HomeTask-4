package com.epam.vnrvjiet.DeekshithBommidi.week4.Construction;

public class CostCalculation {
	
	public long calculateCostOfLand(long landSize,int material)
	{
		switch(material)
		{
		case 1:return landSize*1200;
		case 2:return landSize*1500;
		case 3:return landSize*1800;
		case 4:return landSize*2500;
		default:System.out.println("Choose correct Option");
		}
		return 0;
	}
	
}
