import java.util.Scanner;
class MonthSwitch
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the month number: ");
		int monthNum = sc.nextInt();
		String month = null;
		switch(monthNum)
		{
			case 1 :month = "jan";break;
			case 2 :month = "feb" ;break;
			case 3 :month = "march";break;
			case 4 :month = "april";break;
			case 5 :month = "may";break;
			case 6 :month = "june";break;
			case 7 :month = "july";break;
		    case 8 :month = "august";break;
			case 9 :month = "september";break;
			case 10:month = "octomber";break;
			case 11:month = "novmber";break;
			case 12:month = "december";break;
		default : System.out.println("invalid input");break;
		}
		System.out.println((month != null)?(monthNum+" - "+month):" ");
	}
}