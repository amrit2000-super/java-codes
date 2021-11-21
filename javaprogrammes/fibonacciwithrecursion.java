import java.util.*;

class Fib
{
	public static void main(String[] args) {
		int n,i,x;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n:");
		n=sc.nextInt();
		
		System.out.println("the fibonnaci series is:");
		for(i=0;i<n;i++)
		{
		    System.out.print(fib(i));
		    System.out.print("\t");
		}
		System.out.print("\n");
	}
	 static int fib(int x)
		{
		    if(x<2)
		    {
		        return x;
		    }
		    else{
		        return fib(x-1)+fib(x-2);
		    }
		}
}
