import java.util.Scanner;


public class tuition {

	public static void main(String[] args) {

				Scanner input = new Scanner(System.in);
				System.out.println("Give a number form 0 to infinity, i.e. 5% = 5 ");
				
				System.out.println("Enter tuition amount for your first year at UD. ");
				double base = input.nextDouble(); // Taking variable for initial tuition cost

				System.out.println("Enter the percentage increase for tuition.");
				double PER_INC = (input.nextDouble())/100; // Taking variable for percent increase of tuition for second year at UD
				
				input.close();

				double[] ar = new double[4]; 
				 
				 for (double d : ar) { 
				 sum += d; 
				 } 

				for(int x=0; x<4; x++ ){
					ar.set(0) += base + base*PER_INC;
					System.out.println(base);
				}
				
			

				
				System.out.printf("Total tuition payemnt for 4 years is $%.2f", base);
		

	}

}
