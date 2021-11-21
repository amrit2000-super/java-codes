import java.util.*;

class Prime
{
	public static void main(String[] args) {
	    int n,i,flg=0;
	    System.out.println("enter the value of n:");
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
            if(n==2)
            {
               System.out.println("n+" "+"is a prime number");
	    for(i=2;i<=(n/2);i++)
	    {
	        if((i%2)==0)
	        {
	            flg=1;
	            break;
	        }
	    }
	    if(flg==1)
	    {
	        System.out.println(n+" "+"is not a prime number");
	    }
	    else
	    {
	        System.out.println(n+" "+"is a prime number");
	    }
	}
}
