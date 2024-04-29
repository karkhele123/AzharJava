class AverageSpeedMiles
{
public static void main(String [] args)
{
double distanceKiloMeter = 14 ;
double distanceTime = (45*60)+30;
double perHour = distanceTime/3600;
double distanceMiles = distanceKiloMeter/1.6;
double averageSpeedInMiles = distanceMiles/perHour;
System.out.println("distances kilo meter in 45 minute - "+distanceKiloMeter);
System.out.println("distances time in per second - "+distanceTime);
System.out.println("distances miles inn per kilometer - " +distanceMiles);
System.out.println("Average speed in miles - "+averageSpeedInMiles);
}
}
