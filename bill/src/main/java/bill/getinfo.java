package bill;

import java.util.*;

public class Getinfo {
	
	private String plan;
	private int line, usage;
	Scanner scan;
	public Getinfo(){
		scan=new Scanner(System.in);
		System.out.print("Input your plan : ");
		Setplan(scan.next());
		System.out.print("Input your number of line : ");
		Setline(scan.nextInt());
		System.out.print("Input your usage : ");
		Setusage(scan.nextInt());
	}

	private void Setplan(String plan){
		this.plan=plan;
	}
	public String Getplan(){
		return plan;
	}
	
	
	private void Setline(int line){
		this.line=line;
	}
	public int Getline(){
		return line;
	}
	
	
	private void Setusage(int usage){
		this.usage=usage;
	}
	public int Getusage(){
		return usage;
	}
	
}
