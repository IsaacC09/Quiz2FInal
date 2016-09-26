import java.util.Scanner;

public class tuition {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Give a number form 0 to infinity, i.e. 5% = 5 ");

		System.out.println("Enter tuition amount for your first year at UD. ");
		double base = input.nextDouble(); // Taking variable for initial tuition
											// cost

		System.out.println("Enter the percentage increase for tuition.");
		double PER_INC = (input.nextDouble()) / 100; // Taking variable for
														// percent increase of
														// tuition for each
					 									// year at UD

		input.close();

		double tuitionSum = base;

		for (int x = 0; x < 3; x++) {
			base += base * PER_INC;
			tuitionSum += base;
			System.out.println(base);
		}

		System.out.printf("Total tuition payemnt for 4 years is $%.2f", tuitionSum);

	}
}
