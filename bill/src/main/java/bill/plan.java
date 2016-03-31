package bill;

public interface Plan {
	public double GetBasicCost();
	public double GetOverchargeCost();
	public double GetAdditionalLineCost();
	public double GetFamilyDiscountcost();
}
