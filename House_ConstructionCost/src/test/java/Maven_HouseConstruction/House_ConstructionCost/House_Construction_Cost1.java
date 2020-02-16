package Maven_HouseConstruction.House_ConstructionCost;

import java.util.Scanner;

import org.junit.Test;

public class House_Construction_Cost1 {
	@Test
	public void HouseConstructionCost(){
		double area_of_house,standard_material_cost;
		double house_construction_cost;
		Scanner sc=new Scanner(System.in);
		
		System.out.format("%s","Enter area_of_house(in square feet)\n");
		area_of_house=sc.nextDouble();
		
		System.out.format("%s", "Entert cost of standard material for house construction per square feet from below options\n");
		System.out.format("%s","1200INR for standard materials\n");
		System.out.format("%s","1500INR for above standard materials\n");
		System.out.format("%s","1800INR for high standard material\n");
		System.out.format("%s","2500INR for high standard material and fully automated home\n");
		standard_material_cost=sc.nextDouble();
		
		house_construction_cost=(area_of_house)*(standard_material_cost);
		System.out.format("%s : %.2fINR ","House_construction_cost",house_construction_cost);
		
	}
}

