import java.util.Scanner;
class StringCharStore
{
public static void main(String []args)
{
Scanner sc =new Scanner (System.in);
System.out.println("Enter 1st string");
String a = sc.next();
System.out.println("a - "+a);
sc.nextLine();
System.out.println("Enter 2nd string");
String b= sc.nextLine();
System.out.println("b - "+b);
System.out.println("Enter the character ");
char ch = sc.next().charAt(0);
System.out.println("ch - " +ch);
}
}