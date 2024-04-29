import java.util.Scanner;
class KrishnaMurtiNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt(); //145
	    int dup=num; //145=145
	    int sum = 0;  
	    while(num>0)   //145>0 (true)  //14>0 (true) //1>0 (true) //0>0 (false)
	    {
	    	int rem = num%10;  //145%10 = 5 //14%10 = 4 //1%10 = 1
	    	int fact = 1;
	    	for(int i=rem ;i>=1;i--)
	    	//for (int i = 1;i<=rem ;i++ ) // 1<=5 (true)  //1<=4 (true) //1<=1 (true)
	    	{
	    	   fact*=i ;	// 5*4*3*2*1 = 120 // 4*3*2*1 = 24 //1*1 =1
	    	}
	    	sum+=fact; //0+120 =120 // 120+24 = 144 //144+1 =145
	    	num/=10;   //145/10 = 14  //14/10 = 1 //1/10 =0

	    }
	    if (sum==dup) 
	    {
	      System.out.println("Number is KrishnaMurtiNumber");	
	    }
	    else
	    {
           System.out.println("Not a KrishnaMurtiNumber");
	    }
	  //  System.out.println((sum==dup)?"KrishaMurtiNumber":"Not a KrishnaMurtiNumber : ");

	}
}