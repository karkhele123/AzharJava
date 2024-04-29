import java.util.Scanner;
class DrivingLicences
{
public static void main(String[] args) {
	Scanner  sc = new Scanner(System.in);
	System.out.print("Enter the age :");
	int age = sc.nextInt();
	if (age>=18) {
		System.out.print("have you given the test(yes/no):");
		String test = sc.next().toLowerCase();
		if(test.equals("yes"))
		{
			System.out.print("Enter your test marks :");
			int marks = sc.nextInt();
			if(marks>=60)
			{
				System.out.println("You are eligible for driving licences.");
			}
			else
			{
				System.out.println("You have to re apperear for RTO test.");
			}
		}
		else
		{
			System.out.println("You have to give the test.");
		}

	}
	else{
		System.out.println("you need to give the test");
	}

	}
}
