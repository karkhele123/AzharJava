class Student 
{
	
	String name ;
	String branch;
	private static Student singletonObject;
	private Student(String name, String branch)
	{
		this.name= name;
		this.branch=branch;
	}
	public static Student getInstance(String name, String branch)
	{
		if (singletonObject==null) 
		{
		singletonObject = new Student(name,branch);
		return singletonObject;	
		}
		else
		{
         return singletonObject;
		}
	}
	public static void main(String[] args) 
	{
		Student obj = getInstance("ramesh" , "mechanical");
		System.out.println(obj.name);
		Student obj1=getInstance("Suresh", "Electrical");
		System.out.println(obj1.name);
	}
}