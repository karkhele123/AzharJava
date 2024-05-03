class University
{
	String name;
	String universityCode;
	int noOfColleges;
	String type;
	int establishedYear;
	int course;
	College obj1;
	

	University(String name,String universityCode,int noOfColleges,String type,int establishedYear,int course)
	{
		this.name=name;
		this.universityCode=universityCode;
		this.noOfColleges=noOfColleges;
		this.type=type;
		this.establishedYear=establishedYear;
		this.course=course;
	}
	public void displayUniversity()
	{
		System.out.println();
		System.out.println("****University Details****");
		System.out.println();
		System.out.println("University Name : " + this.name);
		System.out.println("universityCode : "+ this.universityCode);
		System.out.println("Type of university : "+ this.type);
		System.out.println("Established Year : " +this.establishedYear);
		System.out.println("No Of courses Provided University : "+this.course);
	}
	public void createInstanceOfCollege(String name , int collegeCode,String address,int noOfDepartment,char grade,int staffcount)
	{
		obj1=new College(name,collegeCode,address,noOfDepartment,grade,staffcount);
	}
}
class College
{
	String name;
    int collegeCode;
    String address;
    int noOfDepartment;
    char grade;
    int staffcount;
    Department department;

    College(String name , int collegeCode,String address,int noOfDepartment,char grade,int staffcount)
    {
     this.name=name;
     this.collegeCode=collegeCode;
     this.address=address;
     this.noOfDepartment=noOfDepartment;
     this.grade=grade;
     this.staffcount=staffcount;
    }
    public void displayCollege()
    {
    	System.out.println();
    	System.out.println("****Colleges Details****");
    	System.out.println();
    	System.out.println("College Name : " +this.name);
    	System.out.println("College code : "+this.collegeCode);
    	System.out.println("Address of colleges : "+this.address);
    	System.out.println("No of Department in college"+this.noOfDepartment);
    	System.out.println("College grade : "+this.grade);
    	System.out.println("College Staff : "+this.staffcount);
    }
    public void createInstanceOfDepartment(String name,String hodName,int classRoom,int noOfStaff,int subject)
    {
    	department=new Department(name,hodName,classRoom,noOfStaff,subject);
    }
}
class Department
{
	String name;
	String hodName;
	int classRoom;
	int noOfStaff;
    int subject;
    Teacher techerobj;

    Department(String name,String hodName,int classRoom,int noOfStaff,int subject)
    {
    	this.name=name;
    	this.hodName=hodName;
    	this.classRoom=classRoom;
    	this.noOfStaff=noOfStaff;
    	this.subject=subject;
    }
    public void displayDepartment()
    {
    	System.out.println();
    	System.out.println("****Department Details");
    	System.out.println();
    	System.out.println("Department Name: "+this.name);
    	System.out.println("Hod Name : "+this.hodName);
    	System.out.println("Number of CalssRoom : "+this.classRoom);
    	System.out.println("NO of Staff : "+this.noOfStaff);
    	System.out.println("Subject : "+this.subject);
    }
    public void createInstanceOfTeacher(String name,String subject,long phoneNumber,String qualification,double experince)
    {
    	techerobj=new Teacher(name,subject,phoneNumber,qualification,experince);
    }
}
class Teacher
{
	String name;
	String subject ;
	long phoneNumber;
	String qualification;
	double experince;

	Teacher(String name,String subject,long phoneNumber,String qualification,double experince)
	{
		this.name=name;
		this.subject=subject;
		this.phoneNumber=phoneNumber;
		this.qualification=qualification;
		this.experince=experince;
	}
	public void displayTeacher()
	{
		System.out.println();
		System.out.println("*****Teacher Details*****");
		System.out.println();
		System.out.println("Teacher Name: "+this.name);
		System.out.println("Subject : "+this.subject);
		System.out.println("Qualification : "+this.qualification);
		System.out.println("Experince : "+this.experince);
	}
}
class UniversityDriver
{
 public static void main(String[] args) 
 {
 	University obj=new University("SPPU","UNI123",1100,"Goverment",1950,300);
 	obj.displayUniversity();	
 	obj.createInstanceOfCollege("Model College",123,"Shivajinager,pune.",10,'A',100);
 	obj.obj1.displayCollege();
 	obj.obj1.createInstanceOfDepartment("AI&ML","C.A.ghule",8,8,48);
 	obj.obj1.department.displayDepartment();
 	obj.obj1.department.createInstanceOfTeacher("Sudharshan Sir","java",8007786990l,"MTECH",5.5);
 	obj.obj1.department.techerobj.displayTeacher();
 }	
}