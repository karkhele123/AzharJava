class Demo71
{
	String str ="hii i am global";
	void m1()
	{
		System.out.println("hello from m1()");
	}
	void add(int num1 ,int num2)
	{
		System.out.println("Addition is " +(num1+num2));
	}
	static void m2()
	{
		System.out.println("hii from static m2()");
	}
	void exControll()
	{
		String str ="hii i am local ";
		this.add(10,20);
		this.m2();
		m1();
		System.out.println(str);
		System.out.println(this);
		System.out.println(this.str);
	}
	public static void main(String[] args) 
	{
		Demo71 obj =new Demo71();
		obj.exControll();
		System.out.println(obj);	
	}
}