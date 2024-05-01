// 4 way to solve the composationAggregation Example relationship between car and engine?

// class Car
// {
// 	  String brand;
//     String model;
//     String type;
//     double price;
//     int seatingCapacity;
//     Engine obj1= new Engine(120,1.2,"Petrol",16,4);

// Car(String brand , String model, String type, double price , int seatingCapacity )
// {
//   this.brand=brand;
//   this.model=model;
//   this.type=type;
//   this.price=price;
//   this.seatingCapacity=seatingCapacity;
// }
// public void displayCar()
// {
//   System.out.println("**Car Details**");
//   System.out.println();
//   System.out.println("Brand Name : " + this.brand);
//   System.out.println("Model Name : " + this.model);
//   System.out.println("Type of car: " + this.type);
//   System.out.println("pice of car : " + this.price + " rs");
//   System.out.println("seatingCapacity of car : " + this.seatingCapacity);
// }
// }
// class Engine 
// {
// 	double horsePower;
//   double capacity;
//   String engineType;
//   double mileage;
//   int noOfPistons;

//   Engine(double horsePower, double capacity, String engineType , double mileage, int noOfPistons)
// {
//   this.horsePower=horsePower;
//   this.capacity=capacity;
//   this.engineType=engineType;
//   this.mileage=mileage;
//   this.noOfPistons=noOfPistons;
// }
// public void displayEngine()
// {
//  System.out.println();
//  System.out.println("***Engine Details****");
//  System.out.println();
//  System.out.println("Horse power : "+ this.horsePower + " bhp"  );
//  System.out.println("capacity : "+ this.capacity + " Litres");
//  System.out.println("engineType : "+ this.engineType );
//  System.out.println("mileage  : "+ this.mileage + " km/liter ");
//  System.out.println("noOfPistons : "+ this.noOfPistons);
// }
// }
// class CompositionAggregationDriver
// {
//  	public static void main(String[] args) 
//   {
//       Car obj = new Car("TATA","Nexon","suv",900000,5);
//       obj.displayCar();
//       obj.obj1.displayEngine();
//     }	
// }
   




// class Car
// {
//     String brand;
//     String model;
//     String type;
//     double price;
//     int seatingCapacity;
//     Engine obj1;

// Car(String brand , String model, String type, double price , int seatingCapacity,Engine obj1)
// {
//   this.brand=brand;
//   this.model=model;
//   this.type=type;
//   this.price=price;
//   this.seatingCapacity=seatingCapacity;
//   this.obj1=obj1;
// }
// public void displayCar()
// {
//   System.out.println("**Car Details**");
//   System.out.println();
//   System.out.println("Brand Name : " + this.brand);
//   System.out.println("Model Name : " + this.model);
//   System.out.println("Type of car: " + this.type);
//   System.out.println("pice of car : " + this.price + " rs");
//   System.out.println("seatingCapacity of car : " + this.seatingCapacity);
// }
// }
// class Engine 
// {
//   double horsePower;
//   double capacity;
//   String engineType;
//   double mileage;
//   int noOfPistons;

//   Engine(double horsePower, double capacity, String engineType , double mileage, int noOfPistons)
// {
//   this.horsePower=horsePower;
//   this.capacity=capacity;
//   this.engineType=engineType;
//   this.mileage=mileage;
//   this.noOfPistons=noOfPistons;
// }
// public void displayEngine()
// {
//  System.out.println();
//  System.out.println("***Engine Details****");
//  System.out.println();
//  System.out.println("Horse power : "+ this.horsePower + " bhp"  );
//  System.out.println("capacity : "+ this.capacity + " Litres");
//  System.out.println("engineType : "+ this.engineType );
//  System.out.println("mileage  : "+ this.mileage + " km/liter ");
//  System.out.println("noOfPistons : "+ this.noOfPistons);
// }
// }
// class CompositionAggregationDriver
// {
//   public static void main(String[] args) 
//   {
//       Car obj = new Car("TATA","Nexon","suv",900000,5,(new Engine(120,1.2,"petrol",16,4)));
//       obj.displayCar();
//       obj.obj1.displayEngine();
//     } 
// }




// class Car
// {
//     String brand;
//     String model;
//     String type;
//     double price;
//     int seatingCapacity;
//     Engine obj1;

// Car(String brand , String model, String type, double price , int seatingCapacity )
// {
//   this.brand=brand;
//   this.model=model;
//   this.type=type;
//   this.price=price;
//   this.seatingCapacity=seatingCapacity;
//   this.obj1=new Engine(120,1.2,"petrol",16,4);
// }
// public void displayCar()
// {
//   System.out.println("**Car Details**");
//   System.out.println();
//   System.out.println("Brand Name : " + this.brand);
//   System.out.println("Model Name : " + this.model);
//   System.out.println("Type of car: " + this.type);
//   System.out.println("pice of car : " + this.price + " rs");
//   System.out.println("seatingCapacity of car : " + this.seatingCapacity);
// }
// }
// class Engine 
// {
//   double horsePower;
//   double capacity;
//   String engineType;
//   double mileage;
//   int noOfPistons;

//   Engine(double horsePower, double capacity, String engineType , double mileage, int noOfPistons)
// {
//   this.horsePower=horsePower;
//   this.capacity=capacity;
//   this.engineType=engineType;
//   this.mileage=mileage;
//   this.noOfPistons=noOfPistons;
// }
// public void displayEngine()
// {
//  System.out.println();
//  System.out.println("***Engine Details****");
//  System.out.println();
//  System.out.println("Horse power : "+ this.horsePower + " bhp"  );
//  System.out.println("capacity : "+ this.capacity + " Litres");
//  System.out.println("engineType : "+ this.engineType );
//  System.out.println("mileage  : "+ this.mileage + " km/liter ");
//  System.out.println("noOfPistons : "+ this.noOfPistons);
// }
// }
// class CompositionAggregationDriver
// {
//   public static void main(String[] args) 
//   {
//       Car obj = new Car("TATA","Nexon","suv",900000,5);
//       obj.displayCar();
//       obj.obj1.displayEngine();
//     } 
// }



class Car
{
    String brand;
    String model;
    String type;
    double price;
    int seatingCapacity;
    Engine obj1;

Car(String brand , String model, String type, double price , int seatingCapacity,double horsePower, double capacity, String engineType , double mileage, int noOfPistons )
{
  this.brand=brand;
  this.model=model;
  this.type=type;
  this.price=price;
  this.seatingCapacity=seatingCapacity;
  this.obj1=new Engine(horsePower,capacity,engineType,mileage,noOfPistons);
}
public void displayCar()
{
  System.out.println("**Car Details**");
  System.out.println();
  System.out.println("Brand Name : " + this.brand);
  System.out.println("Model Name : " + this.model);
  System.out.println("Type of car: " + this.type);
  System.out.println("pice of car : " + this.price + " rs");
  System.out.println("seatingCapacity of car : " + this.seatingCapacity);
}
}
class Engine 
{
  double horsePower;
  double capacity;
  String engineType;
  double mileage;
  int noOfPistons;

  Engine(double horsePower, double capacity, String engineType , double mileage, int noOfPistons)
{
  this.horsePower=horsePower;
  this.capacity=capacity;
  this.engineType=engineType;
  this.mileage=mileage;
  this.noOfPistons=noOfPistons;
}
public void displayEngine()
{
 System.out.println();
 System.out.println("***Engine Details****");
 System.out.println();
 System.out.println("Horse power : "+ this.horsePower + " bhp"  );
 System.out.println("capacity : "+ this.capacity + " Litres");
 System.out.println("engineType : "+ this.engineType );
 System.out.println("mileage  : "+ this.mileage + " km/liter ");
 System.out.println("noOfPistons : "+ this.noOfPistons);
}
}
class CompositionAggregationDriver
{
  public static void main(String[] args) 
  {
      Car obj = new Car("TATA","Nexon","suv",900000,5,120,1.2,"petrol",16,4);
      obj.displayCar();
      obj.obj1.displayEngine();
    } 
}