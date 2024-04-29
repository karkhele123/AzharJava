import java.util.Scanner;
class NeonNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number :  ");
		int num = sc.nextInt(); //9
		int sqr = num*num; //9*9 =81
		int sum = 0;
		while(sqr>0)  //81>0 (true) // 8>0 (true)
   		{
			int rem = sqr%10; // 81%10 =1 //8%10 =0
			sum+=rem;   // 0+1 =1 // 1+1
			System.out.println(rem);
			sqr/=10; // 81/10 =8
		}
		System.out.println((sum==num)?num +" Neon Numbber" : num + "  Not a Neon Number");
	}
}


// 9-> (9)square =81 =8+1 =9 =neon number