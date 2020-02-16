package Maven_HouseConstruction.House_Construction_Cost;

import java.util.Scanner;

import org.junit.Test;

public class HouseConstructionCost {
	@Test
	public void house_Construction_Cost(){
		double area_of_house;
		Scanner sc=new Scanner(System.in);
		
		System.out.format("%s","Enter area_of_house(in square feet)\n");
		area_of_house=sc.nextDouble();
		
		System.out.format("%s", "Select cost of standard material for house per square feet construction\n");
		System.out.format("%s","1 : 1200INR for standard materials\n");
		System.out.format("%s","2 : 1500INR for above standard materials\n");
		System.out.format("%s","3 : 1800INR for high standard material\n");
		System.out.format("%s","4 : 2500INR for high standard material and fully automated home\n");
	    int choice=sc.nextInt();
	    if (choice>=1 && choice<5) {
	    	double[] house_construction_cost ={
	    		area_of_house*1200,
	    		area_of_house*1500,
	    		area_of_house*1800,
	    		area_of_house*2500
	       };
		   System.out.format("%s : %.2fINR\n ","House_Construction_Cost",house_construction_cost[choice-1]);   //House_Construction_Cost upto 2 decimal point
	    }
	    else {
	        System.out.format("Invalid Choice\n"); 	
	    }
	}
}
