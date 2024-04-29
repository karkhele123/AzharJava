import java.util.Scanner;
class ArmstrongNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);;
		System.out.println("Enter the number : ");
		int num= sc.nextInt();     // int num = 153
		int length = 0;
		int dup =num;
		int dup1 = num;
		int sum = 0;

          // 1. 153!=0 (true)
	     // 2. 15!=0  (true)
         // 3. 1!=0    (true)
	     // 4. 0!=0   (true)

   	   while(num!=0)    
   	   {
   	   //---------------   //0(1) 1(2) 2(3) 
			length++;

	     // 1. 153/10=>15
	      // 2. 15/10=>1
		//3. 1/10=?>0
			num/=10;  
		//length = 3 

		}
		 // 1. 153>0 (true)
          // 2. 15>0 (true)
		//3. 1>0 (true)
		while(dup>0){
			int rem = dup%10;
			   // 3  = 153%10
			   // 5  = 15%10
			   // 1  = 1%10
			int power =1;     //1
			for (int i = 1;i<=length ;i++ ) {
				power = power*rem;
				    // 1*3 = 3
				    // 3*3 = 9
				    // 9*3 = 27

				    // 5*1 = 5
				    // 5*5 = 25
				   // 25*5 = 125

			
			}
			sum+=power;
			//1. 0+27 = 27
			//2. 27+125 = 152
			//3. 152+1= 153
			dup/=10;
			//1. 153/10 => 15
			//2. 15/10 => 1
	}
	//   153==153 the number is ArmstrongNumber
	if (sum==dup1) {
		System.out.println("The number is ArmstrongNumber");
		
	}
	else{
		System.out.println("Not a ArmstrongNumber");
	}
}
}