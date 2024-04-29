import java.util.Scanner;
class CheckVowels1
{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the character");
String name=sc.next().toLowerCase();
char ch =name.charAt(0);
if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
{
System.out.println(" it is vowels");
}
else
{
System.out.println(" it not a consonent ");
}
}
}