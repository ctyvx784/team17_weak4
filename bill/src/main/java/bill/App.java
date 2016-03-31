package bill;

public class App{
	
	private App(){
		
	}
    	public static void main( String[] args ){   	{
   	 	Getinfo info=new Getinfo();
   	 	Makebill bill= new Makebill(info.getPlan(),info.getLine(),info.getUsage());
    		System.out.println("your total bill is "+bill.totalBill());
   	}
}
