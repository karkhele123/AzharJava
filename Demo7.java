class Demo7
{
	String str1= "hii i am from demo7 class ";
	public static void main(String[] args) 
	{
     System.out.println("hi from main :");
     Demo8 obj= new Demo8();
     obj.m1();	 	
	}
}
class Demo8
{
	static Demo7 obj = new Demo7();
	void m1()
	{
		System.out.println("hii from m1()");
		System.out.println(obj.str1);
		m2();
	}
     void m2()
	{
		System.out.println("hii from m2() ");
		System.out.println(obj.str1);
		m3();
	}
		static void m3()
		{
			System.out.println("hii from m3() static ");
			System.out.println(obj.str1);
		}
	}
