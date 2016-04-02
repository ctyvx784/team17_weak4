package bill;

import java.util.*;

public class App{
	
	private App(){
		
	}
    	public static void main( String[] args ){   	
   	 	scan=new Scanner(System.in);
		System.out.print("Input your plan : ");
		String plan = scan.next();
		System.out.print("Input your number of line : ");
		int line = scan.nextInt();
		System.out.print("Input your usage : ");
		int usage = scan.nextInt();
   	 	Makebill bill= new Makebill(plan,line,usage);
    		System.out.println("your total bill is "+bill.totalBill());
   	}
}
