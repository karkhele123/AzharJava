import java.util.Scanner;
class FibonaciiRecursion
{
	static int num1;
	static int num2 ;
	static int num3;
	static int op;
	static int i;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number1 : ");
	  num1 = sc.nextInt();
	  System.out.println("Enter the number2 : ");
	  num2 =sc.nextInt();
	  System.out.println("Enter the num3 : ");
	  num3 = sc.nextInt();
	   fibonaciiNumber();
	} 
	public static void fibonaciiNumber()
	{
     
         op = num1+num2	; //0+1=1 //1+1=2 //1+2 =3 //2+3=5 //3+5=8
         System.out.print(op+" "); //1 2 3 5 8
         num1=num2; //0=1 //1=1 //1=2 //2=3
         num2=op; //1=1 //1=2 //2=3 //3=5
         i++; //1(2) //2(3) //3(4) //4(5)
         if (i>num3) //2>18 (false) 3>18 4>18 5>18
         {
          return;	
         }
         fibonaciiNumber();
	}
}









// public class FibonacciSeries {
//     public static void main(String[] args) {
//         int n = 18; // Change the value of n for different number of Fibonacci numbers
//         System.out.println("Fibonacci Series:");
//         for (int i = 0; i < n; i++) {
//             System.out.print(fibonacci(i) + " ");
//         }
//     }

//     public static int fibonacci(int n) {
//         if (n <= 1)
//             return n;
//         else
//             return fibonacci(n - 1) + fibonacci(n - 2);
//     }
// }