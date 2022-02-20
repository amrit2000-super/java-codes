package p1;

import java.util.*;

public class AreaDetails {

	public static void main(String[] args) {
		int r,a;
		double h;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius of the circle:");
		r=sc.nextInt();
		System.out.println("enter the angle of the sector:");
		a=sc.nextInt();
		System.out.println("enter the length of segment of the circle:");
		h=sc.nextDouble();
		System.out.println();
		
		Circle c=new Circle(r);
		Sector s=new Sector(r,a);
		Segment se=new Segment(r,h);
		
		System.out.println("the area of the circle is:"+c.area());
		System.out.println("the area of the sector is:"+s.area());
		System.out.println("the area of segment is:"+se.area());

	}

}
