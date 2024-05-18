class Transportation
{
	String name;
	int foundationYear;
     

   Transportation(String name,int foundationYear)
   {
   	super()
   	this.name=name;
   	this.foundationYear=foundationYear;
   }
   void displayTransportation()
   {
   	System.out.println();
   	System.out.println("***** Transportation Details ******");
   	System.out.println("Company Name : "+this.name);
   	System.out.println("Foundation year : "+this.foundationYear);
   }
}
class Vehicle
{
	String name ;
    int yearOfManufacturing;
    int noOfTyre;
}
class Car
{
	String type;
	double fuelCapacity;
	String tyreBrand;

	Car(String type ,double fuelCapacity,String tyreBrand)
	{
		super();
		this.type=type;
		this.fuelCapacity=fuelCapacity;
		this.tyreBrand=tyreBrand;
	}
	void displayCar()
	{
		System.out.println();
		System.out.println("******Details Car******");
		System.out.println();
		System.out.println("Car Type : "+this.type);
		
	}
}
class XUV
{
	String model;
	double mileage;

}




class TransportationDriver
{
	public static void main(String[] args) 
	{
		
	}
}