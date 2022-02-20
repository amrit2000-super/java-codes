package ISE;

import java.lang.Exception;

public class AgeException extends Exception {
	
	int x;
	AgeException(int x)
	{
		this.x=x;
	}
	
	public String toString()
	{
		return ""+x+" is an invalid age";
	}

}
