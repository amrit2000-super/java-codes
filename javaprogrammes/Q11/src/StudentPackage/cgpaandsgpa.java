package StudentPackage;

import java.util.*;
public class cgpaandsgpa extends RegisterStudent {
	
	Scanner sc=new Scanner(System.in);
	int credit,credits1;
	public float sgpa=0;
	public float cgpa=0;
	public int marks[][]=new int[4][8];
	public char grade[][]=new char[4][8];
	public int credits2[][]=new int[4][8];
	
	public void collectMarks()
	{
		for(int i=0;i<4;i++)
		{
			System.out.println("semester"+(i+1));
			for(int j=0;j<8;j++)
			{
				System.out.println("enter the marks of the student in subject"+(j+1)+":");
				marks[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<8;j++)
			{
				if(marks[i][j]>=90 && marks[i][j]<=100)
				{
					grade[i][j]='S';
				}
				
				else if(marks[i][j]>=80 && marks[i][j]<90)
				{
					grade[i][j]='A';
				}
				
				else if(marks[i][j]>=70 && marks[i][j]<80)
				{
					grade[i][j]='B';
				}
				
				else if(marks[i][j]>=60 && marks[i][j]<70)
				{
					grade[i][j]='C';
				}
				
				else if(marks[i][j]>=50 && marks[i][j]<60)
				{
					grade[i][j]='D';
				}
				
				else
				{
					grade[i][j]='F';
				}
			}
		}
	}
	
	public void calculate()
	{
		for(int i=0;i<4;i++)
		{
			System.out.println("semester"+(i+1)+":");
			for(int j=0;j<8;j++)
			{
				System.out.println("enter the credits for subject"+(j+1)+":");
				credits2[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<4;i++)
		{
			credit=credits1=0;
			for(int j=0;j<8;j++)
			{
				switch(grade[i][j])
				{
				case 'S':
					credit=credit+credits2[i][j]*10;
					break;
					
				case 'A':
					credit=credit+credits2[i][j]*9;
					break;
					
				case 'B':
					credit=credit+credits2[i][j]*8;
					break;
					
				case 'C':
					credit=credit+credits2[i][j]*7;
					break;
					
				case 'D':
					credit=credit+credits2[i][j]*6;
					break;
					
					default:
						credit=credit+credits2[i][j]*0;
						break;
				}
			}
			credits1=credits1+credit;
			sgpa=(float)((credits1/credits[i]));
			cgpa=cgpa+sgpa;
		}
		cgpa=sgpa/4;
	}
}
