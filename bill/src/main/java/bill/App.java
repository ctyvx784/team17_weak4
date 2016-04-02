package bill;

import java.util.*;

public class App{
	
	private App(){
		
	}
    	public static void main( String[] args ){   	
   	 	private String plan;
   	 	private int line;
   	 	private int usage;
   	 	scan=new Scanner(System.in);
		System.out.print("Input your plan : ");
		plan = scan.next();
		System.out.print("Input your number of line : ");
		line = scan.nextInt();
		System.out.print("Input your usage : ");
		usage = scan.nextInt();
   	 	Makebill bill= new Makebill(plan,line,usage);
    		System.out.println("your total bill is "+bill.totalBill());
   	}
}
