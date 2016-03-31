package bill;

public class App 
{
    public static void main( String[] args )
    {
    	getinfo info=new getinfo();
    	make_bill bill= new make_bill(info.getplan(),info.getline(),info.getusage());
    	System.out.println("your total bill is "+bill.total_bill());
    }
}
