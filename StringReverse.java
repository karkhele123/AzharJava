import java.util.Scanner;
class StringReverse
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		String rev = "";
		while(num>0)
		{
			int rem = num%10;
			rev = rev +rem;
			num/=10;
		}
		System.out.println(rev);
	}
}