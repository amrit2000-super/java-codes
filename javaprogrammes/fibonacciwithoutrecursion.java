import java.util.*;

class Fib
{
    public static void main(String [] args)
{
     int a,b,n,i,fib;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the value of n:");
     n=sc.nextInt();
     System.out.println("the fibonacci series is :");
     a=0;
     b=1;
     System.out.print(a);
     System.out.print("\t");
     System.out.print(b);
     System.out.print("\t");
     
     for(i=1;i<n-1;i++)
     {
        fib=a+b;
        a=b;
        b=fib;
        System.out.print(fib);
        System.out.print("\t");
     }
     System.out.print("\n");
}
}
