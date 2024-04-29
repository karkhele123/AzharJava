import java.util.Scanner;
class EvenOrOdd
{
public static void main(String[]args)
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter the number");
int num =sc.nextInt();
System.out.println((num%2==0)?num+ "Number is even":num+ "Number is odd");
}
}