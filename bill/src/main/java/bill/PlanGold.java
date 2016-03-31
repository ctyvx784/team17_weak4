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
	public double GetBasicCost() {
		// TODO Auto-generated method stub
		return basiccost;
	}

	public double GetOverchargeCost() {
		// TODO Auto-generated method stub
		return overchargepermin;
	}

	public double GetAdditionalLineCost() {
		// TODO Auto-generated method stub
		return additionallinecost;
	}

	public double GetFamilyDiscountcost() {
		// TODO Auto-generated method stub
		return familydiscount;
	}
	
}
