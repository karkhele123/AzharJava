class Laptop
{
	String brand ;
	String modelNo;
	double price;
	int ram;
	int rom;
	String processor;
	String type;
public void displayLaptop()
{
	System.out.println("**** LAPTOP DETAILS ****");
	System.out.println("Brand : " + brand);
	System.out.println("Model Number : "+ modelNo);
	System.out.println("price : " + price + " rs. ");
	System.out.println("RAM : " + ram + " gb. ");
	System.out.println("ROM : " + rom + " gb. ");
	System.out.println("processor : " + processor  );
	System.out.println("Type : "+ type );
}
}
class LaptopDriver
{
	public static void main(String[] args) 
	{
     Laptop obj = new Laptop();
     obj.brand ="HP";
     obj.modelNo = "HP1234i";
     obj.price =50000;
     obj.ram = 8;
     obj.rom =512;
     obj.processor ="i7";
     obj.type = "Gaming";
     obj.displayLaptop();


     Laptop obj2 = new Laptop();
     obj.brand ="HP";
     obj.modelNo = "HP1234i";
     obj.price =70000;
     obj.ram = 16;
     obj.rom =1024;
     obj.processor ="i7";
     obj.type = "Gaming";
     obj.displayLaptop();
	
	}
}