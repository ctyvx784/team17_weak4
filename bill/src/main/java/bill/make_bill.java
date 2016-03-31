package bill;

public class make_bill {
	String plan;
	int line;
	int usage;
	plan planinfo;
	
	public make_bill(){
		this.plan = null;
		this.line = 0;
		this.usage = 0;
	}
	public make_bill(String plan, int line, int usage){
		this.plan = plan;
		this.line = line;
		this.usage = usage;
		
		if("Gold".equals(plan) ||"gold".equals("plan") ){
		         planinfo=new plan_gold();
		} else if("Silver".equals(plan) ||"silver".equals(plan)){
			planinfo=new plan_silver();
		}
					            
	}
	
	
	/*
	 * 기본요금 리턴
	 */
	public double get_basicbill(){
		return planinfo.get_basic_cost();
	}
	/*
	 * 회선별 추가요금 리턴
	 */
	public double get_linebill(){
		if(line>3){
			return planinfo.get_additional_line_cost()*2+familiy_discount();
		} else{
			return planinfo.get_additional_line_cost()*(line-1);
		}

	}
	/*
	 * 초과사용 요금 리턴
	 */
	public double get_overcharge_for_usage(){
		if(usage>1000){
		         return (usage-1000)*planinfo.get_overcharge_cost();
		} else{
		         return 0;
		}
	}
	/*
	 * 가족할인 리턴
	 */
	public double family_discount(){
		 return (line-2)*planinfo.get_family_discountcost();
	}
	/*
	 * 총 금액 리턴
	 */
	public double total_bill(){
		return get_basicbill()+get_linebill()+get_overcharge_for_usage();
	}
}
