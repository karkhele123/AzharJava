import java.util.Scanner;
class CheakVowels
{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the name : ");
String name=sc.next().toLowerCase();
char ch =name.charAt(0);
System.out.println("Hi my name is "+name+  " and my first character is - " );
if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
{
System.out.println("character"  +ch+ " is vowel.");
}
else
{
System.out.println("character" +ch+ "is a consonent ");
}
}
}