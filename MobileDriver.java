class Mobile
{
	String brand ;
	String model;
	int ram ;
	int rom ;
	double price;

	Mobile(String brand , String model , int ram , int rom , double price )
	{
      this.brand = brand ;
      this.model = model;
      this.ram= ram;
      this.rom =rom;
      this.price = price;
	}
	void displayMobile()
	{
		System.out.println("**** Mobile Details ****");
		System.out.println("Brand : " + brand);
		System.out.println("Model : " + model );
		System.out.println("Ram : " + ram);
		System.out.println("rom : " + rom);
		System.out.println("price : " + price);
	}
}
class MobileDriver
{
	public static void main(String[] args) 
	{
		Mobile obj1 = new Mobile("samsung" , "s23" ,12 , 512 , 120000);
		obj1.displayMobile();

		Mobile obj2 = new Mobile("nokia" , "s001" ,2 , 4 , 1200);
		obj2.displayMobile();

		Mobile obj3 = new Mobile("Realme narzo 30" , "RMX3242" ,8 , 128 , 16000);
		obj3.displayMobile();
		

	}
}