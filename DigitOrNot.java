//wajp to check number digit or not 

import java.util.Scanner;
class DigitOrNot
{
    public static void main(String[] args) 
{
  Scanner sc= new Scanner(System.in);
System.out.println("Enter the character");
char ch =sc.next().charAt(0);
System.out.println((ch>=48&&ch<=57)?"it is a digit":"it is not a digit");
}
} 