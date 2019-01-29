package good;

public class EnterpriseUser implements IPremiumUser, IEnterprise {

	@Override
	public String technicalSupport() {
		return "24/7 technical support";
	}

	@Override
	public double premiumSubcription(int years) {
		return ONE_YEAR_SUBSCRIPTION_FEE * years;
	}

}
