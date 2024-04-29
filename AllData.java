import java.util.Scanner;
class AllData
{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the Byte value");
byte a= sc.nextByte();
System.out.println("a - " +a);
System.out.println("Enter the short value");
short b =sc.nextShort();
System.out.println("b - "+b);
System.out.println("Enter the Int value");
int c= sc.nextInt();
System.out.println("c - "+c);
System.out.println("Enter the Long value");
long d= sc.nextLong();
System.out.println("d - "+d);
System.out.println("Enter the float value");
float e= sc.nextFloat();
System.out.println("e - "+e);
System.out.println("Enter the double value");
double f= sc.nextDouble();
System.out.println("f - "+f);
System.out.println("Enter the char value ");
char ch =sc.next().charAt(0);
System.out.println("ch - "+ch);
System.out.println("Enter the Boolean value");
boolean h = sc.nextBoolean();
System.out.println("h - "+h);
System.out.println("Enter the 1st string");
String i= sc.next();
System.out.println("i - "+i);
/*sc.nextLine();
System.out.println("Enter the 2nd string");
String j=sc.nextLine();
System.out.println("j - "+j);*/
}
}



