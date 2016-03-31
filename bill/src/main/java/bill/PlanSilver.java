package bill;

public class PlanSilver implements Plan{
	double basiccost;
	double overchargepermin;
	double additionallinecost;
	double familydiscount;
	public  PlanSilver(){
		basiccost = 29.95;
		additionallinecost=21.50;
		overchargepermin=0.54;
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
