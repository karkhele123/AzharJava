class MethodExample
{
	public static void main(String[] args) {
		System.out.println("Excution start ");
		myMethod();
		checkEvenOdd(10);
		System.out.println("Excution ends");
	}
	public static void myMethod()
	{
		System.out.println("Hello from myMethod()");
	}
	public static void checkEvenOdd(int num)
	{
		if (num%2==0) 
		{
		  System.out.println(num + " is even");	
		}
		else
		{
          System.out.println(num+ " is odd");
		}
	}
}