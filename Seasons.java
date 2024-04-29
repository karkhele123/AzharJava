import java.util.Scanner;
class Seasons
{
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the a month : ");
		String month = sc.next().toLowerCase();
		switch(month)
		{
		case "octomber" :
		case "Novmber" : 
	    case "December" :
		case "january" :System.out.println(month+ " its winter . ");break;
		case "februry" :	
        case "march" :
		case "april" :
		case "may" :System.out.println(month+ " it's summer . ");break;
		case "june" :
		case "july" :
		case "august" :
		case "september" :System.out.println(month + "it's  rainy .");break;
	    default :System.out.println("invalid input");
		}
	}
}