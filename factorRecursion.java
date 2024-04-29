import java.util.Scanner;
class factorRecursion
{
	static int num ;
	static int i = 1;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number  : ");
		num = sc.nextInt();
		factorNumber();
		//System.out.println(i+" ");
		
	}
	public static void factorNumber()
	{
			if (num%i==0)
			{
               System.out.println(i);
			}
			i++;
			if(i>num)
			return;
		  factorNumber();
	}
}

