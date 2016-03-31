package bill;

public class PlanSilver implements Plan{
	static final double basiccost=29.95;
	static final double overchargepermin=21.50;
	static final double additionallinecost0.54;
	static final double familydiscount=5;
	static final public  PlanSilver(){
		
	}
	public double getBasicCost() {
		// TODO Auto-generated method stub
		return basiccost;
	}

	public double getOverchargeCost() {
		// TODO Auto-generated method stub
		return overchargepermin;
	}

	public double getAdditionalLineCost() {
		// TODO Auto-generated method stub
		return additionallinecost;
	}

	public double getFamilyDiscountcost() {
		// TODO Auto-generated method stub
		return familydiscount;
	}
	
}
