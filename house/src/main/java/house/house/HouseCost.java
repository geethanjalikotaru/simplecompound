package house.house;
import java.util.*;
public class HouseCost {
	int ms,totalarea;
     public void inputvalues()
     {
    	 Scanner s= new Scanner(System.in);
    	 System.out.printf("enter material standard");
    	 System.out.printf("1.Standard");
    	 System.out.printf("2.above standard");
    	 System.out.printf("3.high standard ");
    	 System.out.printf("4.high standard and automated");
    	 ms=s.nextInt();
    	 System.out.printf("enter money required per feet");
    	 totalarea=s.nextInt();
     }
     public void compute()
     {
    	 int amt=0;
    	 switch(ms)
    	 {
    	 case 1:amt=1200;
    	 		break;
    	 case 2:amt=1500;
    	 		break;
    	 case 3:amt=1800;
    	 		break;
    	 case 4:amt=2500;
    	 }
    	 amt=amt*totalarea;
    	 System.out.printf("total cost for house construction is %d",amt);
     }
}
