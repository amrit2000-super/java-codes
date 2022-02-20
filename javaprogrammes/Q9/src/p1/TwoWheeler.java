package p1;

import java.util.*;

public class TwoWheeler extends Vehicle {
	
	Scanner sc=new Scanner(System.in);
	String name,colour;
	int year_of_manufacture=0;
	TwoWheeler(int year_of_manufacture,String name,String colour)
	{
		super(year_of_manufacture);
		this.name=name;
		this.colour=colour;
	}
	
	  
	 void getData()
	 {
		 System.out.println("enter the vehicle name:");
		  name=sc.next();
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
