import java.util.Scanner;
class ComputingBmi
{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
final double  POUND_TO_KG = 0.45359237;
final double  INCHES_TO_METER = 0.0254;
System.out.println("Enter weight in pounds :");
double pound = sc.nextDouble();
System.out.println("Enter the height in inches :  ");
double inches = sc.nextDouble();
double weightkg = pound * POUND_TO_KG ;
double heightMeter = inches * INCHES_TO_METER ;
double bmi = weightkg/(heightMeter*heightMeter);
System.out.println("computing Bmi is " +bmi);
}
}

































































































