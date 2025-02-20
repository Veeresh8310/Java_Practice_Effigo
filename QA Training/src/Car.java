class Car 
{ 
	String color; 
	int year; 
	public Car(String color, String model, int year) 
	{
		this.color = color; 
		this.year = year;
} 
	public void displayDetails() 
{ 
		System.out.println("Car Color: " + color); 
		System.out.println("Year of Manufacture: " + year); 
		}
	
 
	public static void main(String[] args) 
	{
		Car myCar = new Car("Red", "Toyota", 2020); 
		myCar.displayDetails();
		}
	}