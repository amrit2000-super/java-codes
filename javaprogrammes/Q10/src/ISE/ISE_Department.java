package ISE;

import Deatils.Department;
import Deatils.Faculty;
import java.util.*;

public class ISE_Department implements Department {
	Scanner sc=new Scanner(System.in);
	
	Faculty fa[]=new Faculty[5];

	@Override
	public void readData(Faculty f) {
		// TODO Auto-generated method stub
		System.out.println("enter the name of the faculty:");
		f.name=sc.next();
		System.out.println("enter the designation of the faculty:");
		f.designation=sc.next();
		System.out.println("enter the age of the faculty:");
		f.age=sc.nextInt();
		try {
		if(f.age>58)
		{
			throw new AgeException(f.age);
		}
		}catch(AgeException a)
		{
			System.out.println(a.toString());
			System.out.println("enter the age of the faculty:");
			f.age=sc.nextInt();
		}
		System.out.println("enter the years of experience of the faculty:");
		f.years_of_experience=sc.nextInt();
		System.out.println("enter the joining date of the faculty:");
		f.joining_date=sc.next();
		System.out.println("enter the subjects handled by the faculty:");
		f.subjects_handled=sc.next();
	}

	@Override
	public void printData(Faculty f) {
		// TODO Auto-generated method stub
		System.out.println("the name of the faculty is: "+f.name);
		System.out.println("the designation of the faculty:"+f.designation);
		System.out.println("the age of the faculty:"+f.age);
		System.out.println("the years of experience of the faculty:"+f.years_of_experience);
		System.out.println("the joining date of the faculty:"+f.joining_date);
		System.out.println("the subjects handled by the faculty:"+f.subjects_handled);
	}

	@Override
	public void print_number_designations(Faculty f) {
		// TODO Auto-generated method stub
		String arr[]=f.designation.split(",");
		int l=0;
		for(int i=0;i<arr.length;i++)
		{
			l++;
		}
		System.out.println("the no of designations of the faculty is "+l);	
	}

	@Override
	public void number_research_consultancy_projs(Faculty f) {
		// TODO Auto-generated method stub
		
	}

}
