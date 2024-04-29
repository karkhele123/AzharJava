import java.util.Scanner;
class FindingRunwayLength
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the the speed of velocity");
double v= sc.nextDouble();
System.out.println("Enter the acceleration ");
double a = sc.nextDouble();
double length = (v*v)/(2*a);
System.out.println("display the minimum runway length - " +length);
}
}