import java.util.Scanner;
class ArmyJoin
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the age ");
		int age = sc.nextInt();
		if (age>=18) {

			System.out.println("Enter your height. ");
			double height = sc.nextDouble();
			if (height>=162)
			{
				System.out.println("Enter your weight. ");
				double weight = sc.nextDouble();
				if(weight>=56)
				{
					System.out.print("Congratulation for selected to army");
				}
			  else{
			  	System.out.print("you need increase your weight and come back. ");
			  }
			}
			else
			{
				System.out.print(" you need increase your height and  come back. ");

			}
			}
			else{
				System.out.println("you are eligible after "+(age-18)+ "year.");
		}
	}
}