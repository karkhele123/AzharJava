import java.util.Scanner;
class NumberOfYear
{
public static void main(String[]args)
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter the minutes");
long minutes = sc.nextLong();
long minutePerDay = 24*60;
long minutePerYear = minutePerDay*365;
long year = minutes/minutePerYear;
long remainingminutes = minutes%minutePerYear;
long days = remainingminutes/minutePerDay;
System.out.println(minutes + " minutes is approximately " + year + " years and " + days + " days");
}
}

