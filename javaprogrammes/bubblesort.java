import java.util.*;

class Sort
{
	public static void main(String[] args) {
		int i,j,temp,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n:");
		n=sc.nextInt();
		int a[]=new int [n];
		System.out.println("enter the elements of array:");
		for(i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
			System.out.println("the elements of the array before sorting are:");
			for(i=0;i<n;i++)
			{
			    	System.out.print(a[i]);
			    	System.out.print("\t");
			}
				System.out.print("\n");
				for(i=0;i<n;i++)
				{
				    for(j=0;j<n-i-1;j++)
				    {
				        if(a[j]>a[j+1])
				        {
				            temp=a[j];
				            a[j]=a[j+1];
				            a[j+1]=temp;
				        }
				    }
				}
				System.out.println("the elements of the array aftewr sorting are:");
				for(i=0;i<n;i++)
				{
				   System.out.print(a[i]);
				   System.out.print("\t");
				}
				System.out.print("\n");
	}
}
