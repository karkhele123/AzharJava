import java.util.Scanner;
class EligibleMarryingGf
{
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your Age ");
	int age = sc.nextInt();
	System.out.println(" Enter the Property ");
	double Property =sc.nextDouble();           
	// sc.nextLine(); // 1 option use nextLine()
	// Scanner sc1 = new Scannner(System.in);  // option 2  is create obj of Scanner class
	// sc.reset();  // 3 option reset the scanner object

	System.out.println("Enter your surname ");
	String surname = sc.next().toUpperCase();
	if ((age>=21 && Property>=10000000) || surname=="Ambani") {                 //surname.equals("Ambani")    // 4 option use equal to 
		System.out.println("Eligible for marrying ");
		
	}
	else{
		System.out.println("Not eligible for marrying");
	}
	}
}