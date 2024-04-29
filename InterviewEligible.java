import java.util.Scanner;
class InterviewEligible
{
	public static void main (String[]args)
	{
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter the percentge");
	double per = sc.nextDouble();
	if(per>=60)
	{
	System.out.println("Student Eligible for Interview");
	}
	else
	{
	System.out.println("Student Not Eligible for Interview");
	}
}
}