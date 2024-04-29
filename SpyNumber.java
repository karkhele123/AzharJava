import java.util.Scanner;
class SpyNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		for (int i =num;i<=5000 ;i++ ) 
		{
		  System.out.println();	
		}
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int dup =num;
		int sum = 0;
		int product =1;
		while(num>0)
		{
			int rem = num%10 ;
	        sum+=rem;
            product*=rem;
			num/=10;
		}
		if (sum==product) 
		{
		 System.out.println(dup+ " spy Number");	
		}
		else{
			System.out.println(dup+ " not a spy number");
		}
	}
}