package p1;

import java.util.*;

public final class FourWheeler extends Vehicle {
	
	Scanner sc=new Scanner(System.in);
	int year_of_manufacture;
	String name,colour;
	FourWheeler(int year_of_manufacture)
	{
		super(year_of_manufacture);
	}
	
	 void getData()
	 {
		 System.out.println("enter the vehicle name:");
		  name=sc.next();
		 System.out.println("enter the colour of the vehicle:");
		  colour=sc.next();
		 System.out.println("enter the tear of manufacture:");
		 year_of_manufacture=sc.nextInt();
	 }
	 
	 void putData()
	 {
		 System.out.println("the vehicle name is:"+name);
		 System.out.println("the volour of the vehicle is:"+colour);
		 System.out.println("the year of manufacture is"+year_of_manufacture);
	 }

}
