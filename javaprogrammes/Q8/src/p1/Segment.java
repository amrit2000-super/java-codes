package p1;

public class Segment extends Circle{
	
	double h;
	int radius;
	Segment(int radius,double h)
	{
		super(radius);
		this.h=h;
	}
	
	double area()
	{
		return radius*radius*((radius-h)/radius)-(radius-h)*Math.pow(((2*radius*h)-(h*h)),0.5);
	}

}
