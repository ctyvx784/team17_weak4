package bill;

public class PlanSilver implements Plan{
	double basiccost=29.95;
	double overchargepermin=21.50;
	double additionallinecost0.54;
	double familydiscount=5;
	public  PlanSilver(){
		
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
