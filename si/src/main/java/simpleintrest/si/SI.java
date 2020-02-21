package simpleintrest.si;

import java.util.Scanner;

public class SI {
	 public float p,r;
	   public int t,n;
     public void inputValues()
     {
  	   System.out.printf("Enter principle amount for simple intrest");
  	   Scanner s=new Scanner(System.in);
  	   p=s.nextFloat();
  	   System.out.printf("Enter time amount");
  	   t=s.nextInt();
  	   System.out.printf("Enter rate of intrest amount");
  	   r=s.nextFloat();
     }
     public void compute()
     {
  	   double temp=(p*t*r)/100;
  	   System.out.printf("simple intrest is %f",temp);
     }
}
