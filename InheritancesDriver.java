class Parent
{
	String str1="Hii i am parent class ";
	public void m1()
	{
		System.out.println("Hii am parent method m1()");
	}
	public void m2()
	{
		System.out.println("hii am parent method m2()");
	}
	public static void m3()
	{
		System.out.println("hii am parent static method m3()");
	}
}
class Child
{
	String str2="hiii i am child class";
	public void m4()
	{
		System.out.println("hii i am child method ");
	}
	public static void m5()
	{
		System.out.println("hii i am child static method m5()");
	}
}

class InheritancesDriver
{
	public static void main(String[] args) 
	{
		Child obj=new Child();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
		obj.m5();


	}
}