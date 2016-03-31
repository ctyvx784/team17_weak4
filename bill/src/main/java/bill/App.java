package bill;

public class App 
{
	private App(){
		
	}
    	public static void main( String[] args )
   	{
    	
   	 	Getinfo info=new Getinfo();
   	 	Makebill bill= new Makebill(info.Getplan(),info.Getline(),info.Getusage());
    		System.out.println("your total bill is "+bill.total_bill());
   	}
}
