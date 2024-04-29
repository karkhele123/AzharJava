import java.util.Scanner;
class AutomorphicNumber
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int dup = num;
		int sqr= num*num;
		int div=1;
		while(num!=0)
		{
			div*=10;
			num/=10;
		}
		int LastDigit = sqr%div;
		System.out.println((dup==LastDigit)?"Automorphic number": "Not a automorphic");
	}
}