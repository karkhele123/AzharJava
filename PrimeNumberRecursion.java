import java.util.Scanner;
class PrimeNumberRecursion
{ 
	static int num;
	static int i =2;
    static  boolean flag = true;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		primeNumber();
		System.out.println(flag? "prime": " not prime");
	}
	public static void primeNumber()
	{ 
	  if (num%i==0)
	  { 
	  	 flag = false;
	  	 return;	
	  }
	  	i++;
	  	if (i==num) 
	  	 return;
	  	primeNumber();
	}
}