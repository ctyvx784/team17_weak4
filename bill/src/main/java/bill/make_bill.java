package bill;

public class make_bill {
	public make_bill(){
		
	}
	public make_bill(String plan, int line, int usage){
		
	}
	/*
	 * 플랜을 숫자인덱스로 저장 (ex: gold는 1 silver는 2)
	 * 플랜을 String으로 계속 비교하지 않게 하기 위함 
	 */
	private void plan_to_int(){
		
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
