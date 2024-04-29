import java.util.Scanner;
class StudentCariteriya
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the per");
		double per = sc.nextDouble();
		if(per<35){
			System.out.println("Student fail in exam");
		}
		else if (per<60) {
			System.out.println("Student is second class ");
			
		}
		else if (per<75) {
			System.out.println("Student is first class A");
			
		}
		else if (per<90) {
			System.out.println("Student is A+ Distinction ");
			
		}
		else if (per<=100) {
			System.out.println("Student is outstanding");
			
		}
		else{
			System.out.println("Student is not attending the exam");
		}
		System.out.println(per);
	}
}