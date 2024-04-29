import java.util.Scanner;
class Program1
{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the subtotal");
double subtotal =sc.nextDouble();
System.out.println("Enter the gratuityrate");
double gratuityrate =sc.nextDouble();
double gratuity = subtotal*(gratuityrate/100);
double total =subtotal+gratuity;
System.out.println("The gratuity is" +gratuity);
System.out.println("the total is "  +total);
}
}
