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
			this.index_of_plan = 2
		} else {
			this.index_of_plan = 0;
		}
	}
	/*
	 * 기본요금 리턴
	 */
	public double get_basicbill(){
		return 0;
	}
	/*
	 * 회선별 추가요금 리턴
	 */
	public double get_linebill(){
		return 0;
	}
	/*
	 * 초과사용 요금 리턴
	 */
	public double get_overcharge_for_usage(){
		return 0;
	}
	/*
	 * 가족할인 리턴
	 */
	public double family_discount(){
		return 0;
	}
	/*
	 * 총 금액 리턴
	 */
	public double total_bill(){
		return 0;
	}
}
