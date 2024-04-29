class Person
{
	String hair;
	int eyes;
	double weight;
	double height;
	String colour;
	String skin;

	public void displayPerson()
	{
		System.out.println("****Details of person : ");
		System.out.println();
		System.out.println("Hair : " + hair);
		System.out.println("Eyes : " + eyes);
		System.out.println("Weight : " + weight + " kg");
		System.out.println("Height : " +  height + " inch");
		System.out.println("Colour : " + colour);
		System.out.println("Skin : " + skin );
		System.out.println();
	}

}
class PersonObject
{
	public static void main(String[] args) 
	{
	 Person obj = new Person();
	 obj.hair ="Black hair";
	 obj.eyes=2;
	 obj.weight= 50;
	 obj.colour="fair";
	 obj.skin = "softSkin";
	 obj.displayPerson();

	 System.out.println();

	 Person obj2 = new Person();
	 obj.hair = "Brown hair";
	 obj.eyes = 2;	
	 obj.weight= 70;
	 obj.colour="White";
	 obj.skin = "Sensitive";
	 obj.displayPerson();
	}
}