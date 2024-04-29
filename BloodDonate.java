import java.util.Scanner;
class BloodDonate
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		if (age<20){
				System.out.println("you are kind try after " +(20-age)+"years.");	
		}
		else{
			System.out.println("have a consumed alcohol or cigar (yes/no) :");
			String nasha=sc.next().toLowerCase();
			if (nasha.equals("no")) {
				System.out.println("Enter your wieght");
				double wght = sc.nextDouble();
				if (wght>=50) {
					System.out.println("we can pump your blood");
					
				}
				else{
					System.out.println("Go and have some food and increse your weight");
				}
			}
				else{
					System.out.println("you can not donate blood becouse you are nasha");
		}		}
	}
}