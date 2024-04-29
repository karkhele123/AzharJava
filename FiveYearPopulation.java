class FiveYearPopulation
{
public static void main(String []args)
{
long currentPopulation = 312032486;
long secondsInYear = 365*24*60*60;
long birthPerYear = secondsInYear/7;
long deathPerYear = secondsInYear/13;
long immigrantPerYear = secondsInYear/45;
long FiveYearPopulation = currentPopulation+((birthPerYear-deathPerYear+immigrantPerYear)*5);
System.out.println("The current Population - "+currentPopulation);
System.out.println("The FiveYearPopulation is - "+FiveYearPopulation);
}
}