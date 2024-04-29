import java.util.Scanner;
class LargestNum3
{
public static void main(String[]args)
{
Scanner sc= new Scanner (System.in);
/*int num1 =1 ;
int num2=5;
int num3 =7;*/


System.out.println("Enter the num1");
int num1=sc.nextInt();
System.out.println("Enter the num2 ");
int num2=sc.nextInt();
System.out.println("Enter the num3");
int num3= sc.nextInt();


System.out.println((num1<num2)?((num1<num3)?(num1):(num3)):((num2<num3)?(num2):(num3)));
}
}