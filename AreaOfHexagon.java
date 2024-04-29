import java.util.Scanner;
class AreaOfHexagon
{
public static void main(String[]args)
{
Scanner sc= new Scanner (System.in);
System.out.println("Enter the area of hexagon");
double side = sc.nextDouble();
double area = (3*(1.73/2)*(side*side));
System.out.println(" the area of hexagon is - " +area);
}
}