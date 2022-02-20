package ResultPackage;

import StudentPackage.RegisterStudent;
import StudentPackage.cgpaandsgpa;
import StudentPackage.RegisterStudent;

public class Result extends cgpaandsgpa {
	
	public void display()
	{
		for(int i=0;i<4;i++)
		{
			System.out.println("Semester"+(i+1));
			for(int j=0;j<8;j++)
			{
				System.out.println("the grade obtained by the student in subject"+(j+1)+" is:");
				System.out.println(grade[i][j]);
				try
				{
				if(sgpa>10)
				{
					throw new InvalidSGPA(sgpa);
				}
				}catch(InvalidSGPA e)
				{
					System.out.println(e.toString());
				}
			}
		}
	}
}
