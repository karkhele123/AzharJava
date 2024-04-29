//wajp to find the data is alphabet is char or not and if alphabet its lowercase and uppercase alphabet

import java.util.Scanner;
class AlphabetLowerUppercase
{
public static void main(String []args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the character");
char ch= sc.next().charAt(0);


/*if(ch>=65&&ch<=90)
{
System.out.println(" it is uppercase alphabet ");
}
else
{
System.out.println("it is lower case alphabet");
}*/

System.out.println(((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))?((ch>='A'&&ch<='Z')?"Uppercase Alphabet":"Lowercase Alphabet"):"Not a Alphabet");

}
}

