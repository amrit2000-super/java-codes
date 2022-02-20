package p1;

public abstract class Vehicle {
	
	private int year_of_manufacture;
	
	Vehicle(int year_of_manufacture)
	{
		this.year_of_manufacture=year_of_manufacture;
	}
	
	abstract void getData();
	abstract void putData();
}
