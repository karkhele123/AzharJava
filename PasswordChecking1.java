import java.util.Scanner;
class PasswordChecking1
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc =new Scanner (System.in);
		int attempt = 1;
		outerloop:
		for (; ; ) 
		{
			int storedPin = 123;
			int count =3;
			do{
				System.out.println("Enter the pin : ");
				int userPin = sc.nextInt();
				if (userPin ==storedPin)
				 {
					System.out.println("Welcome");
					break outerloop;
				}
				else
				{
                   System.out.println("Wrong pin Attempt left "+(count-1));
                   System.out.println(count);
				}
				if (count==1)
			   {

					Thread.sleep(5000);
					System.out.println("YOU CAN TRY TO ENTER YOUR PIN AGAIN AFTER 5 SECOND : ");
					if (count==1) {
						Thread.sleep(10000);
						System.out.println("YOU CAN TRY TO ENTER YOUR PIN AGAIN AFTER 10 SECOND : ");
						
					}
				}
				count--;
			}while(count>=1);
			if (attempt++==2) {
				break;
				
			}
		}
	}
}