package p1;

import java.lang.Math;

public class Circle {
	
	private int radius;
	
	Circle(int radius)
	{
		this.radius=radius;
	}
	
	double area()
	{
		return Math.PI*radius*radius;
	}

}
