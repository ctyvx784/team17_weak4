package bill;

import java.util.*;

public class Getinfo {
	
	private String plan;
	private int line, usage;
	Scanner scan;
	public Getinfo(){
		scan=new Scanner(System.in);
		System.out.print("Input your plan : ");
		setPlan(scan.next());
		System.out.print("Input your number of line : ");
		setLine(scan.nextInt());
		System.out.print("Input your usage : ");
		setUsage(scan.nextInt());
	}

	private void setPlan(String plan){
		this.plan=plan;
	}
	public String getPlan(){
		return plan;
	}
	
	
	private void setLine(int line){
		this.line=line;
	}
	public int getLine(){
		return line;
	}
	
	
	private void setUsage(int usage){
		this.usage=usage;
	}
	public int getUsage(){
		return usage;
	}
	
}
