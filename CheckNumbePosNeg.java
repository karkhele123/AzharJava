import java.util.Scanner;
class CheckNumbePosNeg
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if (num>0) {
			System.out.println("The number is possitve");
		}
		else if (num==0) {
			System.out.println("The number is Natural Number");
			
		}
		else{
				System.out.println("The number is negative");
			
		}
	}
}