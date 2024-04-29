class Example10
{
	public static void main(String[] args) {
		System.out.println("Hi from main");
		Example10 obj = new Example10();
		obj.m1();
	}
	public void m1(){
		System.out.println("Hi from m1()");
		Example11.m2();
	}
}
class Example11
{
	public static void m2(){
		System.out.println("Hi from m2.");
	}
}