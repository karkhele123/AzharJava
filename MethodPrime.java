class MethodPrime
{
	public static void main(String[] args) 
	{
	 for (int i = 2;i<=30 ;i++ ) 
	 {
	 	isPrime(i);	
	 }	
	}
	public static void isPrime(int num)
	{
		boolean flag = true;
		for (int i = 2;i<num ;i++ ) 
		{
			if (num%i==0) 
			{
				flag = false;
				break;
			}
		}
		if (flag) 
		{
			System.out.println(num+ " prime");
		}
		else
		{
           System.out.println(num+ " not prime");
		}
	}
}