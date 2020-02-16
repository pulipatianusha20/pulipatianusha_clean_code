package Maven_Intrest.Simple_Compound_Intrest;

import java.util.Scanner;

import org.junit.Test;

public class simpleCompound_Intrest {
	@Test
	public void  simple_compound() {
		double priniple_amount,rate_of_interest,time;
		double amount=0,rate=1;
		double simp1e_Interest;
		double compound_Interest;
		
		Scanner sc=new Scanner(System.in);
		System.out.format("%s","Enter principle_amount\n");	
		priniple_amount=sc.nextInt();
		
		System.out.format("%s", "Enter rate_of_interest");
		rate_of_interest=sc.nextInt();
		
		System.out.format("%s","Enter time\n");
		time=sc.nextInt();
		
		//simple interest calculation
		
		simp1e_Interest=((priniple_amount)*(rate_of_interest)*(time))/100;
		System.out.format(" Simple_Interest : %.3f\n",simp1e_Interest );        // simp1e_Interest upto 3 decimals
		
		//compound interest calculation
		
		rate_of_interest=1+(rate_of_interest/100);
		for(int i=1;i<=time;i++) {
			rate*=rate_of_interest;
		}
		amount=priniple_amount*rate;
		compound_Interest=amount-priniple_amount;
		
		System.out.format(" compound_Interest : %.3f\n",compound_Interest);     //compound_Interest upto 3 decimals
	}
}
