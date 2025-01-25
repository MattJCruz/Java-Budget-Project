import java.util.Scanner;
import java.util.ArrayList;


public class Budget {
 
 static double payRate;
 static double hours;
 static double income = 1;

 static double tax;
 static double taxRate = 0.0765;
 static double monthlyExpenses;
 //Make tax rate final constant.
/*
 ArrayList<double> expAmt = new ArrayList<double>();
 ArrayList<String>  expName = new ArrayList<String>;
 
 Figure out how to store collected data, and subsequently collect/extract from it.
 
 Start program listing current info and ask if any changes need to be made.
 
 Remind user of recurring charges.
*/


 public static void main(String[] args) {
  Scanner kb = new Scanner(System.in);

  while (income > 0)
  {
   System.out.println("Enter payrate.");
   payRate = kb.nextDouble();
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
   System.out.print("Your gross weekly income is: ");
   System.out.printf("%,.2f\n", income);
   System.out.print("Yearly, this is: ");
   System.out.printf("%,.2f\n", (income*52));
   System.out.println("Your net weekly income is: ");
   System.out.printf("")
   System.out.print("Yearly, this is: ")  }
 }
}