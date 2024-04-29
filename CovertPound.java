import java.util.Scanner;
class CovertPound
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the pound value ");
double num1 =sc.nextDouble();
double num2 = 0.454;
double num= num2 * num1;
System.out.println("convert the pound  to kilogram - "  +num1+ " pound is " +num+ " kilogram ");
}
}