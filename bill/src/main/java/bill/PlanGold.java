package bill;

public class PlanGold implements Plan{
	static final double basiccost=49.95;
	static final double overchargepermin=14.50;
	static final double additionallinecost=0.45;
	static final double familydiscount=5;
	public PlanGold(){
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
