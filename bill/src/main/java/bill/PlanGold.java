package bill;

public class PlanGold implements Plan{
	double basiccost;
	double overchargepermin;
	double additionallinecost;
	double familydiscount;
	public PlanGold(){
		basiccost = 49.95;
		additionallinecost=14.50;
		overchargepermin=0.45;
		familydiscount = 5;
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
