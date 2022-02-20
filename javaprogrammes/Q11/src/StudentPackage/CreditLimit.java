package StudentPackage;

import java.lang.Exception;

public class CreditLimit extends Exception{
	
	int x;
	CreditLimit(int x)
	{
		this.x=x;
	}
	
	public String toString()
	{
		return ""+x+"credits is not allowed";
	}

}
