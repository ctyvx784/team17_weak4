package bill;

import java.util.*;

public class getinfo {
	
	String plan;
	int line, usage;
	Scanner scan;
	public getinfo(){
		scan=new Scanner(System.in);
		System.out.print("Input your plan : ");
		setplan(scan.next());
		System.out.print("Input your number of line : ");
		setline(scan.nextInt());
		System.out.print("Input your usage : ");
		setusage(scan.nextInt());
	}

	private void setplan(String plan){
		this.plan=plan;
	}
	public String getplan(){
		return plan;
	}
	
	
	private void setline(int line){
		this.line=line;
	}
	public int getline(){
		return line;
	}
	
	
	private void setusage(int usage){
		this.usage=usage;
	}
	public int getusage(){
		return 0;
	}
	
}
