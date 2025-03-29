import java.util.Scanner;
import java.util.ArrayList;


public class BudgetConsolidation {

	static double payRate;
	static double hours;
	static double income = 1;

	static double tax;
	static double taxRate = 0.0765;
	static double rent;
	static double utilities;
	static double expenses;


	//static double expenses(){

	//}
//Make tax rate final constant.



	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		while (income > 0) {
//Data Collection
			System.out.print("Enter hourly payrate: ");
			payRate = kb.nextDouble();
			System.out.println("Enter hours worked: ");
			hours = kb.nextDouble();
			System.out.print("Enter a rent price:");
			rent = kb.nextDouble();

//Calculate hours worked. If hours worked is over 40, then subtract 40 from hours worked snd multiply it by time&1/2.
			income += payRate * hours;
			if (hours > 40) {
				income = ((hours - 40) * (payRate * 1.5) + (payRate * 40));
			} else {
				income = payRate * hours;
			}
			tax = income * taxRate;
//Calculate expenses and subtract them.

			System.out.print("Your gross weekly income is: ");
			System.out.printf("%,.2f\n", income);
			System.out.print("Yearly, this is: ");
			System.out.printf("%,.2f\n", (income * 52));
			System.out.println("Your net weekly income is: ");
			System.out.printf("%,.2f\n", (income - tax));
			System.out.print("Yearly, this is: ");
			System.out.printf("%,.2f\n", (income - tax) * 52);
		}
	}
}
//yearly income calculated in one loop, expenses another.
//to begin, pedefined costs such as rent and ut