import java.util.Scanner;
class Election
{
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		if (age>=18) {
			System.out.println("do u have voter Id (yes/no) :");
			String VoterId = sc.next().toLowerCase();
			if (VoterId.equals("yes")) {
				System.out.println("****** Welcome *******");
				System.out.println("1. BJP ");
				System.out.println("2. CONGRESS");
				System.out.println(" 3. APP ");
				System.out.println("4. MNS");
				System.out.println("5. Shivsena");
				System.out.println("6. NCP");
				System.out.println("7. NOTA");
				System.out.println("Enter the option to vote for your fov party ");
				String vote = sc.next().toUpperCase();
				if (vote.equals("BJP")) {
					System.out.println("you have vote for bjp ");
					
				}
				else if (vote.equals("congress")) {
					System.out.println("you have vote for congress");
					
				}
				else if (vote.equals("APP")) {
					System.out.println("you have vote for APP");
					
				}
				else if (vote.equals("MNS")) {
					System.out.println("you have vote for MNS");
					
				}
				else if (vote.equals("Shivsena")) {
					System.out.println("you have vote for Shivsena");
					
				}
				else if (vote.equals("NCP")) {
					System.out.println("you have vote for NCP");
					
				}
				else if (vote.equals("NOTA")){
					System.out.println("you have wasting your vote");

					
				}
				else{
					System.out.println("invalid input");
				}
			}
				else{
					System.out.println("jaldi hato yaha se ");
				}
			}
				else{
					System.out.println("you are not mature to vote try after "+(18-age));
				}
	
	}
}