class Demo8
{
 public static void main(String[] args) 
   {
   	System.out.println("hello from main() ");
   	Demo8 obj = new Demo8();
   	 obj.m1();
   }
 	public void m1()
 	{
 		System.out.println("hii from m1(): ");
 		Demo9 obj1 = new Demo9();
 	   obj1.m2();
 	}	
}
class Demo9
{
	public void m2()
	{	
		System.out.println("hello from m2(): ");
		m3();
	}
	public void m3()
	{
		System.out.println("hii from m3(): ");
	}
}