package bill;

public class plan_silver implements plan{
	double basiccost;
	double overchargepermin;
	double additionallinecost;
	double familydiscount;
	public  plan_silver(){
		basiccost = 29.95;
		additionallinecost=21.50;
		overchargepermin=0.54;
		familydiscount = 5;
	}
	public double get_basic_cost() {
		// TODO Auto-generated method stub
		return basiccost;
	}

	public double get_overcharge_cost() {
		// TODO Auto-generated method stub
		return overchargepermin;
	}

	public double get_additional_line_cost() {
		// TODO Auto-generated method stub
		return additionallinecost;
	}

	public double get_family_discountcost() {
		// TODO Auto-generated method stub
		return familydiscount;
	}
	
}
