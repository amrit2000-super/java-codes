package ResultPackage;

import java.lang.Exception;

public class InvalidSGPA extends Exception {
	
	float x;
	
	InvalidSGPA(float x)
	{
		this.x=x;
	}
	
	public String toString()
	{
		return ""+x+" is invalid";
	}

}
