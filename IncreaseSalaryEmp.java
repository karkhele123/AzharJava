import java.util.Scanner;
class IncreaseSalaryEmp
{
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Monthly target score :");
		double targetScore=sc.nextDouble();
		System.out.println("Monthly pay");
		double pay = sc.nextDouble();
		if (targetScore>90) {
			pay = pay+pay*3/100;
			
		}
		else{
			pay = pay+pay*1/100;
		}
		System.out.println("the monthly payment is : " + pay);
	}
}