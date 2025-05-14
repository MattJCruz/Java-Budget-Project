import java.util.Scanner;
import java.util.ArrayList;


public class Budget {
	static double hours;
	static double grossIncome;
	static double taxedIncome;
	static double netIncome;

	static double tax;
	static double rent;
	static double utilities;
	static double expenses;

	//FINAL constant Amts. most likely.
	static double payRate = 13;
	static double taxRate = 0.0765;

	/*public static void getExpenses() {
		String cont = "y";
		Scanner exp = new Scanner(System.in);
		while (cont.equals("y") || cont.equals("Y")) {
			System.out.print("Enter an expense, i.e. a bill or weekly grocery trip: ");
			expenseNum.add(exp.nextDouble());
			System.out.print("Enter a name for this expense: ");
			expenseName.add(exp.nextLine());
			System.out.print("Add another expense? y/n");
			cont = exp.next();
		}
	}*/

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		do {
//Data Collection
			//System.out.print("Enter hourly payrate: ");
			//payRate = kb.nextDouble();
			System.out.println("Enter hours worked: ");
			hours = kb.nextDouble();
			//System.out.print("Enter a rent price:");
			//rent = kb.nextDouble();

//Calculate hours worked. If hours worked is over 40, then subtract 40 from hours worked snd multiply it by time&1/2.
			grossIncome += payRate * hours;
			if (hours > 40) {
				grossIncome = ((hours - 40) * (payRate * 1.5) + (payRate * 40));
			} else {
				grossIncome = payRate * hours;
			}
			tax = grossIncome * taxRate;

			System.out.print("Your gross weekly income is: ");
			System.out.printf("%,.2f\n", grossIncome);
			System.out.print("Yearly, this is: ");
			System.out.printf("%,.2f\n", (grossIncome * 52));
			System.out.println("Your net weekly income is: ");
			System.out.printf("%,.2f\n", (grossIncome - tax));
			System.out.print("Yearly, this is: ");
			System.out.printf("%,.2f\n", (grossIncome - tax) * 52);
			System.out.println("Enter a new income if you'd like. Otherwise, exit with \"o\".");
		} while (payRate > 0);

		String randomTex = "YOu guys can leave, now.";4
	}
}