package StudentPackage;

import java.util.*;

public class RegisterStudent implements Student {
	
	Scanner sc=new Scanner(System.in);
	public String name;
	public String branch;
	public int credits[]=new int[4];

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("enter the name of the student:");
		name=sc.next();
	}

	@Override
	public void branch() {
		// TODO Auto-generated method stub
		System.out.println("enter the branch of the student:");
		branch=sc.next();
	}
	
	public void getCredits()
	{
		for(int i=0;i<4;i++)
		{
		System.out.println("enter the no of credits for semester:"+(i+1));
		credits[i]=sc.nextInt();
		try
		{
		if(credits[i]>30)
		{
			throw new CreditLimit(credits[i]);
		}
		}
		catch(CreditLimit e)
		{
			System.out.println(e.toString());
			System.out.println("enter the no of credits for semester:"+(i+1));
			credits[i]=sc.nextInt();
		}
		}
	}
}
