import java.util.Scanner;
class FuturInvestment
{
public static void main(String[]args)
{
Scanner sc= new Scanner (System.in);
System.out.println("Enter the invesrment amount");
double Ia = sc.nextDouble();
System.out.println("Enter the annual rate");
double AIR = sc.nextDouble();
System.out.println("Number of year");
double NY = sc.nextDouble();
double fiv= Ia + ((Ia /100) *4.25)*NY;
System.out.println(fiv);
}
}