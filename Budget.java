import java.util.Scanner;
import java.util.ArrayList;


public class Budget {

	static double hours;
	static double income;

	static double tax;
	static double monthlyExpenses;


	static double payRate = 13;
	static double taxRate = 0.0765;
	//Make this category final constants.
/*
	ArrayList<double> expenseAmt = new ArrayList<double>();
	ArrayList<String>  expenseName = new ArrayList<String>;
*/


	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		do{
			System.out.println("Enter hours worked.");
			hours = kb.nextDouble();
			income += payRate * hours;
			if (hours > 40) {
				income = ((hours - 40) * (payRate * 1.5) + (payRate * 40));
			} else {
				income = payRate * hours;
			}
			tax = income * taxRate;

			//Calculate hours worked. If hours worked is over 40, then subtract 40 from hours worked snd multiply it by time&1/2.
			System.out.println("Your gross income is: " + income);

			System.out.println("Withholding tax, you're left with: " + (income - tax) + "\n");
		}while (income > 0);



	}
}
//run methods to collect and tally income and expense.

//determine whether a quantity is weekly or monthly and calculate accordingly.

//have the method procure a name and a quantity, put the results in a 2d array. to be extracted and tabulated. also list if monthly or weekly.

