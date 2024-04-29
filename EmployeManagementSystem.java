import java.util.Scanner;
class EmployeeManagementSystem
{
	static String ename;
	static int eid ;
	static String erole;
	static double esal;
	public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);
      System.out.println(" **** Welcome ****");
      System.out.println();
      features;
      for (; ; ) 
      {
       System.out.println("*** FEATURES ***");
       System.out.println("1. Add New Employee");
       System.out.println("2. View Employee");
       System.out.println("3. Edit Employee");
       System.out.println("4. Exit");
       System.out.println();
       System.out.println("Enter an Option");
       int opt = sc.nextInt();
       switch(opt)
       {
       case 1:
       	{
       		addNewEmployee();
       		break;
       	}
       	 case 2:
       	{
       		viewEmployee(1);
       		break;
       	}
       	 case 3:
       	{
       		
       		break;
       	}
       	 case 4:
       	{
       		System.exit(0);
       		break;
       	}
       default :
       	{
       		System.out.println("Incorrect option");
       	}
       }	
      }
	}
	public static void addNewEmployee()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("** Enter New Employee Data : ");
		System.out.print("Employee Name : ");
		ename = sc.nextLine();
		System.out.print("Employee Id");
		eid = sc.nextLine();
		Scanner s = new Scanner (System.in);
		System.out.print("Employee Role");
		erole = s.nextLine();
		System.out.print("Employee salary");
		esal = s.nextDouble();
	}
	public static void viewEmployee(int eid1)
	{
		if (eid==eid1) 
		{
		  System.out.println("** Employee Data **");
		  System.out.println("Name :"+ ename);
		  System.out.println("Emp Id :"+ eid);	
		  System.out.println("Emp Job Role :"+ erole);	
		  System.out.println("Emp salary :"+ esal);	

		}
		else
		{
         System.out.println("Wrong Eid");
		}
	}
}