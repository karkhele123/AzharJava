import java.util.Scanner;
class CostDriving 
{
	public static void main(String[] args) 
	{
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter  the Driving Distance");
	double DD = sc.nextDouble();
	System.out.println("Enter the miles of per gallon");
	double MPG =sc.nextDouble();
	System.out.println("Enter the price per gallon");
	double PPG = sc.nextDouble();
	double cod = DD/(MPG/PPG);
	System.out.println("  cost of driving - " +cod);
}
}