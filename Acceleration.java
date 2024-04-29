import java.util.Scanner;
class Acceleration
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the v0  Starting velocity in meter/second");
double v0 =sc.nextDouble();
System.out.println("Enter the v1 second velocity meter/second");
double v1 =sc.nextDouble();
System.out.println("Enter the t in second");
double t =sc.nextDouble();
double AverageAcceleration = v1-v0/t;
System.out.println("The AverageAcceleration is - "  +AverageAcceleration);
}
}