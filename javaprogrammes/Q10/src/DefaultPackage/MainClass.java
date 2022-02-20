package DefaultPackage;

import Deatils.Department;
import Deatils.Faculty;
import ISE.AgeException;
import ISE.ISE_Department;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count=0;
		int k=0;
		int k1=0;
		Faculty f[]=new Faculty[5];
		ISE_Department is=new ISE_Department();
		while(true)
		{
			boolean b=false;
			System.out.println("enter the choice:");
			System.out.println("1:enter the faculty details");
			System.out.println("2:print faculty details");
			System.out.println("3:print those faculty names whose years of experience is greater than or equal to 20 years");
			System.out.println("4:print no of designations of the faculty");
			System.out.println("5:exit");
			int choice=sc.nextInt();
			
			
			switch(choice)
			{
			case 1:
				f[count]=new Faculty();
				is.readData(f[count]);
				count++;
				break;
				
			case 2:
				System.out.println("enter the name of the faculty you want:");
				String name2=sc.next();
				for(int i=0;i<count;i++)
				{
					if(f[i].name.equals(name2))
					{
						b=true;
						k=i;
						break;
					}
					if(b==false)
					{
						System.out.println("no faculty found");
					}
					else
					{
						is.readData(f[k]);
					}
				}
				break;
				
			case 3:
				for(int i=0;i<count;i++)
				{
					if(f[i].years_of_experience>20)
					{
						b=true;
						break;
					}
				}
				if(b==false)
				{
					System.out.println("no faculty found");
				}
				else
				{
				System.out.println("the names of the faculty whose years of experience greater than or equal to 20 yrs are:");
				for(int i=0;i<count;i++)
				{
					if(f[i].years_of_experience>20)
					{
						System.out.println(f[i].name);
					}
				}
				}
				break;
				
			case 4:
				System.out.println("enter the name of the faculty you want:");
				String name1=sc.next();
				for(int i=0;i<count;i++)
				{
					if(f[i].name.equals(name1))
					{
						b=true;
						k=i;
						break;
					}
				}
				if(b==false)
				{
					System.out.println("no faculty found");
				}
				else
				{
				is.print_number_designations(f[k]);
				}
				break;
				
				
				default:
					System.exit(0);
					break;
			}
		}
	}
}
