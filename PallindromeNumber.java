import java.util.Scanner;
class PallindromeNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int dup=num;
		int rev=0;
		while(num>0){
			int rem =num%10;
			rev = (rev*10)+rem;
			num/=10;
		}
		System.out.println((dup==rev)?"pallindrome number": "not a pallindrome number :");
		// if (dup==rev) {
		// 	System.out.println("pallindrome number ");
			
		// }
		// else{
		// 	System.out.println("not a pallindrome number ");
		// }
	}
}