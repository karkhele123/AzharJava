import java.util.Scanner;
class CovertFeetMeter
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the feet value ft");
double num1 =sc.nextDouble();
double num2 = 0.305;
double num= num2 * num1;
System.out.println("convert the feet to  - " +num+ " meter ");
}
}