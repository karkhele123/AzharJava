class MethodExample1
{
	public static void main(String[] args) 
	{
	 System.out.println("main Starts ");
	 ramesh();
	 System.out.println("main Ends");	
	}
	public static void ramesh()
	{
		System.out.println("Ramesh starts");
		suresh();
		System.out.println("Ramesh Ends");
	}
	public static void suresh()
	{
		System.out.println("Suresh starts ");
		mahesh();
		System.out.println("Suresh Ends");
	}
	public static void mahesh()
	{
		System.out.println("Mahesh starts");
		System.out.println("Mahesh Ends");
	}

}