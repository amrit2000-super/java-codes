package p1;

import java.util.*;

public class MyTwoWheeler extends TwoWheeler {
	
	int year_of_manufacture;
	Scanner sc=new Scanner(System.in);
	String name,colour;
	MyTwoWheeler(int year_of_manufacture,String name,String colour)
	{
		super(year_of_manufacture,name,colour);
	    System.out.println("enter the colour of your vehicle:");
	    super.colour=sc.next();
	}
}
