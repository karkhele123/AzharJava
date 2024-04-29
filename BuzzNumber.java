import java.util.Scanner;
class BuzzNumber
{
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
        System.out.println((num%7==0) || (num%10==7)? num + " buzz number ": num+ " not buzz number");
		// if ((num%7==0) || (num%10==7)) {
		// 	System.out.println(num+ " It is Buzz Number");
		// }
		// else{
		// 	System.out.println(num+ " It is not a Buzz Number ");
		// }
	}
}