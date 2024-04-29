import java.util.*;
class Bank
{
	static String name;
	static String address;
	static Long aadharNo;
	static Long phoneNo;
	static double bal;
	static int upiPin;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		outerloop:
		for (; ; ) {
			System.out.println("***** Welcome to LaxmiChitFund *****");
			System.out.println();
			System.out.println("1. create Account");
			System.out.println("2. Existing Account Holder");
			System.out.println(" Enter an Option");
			int option = sc.nextInt();
			System.out.println();
			switch(option)
			{
			case 1:{
				System.out.println("*** Create Account Module ***");
				sc.nextLine();
				System.out.println("Enter the name : ");
				name =sc.nextLine();
				System.out.println("Enter your address : ");
                address = sc.nextLine();
                System.out.println("Enter your aadharNo");
                aadharNo = sc.nextLong();
                System.out.println("Enter your phoneNo");
                phoneNo = sc.nextLong();
                System.out.println("Enter your Deposite Amount : ");
                bal = sc.nextDouble();
                System.out.println("Enter a upiPin : ");
                upiPin = sc.nextInt();
                System.out.println("Account Created Successfully :");
                System.out.println();
                break;
			}
		case 2: {
		       for (; ; ) {
		       	     System.out.println();
		       	     System.out.println("** features **");
		       	     System.out.println("1.Check Balance 2.Deposite 3.Withdraw 4.Information 5.ChangePassword 6.Logout");
		       	     System.out.println();
		       	     System.out.println("Enter your option : ");
		       	     int opt = sc.nextInt();
		       	     switch(opt)
		       	     {
		       	     case 1:{
		       	     	System.out.println("*** Check Balance ****");
		       	     	System.out.println();
		       	     	System.out.println("Enter your upiPin");
		       	     	int userPin=sc.nextInt();
		       	     	if (userPin==upiPin) {
		       	     		System.out.println("Your account balance is - "+ bal + " rs ");
		       	     		
		       	     	}
		       	     	else{
		       	     		System.out.println("Wrong upi pin");
		       	     	}
		       	     	break;
		       	     }
		       	 case 2: {
		       	 	      System.out.println(" *** Deposite Amount ***");
		       	 	      System.out.println();
		       	 	      System.out.print("Enter Amount : ");
		       	 	      double depAmount = sc.nextDouble();
		       	 	      bal =bal + depAmount;
		       	 	      System.out.println("Amount Deposite Successfully");
		       	 	      break;
		       	     }
		       	 case 3:{
		       	 	System.out.println("**** Withdraw Amount ****");
		       	 	System.out.println();
		       	 	System.out.println("Enter your upiPin");
		       	 	int userPin = sc.nextInt();
		       	 	if (userPin==upiPin) {
		       	 		System.out.println("Enter your Amount : ");
		       	 		double withDrawAmount = sc.nextDouble();
		       	 		if (withDrawAmount<=bal) {
		       	 			System.out.println("Amount Withdraw Successfully");
		       	 			bal =bal-withDrawAmount;
		       	 		}
		       	 		else{
		       	 			System.out.println("Insufficient Funds : ");
		       	 		}
		       	 	  }
		       	 	  else{
		       	 	  	System.out.println("Wrong upiPin");
		       	 	  }
		       	 	  break;
		       	 }
		       	case 4: {
		       		System.out.println("Account Information : ");
		       		System.out.println("Account Holder Name "+ name);
		       		System.out.println("address: "+ address);
		       		System.out.println("Phone Number" + phoneNo);
		       		System.out.println("Adhar Number : "+ aadharNo);
		       		break;
		       	 }
		       	case 5:
		       		{
		       			int newPin ;
		       			System.out.println("Enter new upiPin");
		       			int userPin = sc.nextInt();
		       		}
		       	case 6:{
		       		System.exit(0);
		       	}
		       default : System.out.println("Invalid Option :");
		       	break;
		       	}
		       }
			}
		default : System.out.println("Invalid option ");
			break;
		}
		}
	}
}