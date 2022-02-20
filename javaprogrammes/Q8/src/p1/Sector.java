package p1;

import java.lang.Math;

public class Sector extends Circle {
	
	int angle;
	int radius;
	
	Sector(int radius,int angle)
	{
		super(radius);
		this.angle=angle;
	}
	
	double area()
	{
		return 0.5*radius*radius*(angle*Math.PI/180);
	}
}
