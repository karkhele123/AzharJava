// import java.util.Scannner;
// class PraticeForProgram
// {
// 	public static void main(String[]args){
// 		Scanner sc = new Scanner (System.in);
// 		System.out.println("Enter the number: ");
// 		int num = sc.nextInt();
// 		int dup=sum;
// 		int sum=0;
// 		while(num>0)
// 		{
// 			int rem= num%10;
// 			fact=1;
// 			for (int i =rem;i>=1 ;i-- )
// 		    {
// 			   fact*=i;	
// 			}
// 			sum+=fact;
// 			num/=10;
// 		}
// 		System.out.println((sum==dup)?"krish":"not krish");
// 	}
// }


// import java.util.Scanner;
// class PraticeForProgram
// {
// 	public static void main(String []args){
// 	Scanner sc = new Scanner (System.in);
// 	System.out.println("Enter the number :");
// 	int num =  sc.nextInt(); //121 
// 	int dup = num; //121=121
// 	int rev =0;     
// 	while(num>0) //121>0 (true) //12>0 (true) //1>0 (true) //0>0 (false)
// 	{  
// 		int rem=num%10;  //121%10 = 1  ///12%10 =2 //1%10 =1 
// 		rev =( rev*10)+rem;   // 0*10+1=1 //1*10+2=12 //12*10+1=121
// // 		num/=10;  //121/10 =12 //12/10 =1 //1/10 =0
// 	}
// 	System.out.println((dup==rev)?"pallindrome": "not a pallindrome : "); //121==121 pallindromenumber
// 	}
// }

// class PraticeForProgram
// {
// 	public static void main(String[] args) {
// 		double var1 = 1+5;
// 		double var2 =var1/4;
// 		int var3 = 1+5;
// 		int var4 =var3/4;
// 		System.out.println(var2+ " " + var4);
// 	}
// }

import java.util.Scanner;
class PraticeForProgram
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int dup =num;
		int dup1= num;
		int sum = 0;
		int length =0;
		while(num>0)
		{
			length++;
			num/=10;
		}
       while(dup>0)
       {
       	int rem = dup%10;
       	int power =1;
       	for (int i = 1;i<=length ;i++ )
       	 {
       		power = power*rem;
       	}
       	sum+=power;
       	dup/=10;
       }
       if (sum==dup1) {
       	System.out.println("Armstrong number : ");
       	
       }
       else{
       	System.out.println("not a Armstrong number  ");
       }
	}
}