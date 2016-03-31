package bill;

public class make_bill {
	String plan;
	int line;
	int usage;
	int index_of_plan;
	
	public make_bill(){
		this.plan = null;
		this.line = 0;
		this.usage = 0;
		this.index_of_plan = 0;
	}
	public make_bill(String plan, int line, int usage){
		this.plan = plan;
		this.line = line;
		this.usage = usage;
		plan_to_int(this.plan);
	}
	/*
	 * 플랜을 숫자인덱스로 저장 (ex: gold는 1 silver는 2)
	 * 플랜을 String으로 계속 비교하지 않게 하기 위함 
	 */
	private void plan_to_int(String plan){
		if(plan.equals("Gold") ||plan.equals("gold") ){
			this.index_of_plan = 1;
		} else if(plan.equals("Silver") ||plan.equals("silver")){
			this.index_of_plan = 2;
		} else {
			this.index_of_plan = 0;
		}
	}
	/*
	 * 기본요금 리턴
	 */
	public double get_basicbill(){
		switch(index_of_plan){
		case 1:
			return 49.95;
		case 2:
			return 29.95;
		}
		return 0;
	}
	/*
	 * 회선별 추가요금 리턴
	 */
	public double get_linebill(){
		if(line>=4){
			switch(index_of_plan){
			case 1:
				return 14.5*line+family_discount();
			case 2:
				return 21.5*line+family_discount();
			}
			return 0;
		
		}
		else{
			switch(index_of_plan){
			case 1:
					return 14.5*line;
			case 2:
					return 21.5*line;
			}
			return 0;
		}
	}
	/*
	 * 초과사용 요금 리턴
	 */
	public double get_overcharge_for_usage(){
		switch(index_of_plan){
		case 1:
			if(usage>1000){
				return (usage - 1000)*0.45;
			}
		case 2:
			if(usage>500){
				return (usage-500)*0.54;
			}
		}
		return 0;
	}
	/*
	 * 가족할인 리턴
	 */
	public double family_discount(){
		return (line-2)*5;
	}
	/*
	 * 총 금액 리턴
	 */
	public double total_bill(){
		return get_basicbill()+get_linebill()+get_overcharge_for_usage();
	}
}
