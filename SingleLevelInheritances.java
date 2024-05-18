import java.util.*;
class ProgrammingLanguage
{
	String type ;
	String level;
	int inventedYear;
	String founderName;
	double latesVersion;
	String extension;

	ProgrammingLanguage(String type ,String level ,int inventedYear ,String founderName,double latesVersion ,String extension)
	{
		super();
		this.type=type;
		this.level=level;
		this.inventedYear=inventedYear;
		this.founderName=founderName;
		this.latesVersion=latesVersion;
		this.extension=extension;
	}
	public void displayProgrammingLanguage()
	{
		System.out.println();
		System.out.println("***** Programming Language ******");
		System.out.println();
		System.out.println("Type of Language : "+this.type);
		System.out.println("Level of Language : "+this.level);
		System.out.println("InventedYear : "+this.inventedYear + " Year");
		System.out.println("Founder Name : "+this.founderName);
		System.out.println("LatesVersion :JDK " + this.latesVersion);
		System.out.println("Extension : "+this.extension);
	}

}
class Java extends ProgrammingLanguage
{
	String []features;
	boolean PlatformIndependent;

	Java(String [] features , boolean PlatformIndependent,String type ,String level ,int inventedYear ,String founderName,double latesVersion ,String extension)
	{
		super(type ,level , inventedYear , founderName,latesVersion , extension);
		this.features=features;
		this.PlatformIndependent=PlatformIndependent;
	}
  public void displayJava()
{
	System.out.println();
	System.out.println("***** JAVA DETAILS *****");
	System.out.println();
	System.out.println("Is it platform independet : "+this.PlatformIndependent);
	System.out.println("Features of Java : "+ Arrays.toString(this.features));
}
}
class SingleLevelInheritances
{
	public static void main(String[] args) 
	{
	 String [] features={"1.MultiThreaded","2.Secure and Robust","3.portable","4.Dynamic","5.High Performaces"};
	 Java obj = new Java(features,true,"Object Oriented Programming Language ","High Level",1991,"James Gosling ",1.22,".java");
	 obj.displayProgrammingLanguage();
	 obj.displayJava(); 	
	}
}