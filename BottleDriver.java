class Bottle
{
	String Material ;
	double cap;
	double weight;
	void displayBottle()
	{
		System.out.println("i am non static block ");
	}
	{
		System.out.println(Material + " " + cap + " " + weight);
	}
}
class BottleDriver
{
	public static void main(String[] args) 
	{
	  Bottle obj= new Bottle();
	  obj.displayBottle();	

	   Bottle obj1= new Bottle();
	  obj1.displayBottle();	

	   Bottle obj2= new Bottle();
	  obj2.displayBottle();	

	   Bottle obj3= new Bottle();
	  obj3.displayBottle();	
	}
}