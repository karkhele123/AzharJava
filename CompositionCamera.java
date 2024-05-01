class Camera
{
	String brand;
	String model;
	String series;
	String type ;
	double effectivePixels;
	double price;
	double shutterSpeed;
	Lens obj1= new Lens("brand","SEL55210/BQ","TelePhoto",18540,"WildLife",210,"f/4.5-6.3 OSS","NO",80);
Camera(String brand , String model, String series,String type, double effectivePixels ,double price ,double shutterSpeed)
{
 this.brand=brand;
 this.model=model;
 this.series=series;
 this.type=type;
 this.effectivePixels=effectivePixels;
 this.price=price;
 this.shutterSpeed=shutterSpeed;
}
public void dislpayCamera()
{
System.out.println();
System.out.println("*****Camera Details*****");
System.out.println();
System.out.println("Camera Brand : "+ brand);
System.out.println("Camera model : "+ model);
System.out.println("Camera series : " + series);
System.out.println("Camera type : " + type);
System.out.println("Camera effectivePixels : "+ effectivePixels + "mp");
System.out.println("Camera price : "+ price + "rs");
System.out.println("Camera shutterSpeed : " + shutterSpeed + "sec");
}
}
class Lens
{
	String brand ;
	String model;
	String lensType;
	double price;
	String suitableFor ;
	double maxFocalLenght;
	String apertureWithFocalLength;
	String waterResistant;
	double weight;
 Lens(String brand, String model,String lensType, double price, String suitableFor , double maxFocalLenght,String apertureWithFocalLength,String waterResistant,double weight)
 {
  this.brand=brand;
  this.model=model;
  this.lensType=lensType;
  this.price=price;
  this.suitableFor=suitableFor;
  this.maxFocalLenght=maxFocalLenght;
  this.apertureWithFocalLength=apertureWithFocalLength;
  this.waterResistant=waterResistant;
  this.weight=weight;
 }
 public void displayLens()
 {
  System.out.println();
  System.out.println("**** Lens Details  ****");
  System.out.println();
  System.out.println("Lens Brand : " + brand);
  System.out.println("Lens model : " + model);
  System.out.println("LensType : "+ lensType);
  System.out.println("Lens Price : " + price);
  System.out.println("Lens suitableFor : "+ suitableFor);
  System.out.println("Lens MaxFocalLenght : "+ maxFocalLenght + "mm");
  System.out.println("Lens ApertureWithFocalLength : "+ apertureWithFocalLength + "mm");
  System.out.println("Lens WaterResistant : "+ waterResistant);
  System.out.println("Lens Weight : "+ weight + "g");
 }
}
class CompositionCamera
{
	public static void main(String[] args)
		{
		Camera obj=new Camera("Canon","1500D","EOS","DSLR",24.1,40690,1/4000);
		obj.dislpayCamera();
		obj.obj1.displayLens();

	}
}