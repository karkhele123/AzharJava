import java.util.Scanner;
class CalculateIntrest
{
public static void main(String[]args)
{
Scanner sc =new Scanner(System.in);
System.out.println(" Enter the balance");
double balance = sc.nextDouble();
System.out.println(" intrest rate ");
double intrestRate= sc.nextDouble();
double intrest = balance*(intrestRate/1200);
System.out.println(intrest);
}
}


