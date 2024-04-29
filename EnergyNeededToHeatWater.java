import java.util.Scanner;
class EnergyNeededToHeatWater
{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the amount of water in kilogram : ");
double M =sc.nextDouble();
System.out.println("Enter the initial Temperature : ");
double initialTemperature =sc.nextDouble();
System.out.println("Enter the final Temperature : ");
double finalTemperature = sc.nextDouble();
double Q = M *(finalTemperature - initialTemperature) * 4184;
System.out.println(" the energy needed is - " + Q + " joules ");
}
}