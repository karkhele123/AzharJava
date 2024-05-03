class Computer
{
	String brand;
	String model;
	double price;
	String type;
    Cpu cpuobj=new Cpu(8,512,"Core 5","Intel Integrated iris Xe");

	Computer(String brand,String model,double price,String type)
	{
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.type=type;
	}
	public void displayComputer()
	{
		System.out.println();
		System.out.println("****Computer Details****");
		System.out.println();
		System.out.println("Computer brand : "+this.brand);
		System.out.println("Computer Model : "+this.model);
		System.out.println("Computer Price : "+this.price);
		System.out.println("Computer Type : "+this.type);
	}
}

class Cpu
{
	double ram;
	double rom;
    String processer;
    String graficCard;
    Cpu(double ram,double rom,String processer,String graficCard)
    {
     this.ram=ram;
     this.rom=rom;
     this.processer=processer;
     this.graficCard=graficCard;
    }
    public void displayCpu()
    {
    	System.out.println();
    	System.out.println("*****CPU Details*****");
    	System.out.println();
    	System.out.println("CPU Ram : "+this.ram+ " GB");
    	System.out.println("CPU Rom : "+this.rom + "GB");
    	System.out.println("CPU processer : "+this.processer);
    	System.out.println("CPU graficCard : "+this.graficCard);
    }
}

class Moniter
{
	String displayType;
	String displaysize;
	String resolution;
    Keyboard keyboardobj;

  Moniter(String displayType,String displaysize,String resolution)
  {
  	this.displayType=displayType;
  	this.displaysize=displaysize;
  	this.resolution=resolution;
  }
  public void displayMoniter()
  {
  	System.out.println();
  	System.out.println("*****Moniter Details*****");
  	System.out.println();
  	System.out.println("Display Type : "+this.displayType);
  	System.out.println("Display  Size : "+this.displaysize+ "cm");
  	System.out.println("Display Resolution : "+this.resolution+ "pixel");
  }
  public void createInstanceOfKeyBoard(String brand ,String partNumber,String backLight,String type)
  {
  	keyboardobj=new Keyboard(brand,partNumber,backLight,type);
  }
}

class Keyboard
{
	String brand;
	String partNumber;
 	String backLight;
	String type;
	Mouse mouseobj;

	Keyboard(String brand ,String partNumber,String backLight,String type)
	{
		this.brand=brand;
		this.partNumber=partNumber;
		this.backLight=backLight;
		this.type=type;
	}
	public void displayKeyBoard()
	{
		System.out.println();
		System.out.println("*****Keyboard Details*****");
		System.out.println();
		System.out.println("Keyboard brand : "+this.brand);
		System.out.println("Keyboard partNumber : "+this.partNumber);
		System.out.println("Keyboard backLight : "+this.backLight);
		System.out.println("Keyboard type : "+this.type);
	}
	public void createInstanceOfMouse(String brand , String type,double height,double wireLessFrequeny)
	{
		mouseobj=new Mouse(brand,type,height,wireLessFrequeny);
	}
}

class Mouse
{
	String brand;
	String type;
	double height;
	double wireLessFrequeny;
	Printer printerobj;

	Mouse(String brand , String type,double height,double wireLessFrequeny)
	{
		this.brand=brand;
		this.type=type;
		this.height=height;
		this.wireLessFrequeny=wireLessFrequeny;
	}
	public void displayMouse()
	{
		System.out.println();
		System.out.println("*****Mouse  Details*****");
		System.out.println();
		System.out.println("Mouse brand : "+this.brand);
		System.out.println("Mouse type : "+this.type);
		System.out.println("Mouse height : "+this.height+ " mm");
		System.out.println("Mouse wireLessFrequeny : "+this.wireLessFrequeny+ " GHz");
	}
	public void createInstanceOfPrinter(String brand,String type,int printCapacity)
	{
       printerobj=new Printer(brand,type,printCapacity);
	}
}

class Printer
{
	String brand;
	String type;
	int printCapacity;

	Printer(String brand,String type,int printCapacity)
	{
		this.brand=brand;
		this.type=type;
		this.printCapacity=printCapacity;
	}
	public void displayPrinter()
	{
		System.out.println();
		System.out.println("*****Printer Details*****");
		System.out.println();
		System.out.println("Printer Brand : "+this.brand);
		System.out.println("Printer type : "+this.type);
		System.out.println("Printer printCapacity : "+this.printCapacity+ "  sheets");
	}
}

class ComputerDriver
{
	public static void main(String[] args) 
	{
     Computer computerobj=new Computer("SAMSUNG GALAXY BOOK4","NP750XGK-KG1IN",63490,"Intel core 5");
     computerobj.displayComputer();
     computerobj.cpuobj.displayCpu();
     Moniter obj=new Moniter("Full HD","68.58 LED BackLight","1920*1080");
     obj.displayMoniter();
     obj.createInstanceOfKeyBoard("Dell","4wj8p","yes","multi Device Keyboard");
     obj.keyboardobj.displayKeyBoard();
     obj.keyboardobj.createInstanceOfMouse("Lenovo","Wireless nano USB",122,2.4);
     obj.keyboardobj.mouseobj.displayMouse();
     obj.keyboardobj.mouseobj.createInstanceOfPrinter("canon Pixma","multi-function",100);
     obj.keyboardobj.mouseobj.printerobj.displayPrinter();
	}
}