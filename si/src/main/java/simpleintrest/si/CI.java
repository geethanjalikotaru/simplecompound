package simpleintrest.si;
import java.lang.Math;
import java.util.*;
public class CI {
	   public float p,r;
	   public int t,n;
       public void inputValues()
       {
    	   System.out.printf("Enter principle amount for compound intrest");
    	   Scanner s=new Scanner(System.in);
    	   p=s.nextFloat();
    	   System.out.printf("Enter time amount");
    	   t=s.nextInt();
    	   System.out.printf("Enter rate of intrest amount");
    	   r=s.nextFloat();
    	   System.out.println("	number of times interest applied per time period");
    	   n=s.nextInt();
       }
       public void compute()
       {
    	   double temp=1+(r/n);
    	   temp=Math.pow(temp, n*t);
    	   temp=temp*p;
    	   System.out.printf("compound intrest is %f",temp);
       }
}
