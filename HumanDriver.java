class Human
{
	String name;
	String gender;

	Human(String name,String gender)
	{
		this.name=name;
		this.gender=gender;
	}

	void eat()
	{
		System.out.println("Human can eat");
	}
	void walk()
	{
		System.out.println("Human can walk");
	}
	void think()
	{
		System.out.println("Human can think");
	}
	void speak()
	{
		System.out.println("Human can speak");
	}
	void displayHuman()
	{
		System.out.println();
		System.out.println("*****Human Details******");
		System.out.println();
		System.out.println("Name : "+this.name);
		System.out.println("Gender : "+this.gender);
	}
}
class Graduation extends Human 
{
	String course;
	int duration;
	String branch;
	String university;
	int yop;

	Graduation(String course,int duration,String branch,String university,int yop,String name,String gender)
	{
		super(name,gender);
		this.course=course;
		this.duration=duration;
		this.branch=branch;
		this.university=university;
		this.yop=yop;
	}
	void displayGraduation()
	{
		System.out.println();
		System.out.println("******Details Graduation****");
		System.out.println();
		System.out.println("course : "+this.course);
		System.out.println("Duration : "+this.duration+ " year");
		System.out.println("Branch : "+this.branch);
		System.out.println("University : "+this.university);
		System.out.println("YOP : "+this.yop);
	}
}
class PostGraduation extends Graduation
{
	String specification;
	int durationpg;
	int yoppg;
	String universitypg;

PostGraduation(String specification,int durationpg ,int yoppg,String universitypg,String course,int duration,String branch,String university,int yop,String name,String gender)
{
	super(course,duration,branch,university,yop, name, gender);
	this.specification=specification;
	this.durationpg=durationpg;
	this.yoppg=yoppg;
	this.universitypg=universitypg;

}

void displayPostGraduation()
{
	System.out.println();
	System.out.println("******Details PostGraduation *****");
	System.out.println();
	System.out.println("specification : "+this.specification);
	System.out.println("Durationpg : "+this.durationpg + " year");
	System.out.println("YOPPG : "+this.yoppg);
	System.out.println("Universitypg : " +this.universitypg);
}
}
class Job extends PostGraduation
{
	String company;
	double salary;
	String designation;
	String location;

Job(String company ,double salary,String designation,String location,String specification,int durationpg ,int yoppg,String universitypg,String course,int duration,String branch,String university,int yop,String name,String gender)
{
	super(specification,durationpg, yoppg,universitypg, course, duration, branch, university, yop, name, gender);
	this.company=company;
	this.salary=salary;
	this.designation=designation;
	this.location=location;
}
void displayJob()
{
	System.out.println();
	System.out.println("****** Details Job *****");
	System.out.println();
	System.out.println("company : "+this.company);
	System.out.println("salary : "+this.salary + "Lakhs");
	System.out.println("designation : "+this.designation);
	System.out.println("location : "+this.location);
}
}
class HumanDriver
{
	public static void main(String[] args) 
	{
	   Job obj = new Job("TCS",500000,"Ass.Software Developer","pune","Cyber security",2,2026,"SPPU","Bachlours of Engineering",4,"Electrical Engineering","Dbatu",2024,"Azhar","Male");
	   obj.displayHuman();
	   obj.eat();
	   obj.walk();
	   obj.think();
	   obj.speak();
	   obj.displayGraduation();
	   obj.displayPostGraduation();
       obj.displayJob();
	}
}