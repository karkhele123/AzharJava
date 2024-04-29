import java.util.Scanner;
class PallindromeNameString
{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the name");
	String name =sc.next();
	String  revname="";
	for(int i=name.length()-1;i>=0;i--)
	{
	   revname += name.charAt(i);
	}
	System.out.println((revname.equals(name))?name +" pallindrome": name + " not a pallindrome");
	}
}
 



 // Assingment

 // you have to print a diamond
 // you haVE TO print a perament 
 // you have to print forword perament

