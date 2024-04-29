//import java.util.Scanner;
class FibanocciSeries
{
	public static void main(String[] args) 
	{
		int num1 =0;
		int num2 = 1;
	 //Scanner sc=new Scanner(System.in);
	 // System.out.println("Enter the number1");
	 // int num1 = sc.nextInt();
	 // System.out.println("Enter the numeber2");
	 // int num2 = sc.nextInt();
	 System.out.println(num1+" "+num2+" ");
	 for (int i =1;i<18 ;i++ ) {
	 	int op =num1+num2;
	 	System.out.print(op+" ");
	 	num1=num2;
	 	num2=op;
	 	
	 }
	}
}