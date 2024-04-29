class Marker
{
	String brand;
	String type;
	double price;

	Marker()
	{
		this.brand=brand;
		this.type = type;
		this.price = price;
		System.out.println("MARJER CREATRED");
	}
	void displayMarker()
	{
		System.out.println();
		System.out.println("Marker details");
		System.out.println("Brand : "+this.brand);
		System.out.println("Type : "+this.type);
		System.out.println("Price : "+this.price);
	}
}
class MarkerTemp
{
	public static void main(String[] args) 
	{
		Marker obj = new Marker();
		obj.displayMarker();	
	}
}