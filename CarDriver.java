class Car
{
	String  brand ;
	String model;
	String engine;
	String type ;
	double mileage;
	byte seatingCapacity ;
	double price;
	int noAirbags;

	public void displaycar()
	{
		System.out.println("**** Details of Car : ****");
		System.out.println();
		System.out.println("Brand : " + brand);
		System.out.println("Model : " + model);
		System.out.println("Engine : " + engine);
		System.out.println("Type : " +  type );
		System.out.println("Mileage : " + mileage + " km/liter ");
		System.out.println("SeatingCapacity : " + seatingCapacity);
		System.out.println("Price : " + price + " rs");
		System.out.println("No. of Airbags : " + noAirbags);
	}
}
class CarDriver
{
	public static void main(String[] args) 
	{
	  Car obj = new Car();
	  obj.brand = "kia";
	  obj.model="a12j11a2002r";
	  obj.engine="V5 engine";
	  obj.type="suv";
	  obj.mileage=25;
	  obj.seatingCapacity=6;
	  obj.price=1500000;
	  obj.noAirbags=4;
	  obj.displaycar();

	}
}