import java.util.Scanner;
class CheakCharacter
{
public static void main(String[]args)
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter the value:");
char ch =sc.next().charAt(0);
if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
if(ch>='A' && ch<='Z')
{
System.out.println(" it is uppercase character ");
}
else
{
System.out.println("it is lowercase character");
}
else if(ch>='0' && ch<='9')
{
System.out.println("it is a digit");
}
else
{
System.out.println("it is special character");
}
}
}
