import java.util.Scanner;
class LenghtOfNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int length = 0;
		for (int i= num;i>0 ;i/=10 ) {
			length++;
			
		}
		System.out.println(length);
	}
}