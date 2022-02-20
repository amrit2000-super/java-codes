package DefaultPackage;

import ResultPackage.Result;
import StudentPackage.RegisterStudent;
import StudentPackage.cgpaandsgpa;
import StudentPackage.RegisterStudent;

public class MainClass {
	
	public static void main(String []args)
	{
		Result r=new Result();
		r.name();
		r.branch();
		r.getCredits();
		r.collectMarks();
		r.calculate();
		r.display();
		
	}

}
