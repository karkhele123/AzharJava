import java.util.*;
class MethodReverse
{
	public static void main(String[] args)
	{ 
       Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
        int rev = reverseNumber(num);
        isPallindrome(num,rev);
	}
	public static int reverseNumber(int num)
	{
		int rev = 0;
		while(num!=0)
		{
			int rem = num%10;
			rev = rev*10+rem;
			num/=10;
		}
		return rev;
	}
	public static void isPallindrome(int num , int rev)
	{
		if (num==rev) 
		{
			System.out.println("number is pallindrome " +num);
		}
		else{
			System.out.println("number is not pallindrome " +num);
		}
	}
}