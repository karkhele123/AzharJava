import java.util.Scanner;
class factorRecursion
{
	static int num ;
	static int i = 1;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number  : ");
		int num = sc.nextInt();
		factorNumber();
		
	}
	public static void factorNumber()
	{
		for (int i= 1;i<=num ;i++ ) {
			if (num%i==0) 
			{
               System.out.println(i+ " ");
			}
			
		}
	}
}